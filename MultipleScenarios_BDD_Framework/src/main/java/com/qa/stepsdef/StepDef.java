package com.qa.stepsdef;

import org.junit.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDef {

	@Given("^Precondition to validate Tagone$")
	public void precondition_to_validate_Tagone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Tagone_Given");
		
	}

	@When("^descrption when to validate$")
	public void descrption_when_to_validate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tagone_When");
	}

	@Then("^display the value in the console$")
	public void display_the_value_in_the_console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tagone_Then");
	}

	@Given("^Precondition to validate Tagtwo$")
	public void precondition_to_validate_Tagtwo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tagtwo_Given");
		//Assert.assertEquals(true, false);
	}

	@When("^descrption when to validate tagtwo$")
	public void descrption_when_to_validate_tagtwo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tagtwo_When");
	}

	@Then("^display the value in the console tagtwo$")
	public void display_the_value_in_the_console_tagtwo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tagtwo_Then");
	}

	@Given("^Precondition to validate tagthree$")
	public void precondition_to_validate_tagthree() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tagthree_Given");
	}

	@When("^descrption when to validate tagthree$")
	public void descrption_when_to_validate_tagthree() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tagthree_When");
	}

	@Then("^display the value in the console tagthree$")
	public void display_the_value_in_the_console_tagthree() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tagthree_Then");
	}


}
