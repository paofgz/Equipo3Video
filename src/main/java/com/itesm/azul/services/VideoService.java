package com.itesm.azul.services;


import com.itesm.azul.dto.VideoDTO;
import com.itesm.azul.models.Video;
import com.itesm.azul.models.VideoId;
import com.itesm.azul.repositories.VideoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    VideoRespository videoRespository;

    // READ
    public Video getOne(VideoId videoId) {
        return videoRespository.findById(videoId).get();
    }
    public boolean existsName(VideoId videoId) {
        return videoRespository.existsById(videoId);
    }

    //READ GET ALL
    public Iterable<Video> lista(){
        return videoRespository.findAll();
    }

}
