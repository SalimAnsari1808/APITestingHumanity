package com.api.baseClass;

import com.api.dataProvider.ConfigReader;
import com.api.modelEngine.EndPoints;

public class TestContext {
	
	private EndPoints endPoints;
	private ScenarioContext scenarioContext;
	
	public TestContext() {
		endPoints = new EndPoints(ConfigReader.getInstance().getBaseUrl());
		scenarioContext = new ScenarioContext();
	}
	
	public EndPoints getEndPoints() {
		return endPoints;
	}
	
	 public ScenarioContext getScenarioContext() {
		 return scenarioContext;
	 }

}
