package com.itesm.azul.dto;

import java.util.Set;

public class VideoDTO {
    private String client_id;
    private String video_name;
    private Integer number;
    private String agent_name;
    private String agent_lastname;
    private String user_name;
    private String created_at;
    private String updated_at;
    private String call_reason;
    private Float duration;
    private Set<Integer> permissions;
    private Set<String> tags;
    private String location_path;

    public String getClient_id() { return client_id; }
    public void setClient_id(String client_id) { this.client_id = client_id}
}
