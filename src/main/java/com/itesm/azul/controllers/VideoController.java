package com.itesm.azul.controllers;

import com.itesm.azul.models.Video;
import com.itesm.azul.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/video")
public class VideoController {

    @Autowired
    VideoService videoService;
    @GetMapping("/all")
    public List<Video> getAllVideos(){
        return videoService.findAll();
    }
}
