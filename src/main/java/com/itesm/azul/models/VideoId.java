package com.itesm.azul.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

public class VideoId {
    private String semester;
    private String video_name;

    public VideoId() {}

    public VideoId(String semester, String video_name) {
        this.semester = semester;
        this.video_name = video_name;
    }

    @DynamoDBHashKey(attributeName = "semester")
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @DynamoDBRangeKey(attributeName = "video_name")
    public String getVideo_name() {
        return video_name;
    }

    public void setVideo_name(String video_name) {
        this.video_name = video_name;
    }
}
