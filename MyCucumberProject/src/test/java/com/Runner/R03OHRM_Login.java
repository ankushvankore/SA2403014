package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F03OHRM_Login.feature"}, 
					glue = {"com.StepDef"},
					publish = true)
public class R03OHRM_Login {

}
