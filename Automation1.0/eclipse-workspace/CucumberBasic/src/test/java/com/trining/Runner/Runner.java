package com.trining.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="//Users//kavithabharathiraja//eclipse-workspace//CucumberBasic//features/AccountPage.feature",
                 glue= {"com.training.steps"},
                 plugin = {"pretty","html:target/Cucumber-reports/Cucumber.html",
                		            "json:target/Cucumber-reports/Cucumber.json",}  
		)

public class Runner {

	
}
