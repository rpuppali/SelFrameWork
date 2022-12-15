package com.learnautomation.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./Reports/report1.html");
	
	public void getReport() {
	extent.attachReporter(sparkReporter);
	extent.flush();
	} 
	

}
