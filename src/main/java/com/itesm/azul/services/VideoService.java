package com.itesm.azul.services;


import com.itesm.azul.models.Video;
import com.itesm.azul.repositories.VideoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    VideoRespository videoRespository;

    // READ
    public Video getOne(String video_name) {
        return videoRespository.findById(video_name).get();
    }
    public boolean existsName(String video_name){
        return videoRespository.existsById(video_name);
    }
}
