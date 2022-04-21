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

    //DELETE
    public void delete(String video_name) {videoRespository.deleteById(video_name);}


    }
