package org.extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Reports {
	public static ExtentSparkReporter exeSpark = null;
	public static ExtentReports exeRep = null;
	public static ExtentTest exeTest = null;
	public static String reportLocation = 
			System.getProperty("user.dir")+"/reports/test.html";
	
	public static ExtentReports getInstance() {
		if(exeRep == null) {
			return createInstance();
		}
		return exeRep;
	}
	
	public static ExtentReports createInstance() {
		exeSpark = new ExtentSparkReporter(reportLocation);
		exeSpark.config().setDocumentTitle("Aiite_Test");
		exeSpark.config().setTheme(Theme.DARK);
		exeSpark.config().setReportName("Aiite Extent Report");
		exeRep = new ExtentReports();
		exeRep.attachReporter(exeSpark);
		exeRep.setSystemInfo("Environment", "QA");
		exeRep.setSystemInfo("Browser", "Chrome");
		exeRep.setSystemInfo("Client", "Amazon");
		return exeRep;
	}
	
	public static void createTest(String name) {
		exeTest = exeRep.createTest(name);
	}
	
	public static void flushReport() {
		exeRep.flush();
	}

}
