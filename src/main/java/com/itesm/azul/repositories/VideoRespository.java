package com.itesm.azul.repositories;


import com.itesm.azul.models.Video;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableScan
public interface VideoRespository extends
    CrudRepository<Video, String>{

    }
}
