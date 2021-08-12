package org.Test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({Junit1.class,Junit2.class})
public class Junitjoin {
public static void main(String[] args) {
	Result R=JUnitCore.runClasses(Junit1.class,Junit2.class);
	System.out.println("Runcount:"+R.getRunCount());
	System.out.println("Ignorecout:"+R.getIgnoreCount());
	System.out.println("Runtime:"+R.getRunTime());
	System.out.println("Failurecount:"+R.getFailureCount());
	System.out.println("WasSuccessful"+R.wasSuccessful());
	
	List<Failure> failures =R.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);
	}
}
}
