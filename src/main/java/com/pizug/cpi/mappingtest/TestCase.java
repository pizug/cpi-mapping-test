package com.pizug.cpi.mappingtest;

import java.nio.file.Path;

public class TestCase {
    public Path directory;
    public Path inputBody;
    public Path inputHeader;
    public Path expected;
    public String expectedExtension = "txt";
    public ExpectedType expectedType = ExpectedType.UNSUPPORTED;

    public Boolean isSuccessful;
    public String diffText;
}