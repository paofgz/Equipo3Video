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

    //DELETE
    @DeleteMapping("/v1/video/{video_name}")
    public ResponseEntity<?> delete(@PathVariable("video_name") String video_name){
        if(!videoService.existsId(video_name)
            return new ResponseEntity("no existe", HttpStatus.NOT_FOUND);
        videoService.delete(video_name);
        return new ResponseEntity<>("persona eliminada", HttpStatus.OK);
    }
}
