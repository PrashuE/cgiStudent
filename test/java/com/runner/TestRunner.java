package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources/features/Facebook.feature"},glue="com.step",monochrome=true)


//@CucumberOptions(features= {"src/test/resources/features/Facebook.feature"},glue="com.step", dryRun=false, monochrome=true,
//snippets=SnippetType.CAMELCASE,plugin= {"usage"})

public class TestRunner {
}
