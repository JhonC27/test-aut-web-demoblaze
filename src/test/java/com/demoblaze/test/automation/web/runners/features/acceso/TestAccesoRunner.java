package com.demoblaze.test.automation.web.runners.features.acceso;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    snippets = CucumberOptions.SnippetType.CAMELCASE,
    features = "src/test/resources/features/acceso/acceso.feature",
    glue = {"com.demoblaze.test.automation.web.stepdefinitions","com.demoblaze.test.automation.web.setups"},
    tags = "@Acceso"
)
public class TestAccesoRunner
{}
