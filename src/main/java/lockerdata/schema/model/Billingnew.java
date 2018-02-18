package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;

/**
 * Billingnew generated by hbm2java
 */
public class Billingnew implements java.io.Serializable {

	private int counter;
	private String animalId;
	private String quantity;
	private String description;
	private BigDecimal amount;
	private String category;

	public Billingnew() {
	}

	public Billingnew(int counter, String animalId, String quantity, String description, BigDecimal amount,
			String category) {
		this.counter = counter;
		this.animalId = animalId;
		this.quantity = quantity;
		this.description = description;
		this.amount = amount;
		this.category = category;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
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

}
