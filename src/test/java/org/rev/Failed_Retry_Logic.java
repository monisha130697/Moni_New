package org.rev;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed_Retry_Logic implements IRetryAnalyzer{
	int min = 1, max=5;
	@Override
	public boolean retry(ITestResult result) {
		
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}

}
