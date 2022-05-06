package com.itesm.azul.dto;

public class SettingsDTO {

    private String manager_id;
    private String version;
    private Integer minimum_time;
    private Integer maximum_time;
    private String video_quality;
    private Integer maximum_size;

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getMinimum_time() {
        return minimum_time;
    }

    public void setMinimum_time(Integer minimum_time) {
        this.minimum_time = minimum_time;
    }

    public Integer getMaximum_time() {
        return maximum_time;
    }

    public void setMaximum_time(Integer maximum_time) {
        this.maximum_time = maximum_time;
    }

    public String getVideo_quality() {
        return video_quality;
    }

    public void setVideo_quality(String video_quality) {
        this.video_quality = video_quality;
    }

    public Integer getMaximum_size() {
        return maximum_size;
    }

    public void setMaximum_size(Integer maximum_size) {
        this.maximum_size = maximum_size;
    }
}
