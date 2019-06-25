package com.spartaglobal.cucumberminiproject;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"automation", "html:reports"}
)

public class JunitRunner {

}

