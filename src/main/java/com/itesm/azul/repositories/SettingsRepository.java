package com.itesm.azul.repositories;

import com.itesm.azul.models.Settings;
import com.itesm.azul.models.SettingsId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface SettingsRepository extends
        CrudRepository<Settings, SettingsId>{
}
