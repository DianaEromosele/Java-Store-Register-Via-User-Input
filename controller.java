import java.util.*;
import java.util.Scanner;
import java.math.BigDecimal;

class Controller {
	public static void main(String[] args){


		View view = new View();
		Receipt receipt = new Receipt();
		Scanner scanner = new Scanner(System.in);
		String yes = "yes";
		String no = "no";
		

		view.appGreeting();
		view.anyItemsToAddInquiry();
		String userInput = scanner.next().toLowerCase().trim();
			while ( !userInput.equals(yes) && !userInput.equals(no)) {
				view.invalidSubmission();
				view.anyItemsToAddInquiry();
				userInput = scanner.next().toLowerCase();
			};

		if (userInput.equals(no)) {
			view.comeBackWhenReady();
		} else {
				while (userInput.equals(yes)){

					view.itemInquiry();
					String firstLine = scanner.nextLine();
					String itemDescription = scanner.nextLine();

					view.priceInquiry();
					String priceAsString = scanner.nextLine();
						while (!receipt.validPriceFormat(priceAsString).equals(true)) {
								view.invalidPriceSubmission();
								view.priceInquiry();
								priceAsString = scanner.next();
							}

					view.salesTaxInquiry();
					String salesTaxResponse = scanner.next();
						while (!salesTaxResponse.equals("1") && !salesTaxResponse.equals("2")) {
							view.invalidSubmission();
							view.salesTaxInquiry();
							salesTaxResponse = scanner.nextLine();
						}

					view.importTaxInquiry();
					String importTaxResponse = scanner.next();
						while (!importTaxResponse.equals("1") && !importTaxResponse.equals("2")) {
							view.invalidSubmission();
							view.importTaxInquiry();
							importTaxResponse = scanner.nextLine();
						}

					Double itemPrice = Double.parseDouble(priceAsString);

					TaxExemptItem taxExemptItem = new TaxExemptItem(itemDescription, itemPrice);
					TaxableItem taxableItem = new TaxableItem(itemDescription, itemPrice);
					ImportedItem importedItem = new ImportedItem(itemDescription, itemPrice);

					BigDecimal salesTax;

					if (salesTaxResponse.equals("1") && importTaxResponse.equals("1")) {
						salesTax = taxExemptItem.getSalesTax().add(importedItem.getSalesTax());
					} else if (salesTaxResponse.equals("1") && importTaxResponse.equals("2")) {
						salesTax = taxExemptItem.getSalesTax();
					} else if (salesTaxResponse.equals("2") && importTaxResponse.equals("1")) {
						salesTax = taxableItem.getSalesTax().add(importedItem.getSalesTax());
					} else 	{ 
						salesTax = taxableItem.getSalesTax();
					}

					Item item = new Item(itemDescription, itemPrice);


					BigDecimal finalSalesTax = item.computeSalesTax(salesTax);
					BigDecimal finalItemPrice = item.getPriceWithTax(finalSalesTax);

					receipt.addSalesTax(finalSalesTax);

					receipt.addFinalItemPrice(finalItemPrice);

					receipt.addItemToReceipt(itemDescription, itemPrice);

					view.anyItemsToAddInquiry();
					userInput = scanner.next().toLowerCase();
						while (!userInput.equals(yes) && !userInput.equals(no)) {
							view.invalidSubmission();
							view.anyItemsToAddInquiry();
							userInput = scanner.next().toLowerCase();
						}
				}

			receipt.displayFinalReceipt();
				
			}
			
	}
}



