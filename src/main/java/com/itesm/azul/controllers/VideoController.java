package com.itesm.azul.controllers;

import com.itesm.azul.dto.VideoDTO;
import com.itesm.azul.models.Video;
import com.itesm.azul.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    //Update a tuple
    @PutMapping("/v1/video")
    public ResponseEntity<Video> update(@RequestBody VideoDTO videoDTO){
        if(!videoService.existsId(videoDTO.getVideo_name()))
            return new ResponseEntity("no existe, no se puede actualizar", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(videoService.update(videoDTO));
    }
}
