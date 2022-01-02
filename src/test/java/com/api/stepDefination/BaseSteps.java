package com.api.stepDefination;

import com.api.baseClass.ScenarioContext;
import com.api.baseClass.TestContext;
import com.api.modelEngine.EndPoints;

public class BaseSteps {

	private EndPoints endPoints;
	private ScenarioContext scenarioContext;

	
	public BaseSteps(TestContext testContext) {
		endPoints = testContext.getEndPoints();
		scenarioContext = testContext.getScenarioContext();
	}
	
	public EndPoints getEndPoints() {
		return endPoints;
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
}
