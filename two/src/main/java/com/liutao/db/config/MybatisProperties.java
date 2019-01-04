package com.liutao.db.config;

import org.apache.ibatis.session.ExecutorType;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(DataSourceConfig.class)
@EnableConfigurationProperties
@ConfigurationProperties(prefix = MybatisProperties.PREFIX)
public class MybatisProperties {
    public static final String PREFIX = "mybatis";

    protected String configLocation;
    protected String mapperLocations;
    protected String mapperScan;
    protected String typeAliasesPackage;

    private ExecutorType executorType = ExecutorType.REUSE;

    public String getConfigLocation() {
        return configLocation;
    }

    public void setConfigLocation(String configLocation) {
        this.configLocation = configLocation;
    }

    public String getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }

    public String getMapperScan() {
        return mapperScan;
    }

    public void setMapperScan(String mapperScan) {
        this.mapperScan = mapperScan;
    }

    public String getTypeAliasesPackage() {
        return typeAliasesPackage;
    }

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        this.typeAliasesPackage = typeAliasesPackage;
    }
    public ExecutorType getExecutorType() {
        return this.executorType;
    }

    public void setExecutorType(ExecutorType executorType) {
        this.executorType = executorType;
    }
}
