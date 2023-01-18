package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
	
	
	@Before("@smoke")
	public void beforeHook()
	{
		System.out.println("Before hook");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before step");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step");
	}
	

	@Before("@regression")
	public void beforeHook1()
	{
		System.out.println("Before hook1");
	}
	
	@After("@regression")
	public void afterHook1()
	{
		System.out.println("After hook1");
	}
	
	
	@After("@regression")
	public void afterHook()
	{
		System.out.println("After hook");
	}

}
