class View {

	public View(){
	}

	public void appGreeting(){
		System.out.println();
		System.out.println("Howdy! I'm a handy command-line app built by a prospective Thoughtworker. I'll be computing your shopping receipt today.");
		System.out.println();
	}

	public void comeBackWhenReady(){
		System.out.println();
		System.out.println("Cool, come back when you're ready to compute a final sales receipt.");
		System.out.println();
	}

	public void anyItemsToAddInquiry(){
	System.out.println();
	System.out.println( "Do you have an item to add to the shopping basket? Please respond with a 'Yes' OR 'No'");
	// REFACTORED SOLUTION: TO MAINTAIN CONSISTENCY, I WOULD HAVE CHANGED TO: SUBMIT '1' FOR YES OR '2' FOR NO
	System.out.println();
	}

	
	public void invalidPriceSubmission(){
	System.out.println();
	System.out.println("INVALID PRICE FORMAT: That is an invalid response. Be sure to submit your response in a valid price format, i.e., 3.45, 0.67. or 123.89.");
	System.out.println();
	System.out.println("Here's the question again:");
	System.out.println();
	}

	public void invalidSubmission(){
	System.out.println();
	System.out.println("INVALID RESPONSE: That is an invalid response. Be sure to respond in an acceptable format.");
	System.out.println();
	System.out.println("Here's the question again:");
	}


	public void itemInquiry(){
	System.out.println();
	System.out.println("What's the item? ACCEPTABLE FORMAT: '1 picture frame' OR '2 imported dresses' etc.");
	System.out.println();
	}

	public void priceInquiry(){
	System.out.println();
	System.out.println("What's the item's price? Do not include the currency symbol -- just the numeric value in U.S. dollars, i.e., 5.98, 0.99, 22.48, etc.");
	System.out.println();
	}

	public void salesTaxInquiry(){
	System.out.println();
	System.out.println( "Is this item a book, food or medical product? Submit '1' for Yes OR '2' for No");
	System.out.println();
	}

	public void importTaxInquiry(){
	System.out.println();
	System.out.println( "Is this item an imported good? Submit '1' for Yes OR '2' for No");
	System.out.println();
	}

}

