import java.util.*;
import java.math.BigDecimal;

class TaxableItem extends Item {

	BigDecimal salesTax = new BigDecimal("0.10");

	public TaxableItem(String itemDescription, Double itemPrice){
		super(itemDescription, itemPrice);
	}

	public BigDecimal getSalesTax(){
		return salesTax;
	}
}

