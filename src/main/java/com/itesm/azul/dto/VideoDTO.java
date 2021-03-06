package com.itesm.azul.dto;

import java.util.Set;

public class VideoDTO {
    private String video_name;
    private String semester;
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

    public String getVideo_name() {
        return video_name;
    }

    public void setVideo_name(String video_name) {
        this.video_name = video_name;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getAgent_lastname() {
        return agent_lastname;
    }

    public void setAgent_lastname(String agent_lastname) {
        this.agent_lastname = agent_lastname;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCall_reason() {
        return call_reason;
    }

    public void setCall_reason(String call_reason) {
        this.call_reason = call_reason;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public Set<Integer> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Integer> permissions) {
        this.permissions = permissions;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getLocation_path() {
        return location_path;
    }

    public void setLocation_path(String location_path) {
        this.location_path = location_path;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
