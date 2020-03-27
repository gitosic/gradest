package com.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.example",
        features = "src/test/resources/features",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        strict = true

)
public class RunCucumberTest {
    @BeforeClass
    public static void beforeSteps(){
        System.out.println("Steps before starting");
    }

    @AfterClass
    public static void afterSteps(){
        System.out.println("Steps after starting");
    }
}