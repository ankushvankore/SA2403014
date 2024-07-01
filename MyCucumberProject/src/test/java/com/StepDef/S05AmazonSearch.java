package com.StepDef;

import io.cucumber.java.en.*;

public class S05AmazonSearch {
	@Given("Open Amazon")
	public void open_amazon() {
	    System.out.println("Opening amazon...");
	}

	@When("I search for {string} with price {int}")
	public void i_search_for_with_price(String product, Integer price) {
	    System.out.println("Searching for: " + product + " with price: " + price);
	}

	@Then("I should get product {string} with price {int}")
	public void i_should_get_product_with_price(String product, Integer price) {
		 System.out.println("Displaying result for: " + product + " with price: " + price);
	}
}
