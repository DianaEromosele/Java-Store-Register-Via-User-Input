import java.util.*;
import java.math.BigDecimal;

class ImportedItem extends Item {

	BigDecimal salesTax = new BigDecimal("0.05");

	public ImportedItem(String itemDescription, Double itemPrice){
		super(itemDescription, itemPrice);
	}

	public BigDecimal getSalesTax(){
		return salesTax;
	}
}


