package com.pizug.cpi.mappingtest.config;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Config {
    public String version;
    public List<Connection> connections;

    public Mapping mapping;

}