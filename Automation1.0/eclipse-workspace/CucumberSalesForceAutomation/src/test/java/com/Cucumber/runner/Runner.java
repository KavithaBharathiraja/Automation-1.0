package com.Cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/kavithabharathiraja/eclipse-workspace/CucumberSalesForceAutomation/Features/SalesForce.feature",
		glue= {"com.Cucumber.steps"},
		plugin= {"pretty","html:target/cucumber-reports/cucumber.html",
		                   "json:target/cucumber-reports/cucumber.json"	})


public class Runner {

}
