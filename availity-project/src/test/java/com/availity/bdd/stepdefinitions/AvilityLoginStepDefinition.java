package com.availity.bdd.stepdefinitions;

import com.availity.bdd.steps.NavigateTo;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvilityLoginStepDefinition {

    private final Logger LOG = LoggerFactory.getLogger(AvilityLoginStepDefinition.class);

    @Steps
    NavigateTo avilityLoginSteps;

    @Given("^user is on Avality home page$")
    public void i_am_on_the_avility_home_page() {
        LOG.info("Launch Avility Home Page");
        avilityLoginSteps.theAvilityLoginPage();
    }
}
