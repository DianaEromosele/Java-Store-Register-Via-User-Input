import java.math.BigDecimal;
import java.math.*;


class Item {

	String description;
	BigDecimal price;
	MathContext mc = new MathContext(3);

	public Item(String itemDescription, Double itemPrice) {
		description = itemDescription;
		price = BigDecimal.valueOf(itemPrice.doubleValue());
	}

	public String getDescription(){
		return description;
	}

	public BigDecimal getPrice(){
		return price;
	}

	public BigDecimal computeSalesTax(BigDecimal salesTax){

		BigDecimal twenty = new BigDecimal("20.0");
		BigDecimal compute1 = this.getPrice().multiply(salesTax);
		BigDecimal compute2 = compute1.multiply(twenty);
		BigDecimal compute3 = compute2.setScale(0, RoundingMode.UP);
		BigDecimal finalSalesTax = compute3.divide(twenty);
		
		return finalSalesTax;
	}

	public BigDecimal getPriceWithTax(BigDecimal itemSalesTax){
		return this.getPrice().add(itemSalesTax);
	}

}
