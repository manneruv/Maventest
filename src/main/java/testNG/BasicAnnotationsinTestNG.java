package testNG;

import org.testng.annotations.BeforeTest;

public class BasicAnnotationsinTestNG {
  @BeforeTest
  public void test1() {
	  
	System.out.println("you are in beforetest class"); 
	
  }
  public void class() {
	  
		System.out.println("you are in beforetest class"); 
	  }

public void Method() {
	  
	System.out.println("you are in beforetest Method"); 
  }

@Test
public void Method() {
	  
	System.out.println("you are in beforetest Method"); 
  }
@AfterTest
public void test1() {
	  
	System.out.println("you are in beforetest class"); 
	
  }

  public void class() {
	  
		System.out.println("you are in beforetest class"); 
	  }

public void Method() {
	  
	System.out.println("you are in beforetest Method"); 