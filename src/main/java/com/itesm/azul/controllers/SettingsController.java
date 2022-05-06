package com.itesm.azul.controllers;

import com.itesm.azul.dto.SettingsDTO;
import com.itesm.azul.models.Settings;
import com.itesm.azul.models.SettingsId;
import com.itesm.azul.services.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/settings")
public class SettingsController {

    @Autowired
    SettingsService settingsService;

    //CREATE SETTINGS
    @PostMapping("/save")
    public SettingsDTO save(@RequestBody SettingsDTO settingsDTO) throws Exception{
        settingsService.createSetting(settingsDTO);
        return settingsDTO;
    }

    //GET ONE SETTING BY VERSION
    @GetMapping("/{manager_id}/{version}")
    public ResponseEntity<Settings> getOne(@PathVariable("manager_id") String manager_id, @PathVariable("version") String version) {
        if (!settingsService.existsVersion(new SettingsId(manager_id, version))) {
            return new ResponseEntity("No existe la configuracion", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(settingsService.getOne(new SettingsId(manager_id, version)));
    }

    //READ GET ALL
    @GetMapping("/all")
    public ResponseEntity<Iterable<Settings>> getAll() {
        return ResponseEntity.ok(settingsService.all());
    }

    //UPDATE A TUPLE
    @PutMapping("/update")
    public ResponseEntity<Settings> update(@RequestBody SettingsDTO settingsDTO){
        if(!settingsService.existsVersion(new SettingsId(settingsDTO.getManager_id(), settingsDTO.getVersion())))
        {
            return new ResponseEntity("no existe, no se puede actualizar", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(settingsService.update(settingsDTO));
    }

    //DELETE A TUPLE
    @DeleteMapping("delete/{manager_id}/{version}")
    public ResponseEntity<Settings> delete(@PathVariable("manager_id") String manager_id, @PathVariable("version") String version){
        SettingsId settingsId = new SettingsId(manager_id, version);
        if(!settingsService.existsVersion(settingsId)){
            return new ResponseEntity("no existe, no se puede eliminar", HttpStatus.NOT_FOUND);
        }
        settingsService.delete(settingsId);
        return new ResponseEntity("Configuracion eliminada", HttpStatus.OK);
    }
}
