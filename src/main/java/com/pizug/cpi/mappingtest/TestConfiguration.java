package com.pizug.cpi.mappingtest;

import java.util.ArrayList;
import java.util.List;

import com.pizug.cpi.mappingtest.config.Config;

public class TestConfiguration {
    public TestConfiguration parent = null;
    public Config effectiveConfig;
    public List<TestCase> testCases = new ArrayList<TestCase>();
}