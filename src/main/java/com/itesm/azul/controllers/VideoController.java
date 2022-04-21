package com.itesm.azul.controllers;

import com.itesm.azul.dto.VideoDTO;
import com.itesm.azul.models.Video;
import com.itesm.azul.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    @PostMapping("/save")
    public VideoDTO save(@RequestBody VideoDTO video) throws Exception{
        videoService.createVideo(video);
        return video;
    }
}
