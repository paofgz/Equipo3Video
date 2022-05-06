package com.itesm.azul.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

public class SettingsId {

    private String manager_id;
    private String version;

    public SettingsId() {}

    public SettingsId(String manager_id, String version) {
        this.manager_id = manager_id;
        this.version = version;
    }

    @DynamoDBHashKey(attributeName = "manager_id")
    public String getManager_id() {return manager_id;}

    public void setManager_id(String manager_id) {this.manager_id = manager_id;}

    @DynamoDBRangeKey(attributeName = "version")
    public String getVersion() {return version;}

    public void setVersion(String version) { this.version = version;}
}
