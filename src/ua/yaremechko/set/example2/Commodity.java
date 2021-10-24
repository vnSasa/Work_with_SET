package ua.yaremechko.set.example2;

public class Commodity {

	private String productName;
	private int lengthProduct;
	private int widthProduct;
	private int weightProduct;

	public Commodity(String productName, int lengthProduct, int widthProduct, int weightProduct) {
		super();
		this.productName = productName;
		this.lengthProduct = lengthProduct;
		this.widthProduct = widthProduct;
		this.weightProduct = weightProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getLengthProduct() {
		return lengthProduct;
	}

	public void setLengthProduct(int lengthProduct) {
		this.lengthProduct = lengthProduct;
	}

	public int getWidthProduct() {
		return widthProduct;
	}

	public void setWidthProduct(int widthProduct) {
		this.widthProduct = widthProduct;
	}

	public int getWeightProduct() {
		return weightProduct;
	}

	public void setWeightProduct(int weightProduct) {
		this.weightProduct = weightProduct;
	}

	@Override
	public String toString() {
		return "Commodity [productName=" + productName + ", lengthProduct=" + lengthProduct + ", widthProduct="
				+ widthProduct + ", weightProduct=" + weightProduct + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lengthProduct;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + weightProduct;
		result = prime * result + widthProduct;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (lengthProduct != other.lengthProduct)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (weightProduct != other.weightProduct)
			return false;
		if (widthProduct != other.widthProduct)
			return false;
		return true;
	}

}
