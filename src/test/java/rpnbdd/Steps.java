package rpnbdd;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	 Area area;
	 int input;
	
	 @Given("I have area class")
	 public void iHaveAreaClass() {
		 area = new Area();
	     // Write code here that turns the phrase above into concrete actions
	     //throw new cucumber.api.PendingException();
	 }

	@When("I give input as {int}")
	public void iGiveInputAs(Integer int1) {
		this.input = int1;
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("I get output as {int}")
	public void iGetOutputAs(Integer int1) {
		int result = area.findArea(this.input);
		assertEquals(int1,result,0.0001);	
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	}


