package com.pizug.cpi.mappingtest;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.pizug.cpi.mappingtest.config.Config;
import com.pizug.cpi.mappingtest.config.Connection;

public class TestConfiguration {
    public TestConfiguration parent = null;
    public Path directory;
    public Config effectiveConfig;
    public List<TestCase> testCases = new ArrayList<TestCase>();

    public Connection effectiveConnection;
    public String password;
}