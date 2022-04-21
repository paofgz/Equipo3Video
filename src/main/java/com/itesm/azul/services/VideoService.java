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

    public Video update(VideoDTO dto){
        Video video =videoRespository.findById(dto.getVideo_name()).get();
        video.setVideo_name(dto.getVideo_name());
        video.setClient_id(dto.getClient_id());
        video.setNumber(dto.getNumber());
        video.setAgent_name(dto.getAgent_name());
        video.setAgent_lastname(dto.getAgent_lastname());
        video.setUser_name(dto.getUser_name());
        video.setCreated_at(dto.getCreated_at());
        video.setUpdated_at(dto.getUpdated_at());
        video.setCall_reason(dto.getCall_reason());
        video.setDuration(dto.getDuration());
        video.setPermissions(dto.getPermissions());
        video.setTags(dto.getTags());
        video.setLocation_path(dto.getLocation_path());
        return videoRespository.save(video);
    }

}
