package com.StepDef;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class S06Registration {
	@Given("Open rediff registration page")
	public void open_rediff_registration_page() {
		System.out.println("Opening registration page...");
	}

	@When("User enter data as follows")
	public void user_enter_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>>data =  dataTable.asLists();
		
		System.out.println(data);
		
		//System.out.println(data.get(0));
		//System.out.println(data.get(1));
		
		for(List<String> d : data)
			System.out.println(d);
	}

	@Then("registration should successfull")
	public void registration_should_successfull() {
		System.out.println("Registration success!!!");
	}
	
	@When("User enter following data")
	public void user_enter_following_data(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> data = dataTable.asMaps();
	    
	    System.out.println(data);
	    
	    for(Map<String, String> d : data)
	    {
	    	System.out.println("First Name: " + d.get("FirstName"));
	    	System.out.println("Last Name : " + d.get("LastName"));
	    	System.out.println("Mail ID   : " + d.get("MailID"));
	    	System.out.println("Phone No  : " + d.get("PhNo"));
	    }
	}

	@Then("registration should not successfull")
	public void registration_should_not_successfull() {
	    System.out.println("Registration fail!!!");
	}

}
