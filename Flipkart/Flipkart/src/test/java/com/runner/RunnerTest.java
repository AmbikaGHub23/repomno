package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"src/test/java/com/featurefile"},
                  glue = {"com.stepdefinition"},
                  snippets = SnippetType.CAMELCASE,
                  publish = true,
                  dryRun = false,
                  monochrome = true,
                  stepNotifications = true
                  
		)
public class RunnerTest {

}
