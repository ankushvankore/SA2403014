package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F05AmazonSearch.feature"},
					glue = {"com.StepDef", "com.ForHooks"})
public class R05AmazonSearch {

}
