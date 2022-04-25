package com.itesm.azul.controllers;

import com.itesm.azul.dto.VideoDTO;
import com.itesm.azul.models.Video;
import com.itesm.azul.models.VideoId;
import com.itesm.azul.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/video")
public class VideoController {

    @Autowired
    VideoService videoService;

    // CREATE VIDEO
    @PostMapping("/save")
    public VideoDTO save(@RequestBody VideoDTO video) throws Exception{
        videoService.createVideo(video);
        return video;
    }

    // Get one video by name
    @GetMapping("/{semester}/{video_name}")
    public ResponseEntity<Video> getOne(@PathVariable("semester") String semester, @PathVariable("video_name") String video_name) {
        if (!videoService.existsName(new VideoId(semester, video_name))) {
            return new ResponseEntity("No existe el video", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(videoService.getOne(new VideoId(semester, video_name)));
    }

    //READ GET ALL
    @GetMapping("/all")
    public ResponseEntity<Iterable<Video>> getAll() {
        return ResponseEntity.ok(videoService.lista());
    }

}
