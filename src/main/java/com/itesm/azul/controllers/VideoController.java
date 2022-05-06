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

    //Update a tuple
    @PutMapping("/update")
    public ResponseEntity<Video> update(@RequestBody VideoDTO videoDTO){
        if(!videoService.existsName(new VideoId(videoDTO.getSemester(), videoDTO.getVideo_name())))
        {
            return new ResponseEntity("no existe, no se puede actualizar", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(videoService.update(videoDTO));
    }

    //Delete a tuple
    @DeleteMapping("delete/{semester}/{video_name}")
    public ResponseEntity<Video> delete(@PathVariable("semester") String semester, @PathVariable("video_name") String video_name){
        VideoId videoId = new VideoId(semester, video_name);
        if(!videoService.existsName(videoId)){
            return new ResponseEntity("no existe, no se puede eliminar", HttpStatus.NOT_FOUND);
        }
        videoService.delete(videoId);
        return new ResponseEntity("video eliminado", HttpStatus.OK);
    }



}
