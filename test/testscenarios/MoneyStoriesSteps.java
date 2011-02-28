package testscenarios;

import static org.jbehave.Ensure.ensureThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.is;


import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.steps.Steps;

import atm.utils.Money;


public class MoneyStoriesSteps extends Steps {

	private Money purse;
	private Money secondPurse;
	
	@Given("I have a Money element with '$eurosNbr' euros in it")
	public void iHaveAMoneyElement(int eurosNbr){
		purse = new Money(eurosNbr);
	}
	
	@Then("it should contain '$eurocentsNbr' euro cents")
	public void shouldContainEuroCents(int eurocentsNbr){
		ensureThat(purse.cents(), is(equalTo(eurocentsNbr)));
	}
	
	@When("I have another Money element with '$eurosNbr' euros in it")
	public void iHaveAnotherMoneyElement(int eurosNbr){
		secondPurse = new Money(eurosNbr);
	}
	
	@Then("the first element should have less cents than the second")
	public void firstPurseShouldHaveLessCents(){
		ensureThat(purse.cents(), is(lessThan(secondPurse.cents())));
	}
	
}
