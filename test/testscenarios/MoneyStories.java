package testscenarios;

import org.jbehave.scenario.Scenario;

public class MoneyStories extends Scenario{
	public MoneyStories(){
		super(new MoneyStoriesSteps());
	}
}
