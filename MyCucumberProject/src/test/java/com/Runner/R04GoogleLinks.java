package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/MyCucumberProject/MyCucumberProject/F04GoogleLinks.feature"},
					glue = {"com.StepDef"},
					tags = "@GoogleLinks")
public class R04GoogleLinks {
	
	/*
	 * Execute single Scenario  	tags = "@ImagesLink" 
	 * Execute Multiple Scenarios	tags = "@ImagesLink or @AdvtLink"
	 * Skip single Scenario 		tags = "not @AdvtLink"
	 * Execute all scenarios		tags = "@GoogleLinks"
	 */

}
