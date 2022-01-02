package com.api.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

//import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;


@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
		jsonReport = "target/cucumber-json.json",//Contains path to standard Cucumber JSON results output
		jsonUsageReport = "target/cucumber-usage.json",//Contains path to standard Cucumber usage report
		outputFolder  = "target/DATE(MM-dd-yyyy)", //Contains path to output folder where all reports will be written to
		reportPrefix = "Humanity-DATE(HH-mm-ss)",//Common file prefix which will be used for all generated output files
		usageReport = true,//Enables/disables usage report
		detailedReport = true, //Enables/disables detailed report
		detailedAggregatedReport = true,//Enables/disables detailed results aggregation. Important if failed tests re-run is enabled
		//overviewReport = true,//Enables/disables overview report
		//featureOverviewChart = true,//Enables/disables feature overview chart
		//overviewChartsReport = true,//Enables/disables overview charts report
		//coverageReport = true,//Enables/disables coverage report
		//includeCoverageTags = {"@passed" },//Used to define which tags are to be included in coverage report.
		//excludeCoverageTags = {"@flaky" },//Used to define which tags are to be excluded from coverage report.
		//breakdownReport = false,//Enables/disables breakdown report
		//breakdownConfig = "",//Path to the configuration file for breakdown report. Mandatory if this report is enabled.
		//featureMapReport = false,//Enables/disables feature map report
		//featureMapConfig = "",//Path to the configuration file for feature map report. Mandatory if this report is enabled.
		//knownErrorsReport = false,//Enables/disables known errors report
		//knownErrorsConfig = "",//Path to the configuration file for known errors report. Mandatory if this report is enabled.
		//consolidatedReport = false,//Enables/disables consolidated report
		//consolidatedReportConfig = "",//Path to the configuration file for consolidated report. Mandatory if this report is enabled.
		//screenShotSize = "",//Defines the size of screenshots in the report. It should be a string similar to the one which is used in width attribute of the img HTML tag. Examples: 300px, 50%
		toPDF = true,//	Enables/disables PDF export
		pdfPageSize = "auto",//Defines the page size of exported PDF like "A4 Landscape"
        retryCount = 0//value in integer. Defines the number of failed tests re-run
        //threadsCount = 1,//value in integer. Defines the number of threads to run in parallel
        //threadsCountValue = ""//Defines the system property name containing the number of threads to run in parallel
        )
@CucumberOptions(
		plugin = { "html:target/cucumber-html-report",
                   "json:target/cucumber-json.json", 
                   "pretty:target/cucumber-pretty.txt",
                   "usage:target/cucumber-usage.json",
                   "junit:target/cucumber-junit.xml",
                   "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        features =  {"classpath:com/api/functionalTest/Account",
        			 "classpath:com/api/functionalTest/Designer",
        			 "classpath:com/api/functionalTest/Payment",
        			 "classpath:com/api/functionalTest/Transactional"} ,
        glue = {"classpath:com/api/stepDefination"},
        monochrome=true,
        tags = {"@CancelSubscription"},
        dryRun = false)
public class TestRunner {

	@AfterClass
	public static void writeExtentReport() throws Exception  {
		
		//Reporter.loadXMLConfig(System.getProperty("user.dir") + "/src/mai/resources/com/api/config/extent-config.xml");
		
		//ExcelUtil.copyWorkbook();
	}
}