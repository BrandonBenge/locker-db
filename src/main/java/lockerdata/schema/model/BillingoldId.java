package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;

/**
 * BillingoldId generated by hbm2java
 */
public class BillingoldId implements java.io.Serializable {

	private String animalId;
	private String quantity;
	private String description;
	private BigDecimal amount;
	private String category;

	public BillingoldId() {
	}

	public BillingoldId(String animalId, String quantity, String description, BigDecimal amount, String category) {
		this.animalId = animalId;
		this.quantity = quantity;
		this.description = description;
		this.amount = amount;
		this.category = category;
	}

	public String getAnimalId() {
		return this.animalId;
	}

	public void setAnimalId(String animalId) {
		this.animalId = animalId;
	}

	public String getQuantity() {
		return this.quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BillingoldId))
			return false;
		BillingoldId castOther = (BillingoldId) other;

		return ((this.getAnimalId() == castOther.getAnimalId()) || (this.getAnimalId() != null
				&& castOther.getAnimalId() != null && this.getAnimalId().equals(castOther.getAnimalId())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this.getQuantity() != null
						&& castOther.getQuantity() != null && this.getQuantity().equals(castOther.getQuantity())))
				&& ((this.getDescription() == castOther.getDescription())
						|| (this.getDescription() != null && castOther.getDescription() != null
								&& this.getDescription().equals(castOther.getDescription())))
				&& ((this.getAmount() == castOther.getAmount()) || (this.getAmount() != null
						&& castOther.getAmount() != null && this.getAmount().equals(castOther.getAmount())))
				&& ((this.getCategory() == castOther.getCategory()) || (this.getCategory() != null
						&& castOther.getCategory() != null && this.getCategory().equals(castOther.getCategory())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAnimalId() == null ? 0 : this.getAnimalId().hashCode());
		result = 37 * result + (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
		result = 37 * result + (getAmount() == null ? 0 : this.getAmount().hashCode());
		result = 37 * result + (getCategory() == null ? 0 : this.getCategory().hashCode());
		return result;
	}

}
