package com.itesm.azul.services;


import com.itesm.azul.dto.SettingsDTO;
import com.itesm.azul.models.Settings;
import com.itesm.azul.models.SettingsId;
import com.itesm.azul.repositories.SettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsService {
    @Autowired
    SettingsRepository settingsRepository;

    //SAVE
    public void createSetting(final SettingsDTO settingsDTO){
        Settings s = new Settings();
        s.setManager_id(settingsDTO.getManager_id());
        s.setVersion(settingsDTO.getVersion());
        s.setMinimum_time(settingsDTO.getMinimum_time());
        s.setMaximum_time(settingsDTO.getMaximum_time());
        s.setVideo_quality(settingsDTO.getVideo_quality());
        s.setMaximum_size(settingsDTO.getMaximum_size());
        settingsRepository.save(s);
    }

    //READ
    public Settings getOne(SettingsId settingsId) {
        return settingsRepository.findById(settingsId).get();
    }
    public boolean existsVersion(SettingsId settingsId) {return settingsRepository.existsById(settingsId);}

    //READ GET ALL
    public Iterable<Settings> all() {return settingsRepository.findAll();}

    //UPDATE
    public Settings update(SettingsDTO settingsDTO){
        SettingsId sid = new SettingsId(settingsDTO.getManager_id(), settingsDTO.getVersion());
        Settings s = settingsRepository.findById(sid).get();
        s.setMinimum_time(settingsDTO.getMinimum_time());
        s.setMaximum_time(settingsDTO.getMaximum_time());
        s.setVideo_quality(settingsDTO.getVideo_quality());
        s.setMaximum_size(settingsDTO.getMaximum_size());
        return settingsRepository.save(s);
    }

    //DELETE
    public void delete(SettingsId settingsId) { settingsRepository.deleteById(settingsId);}
}
