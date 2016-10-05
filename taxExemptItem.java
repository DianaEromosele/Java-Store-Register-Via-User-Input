import java.util.*;
import java.math.BigDecimal;

class TaxExemptItem extends Item {

	BigDecimal salesTax = new BigDecimal("0.0");

	public TaxExemptItem(String itemDescription, Double itemPrice){
		super(itemDescription, itemPrice);
	}

	public BigDecimal getSalesTax(){
		return salesTax;
	}
}

