package com.itesm.azul.services;


import com.itesm.azul.dto.VideoDTO;
import com.itesm.azul.models.Video;
import com.itesm.azul.repositories.VideoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    VideoRespository videoRespository;

    // SAVE
    public void createVideo(final VideoDTO video){
        Video v = new Video();
        v.setSemester(video.getSemester());
        v.setVideo_name(video.getVideo_name());
        v.setAgent_name(video.getAgent_name());
        v.setAgent_lastname(video.getAgent_lastname());
        v.setUser_name(video.getUser_name());
        v.setCreated_at(video.getCreated_at());
        v.setUpdated_at(video.getUpdated_at());
        v.setCall_reason(video.getCall_reason());
        v.setDuration(video.getDuration());
        v.setPermissions(video.getPermissions());
        v.setTags(video.getTags());
        v.setLocation_path(video.getLocation_path());
        videoRespository.save(v);
    }

    // READ
    public Video getOne(String video_name) {
        return videoRespository.findById(video_name).get();
    }
    public boolean existsName(String video_name) {
        return videoRespository.existsById(video_name);
    }



    //READ GET ALL
    public Iterable<Video> lista(){
        return videoRespository.findAll();
    }

}
