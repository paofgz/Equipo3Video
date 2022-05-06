package com.itesm.azul.models;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import org.springframework.data.annotation.Id;

@DynamoDBTable(tableName = "Settings")
public class Settings {
    @Id
    private SettingsId settingsId;

    private Integer minimum_time;
    private Integer maximum_time;
    private String video_quality;
    private Integer maximum_size;

    public Settings(){}

    public Settings(SettingsId settingsId) {
        this.settingsId = settingsId;
    }

    @DynamoDBHashKey(attributeName = "manager_id")
    public String getManager_id() {return settingsId != null ? settingsId.getManager_id() : null;}

    public void setManager_id(String manager_id) {
        if (settingsId == null) {
            settingsId = new SettingsId();
        }
        settingsId.setManager_id(manager_id);
    }

    @DynamoDBRangeKey(attributeName = "version")
    public String getVersion() {return settingsId != null ? settingsId.getVersion() : null; }

    public void setVersion(String version) {
        if (settingsId == null) {
            settingsId = new SettingsId();
        }
        settingsId.setVersion(version);
    }

    @DynamoDBAttribute
    public Integer getMinimum_time() {return minimum_time;}

    @DynamoDBAttribute
    public Integer getMaximum_time() {return maximum_time;}

    @DynamoDBAttribute
    public String getVideo_quality() {return video_quality;}

    @DynamoDBAttribute
    public Integer getMaximum_size() {return maximum_size;}

    public void setMinimum_time(Integer minimum_time) {
        this.minimum_time = minimum_time;
    }

    public void setMaximum_time(Integer maximum_time) {
        this.maximum_time = maximum_time;
    }

    public void setVideo_quality(String video_quality) {
        this.video_quality = video_quality;
    }

    public void setMaximum_size(Integer maximum_size) {
        this.maximum_size = maximum_size;
    }
}
