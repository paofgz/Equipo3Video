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

    //Update
    public Video update(VideoDTO dto){
        VideoId vid = new VideoId(dto.getSemester(), dto.getVideo_name());
        Video v = videoRespository.findById(vid).get();
        v.setAgent_name(dto.getAgent_name());
        v.setAgent_lastname(dto.getAgent_lastname());
        v.setUser_name(dto.getUser_name());
        v.setCreated_at(dto.getCreated_at());
        v.setUpdated_at(dto.getUpdated_at());
        v.setCall_reason(dto.getCall_reason());
        v.setDuration(dto.getDuration());
        v.setPermissions(dto.getPermissions());
        v.setTags(dto.getTags());
        v.setLocation_path(dto.getLocation_path());
        return videoRespository.save(v);
    }

    //Delete
    public void delete(VideoId videoId){
        videoRespository.deleteById(videoId);
    }

}
