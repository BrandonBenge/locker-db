package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;

/**
 * PricesId generated by hbm2java
 */
public class PricesId implements java.io.Serializable {

	private String description;
	private BigDecimal price;
	private Double quantity;

	public PricesId() {
	}

	public PricesId(String description, BigDecimal price, Double quantity) {
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PricesId))
			return false;
		PricesId castOther = (PricesId) other;

		return ((this.getDescription() == castOther.getDescription()) || (this.getDescription() != null
				&& castOther.getDescription() != null && this.getDescription().equals(castOther.getDescription())))
				&& ((this.getPrice() == castOther.getPrice()) || (this.getPrice() != null
						&& castOther.getPrice() != null && this.getPrice().equals(castOther.getPrice())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this.getQuantity() != null
						&& castOther.getQuantity() != null && this.getQuantity().equals(castOther.getQuantity())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
		result = 37 * result + (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37 * result + (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		return result;
	}

}
