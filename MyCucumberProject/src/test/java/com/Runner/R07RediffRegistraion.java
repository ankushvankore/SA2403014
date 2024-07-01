package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F07RediffRegistration.feature"},
					glue = {"com.StepDef"},
					plugin = {"json:Reports/Cucumber-json.json", "junit:Reports/xmlReport.xml"})
public class R07RediffRegistraion {

}
