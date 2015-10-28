package edu.esprit.greeter.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import edu.esprit.greeter.Greeter;

public class GreederTest {
	
	Greeter greeter;
	
	@Before
	public void setUp(){
		
		greeter = new Greeter();
	}
	
	@Test 
	public void itShouldSayHello(){
		
		 
		
		String result = greeter.sayHello("world");
		
		Assert.assertEquals("Hello world", result);
	}
	
	@Test(expected = IllegalArgumentException.class) /* Le test doit réussir lorsqu'il lève cette exception*/
	public void itShouldRaiseException(){
		
		String param= "MAN";
		greeter.sayHello(param);
	}
	
	@After
	public void tearDown(){
		greeter= null;
	}

}
