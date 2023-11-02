package com.tryCloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",

        },
        features = "src/test/resources/features",
        glue = "com/tryCloud/step_definitions",
        dryRun = true,
        tags = "@B30G11-125",
        publish = true //generating a report with public link
)
public class CukesRunner {}

