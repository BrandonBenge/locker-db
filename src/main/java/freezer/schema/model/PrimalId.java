package freezer.schema.model;
// Generated Feb 17, 2018 3:45:47 PM by Hibernate Tools 5.2.8.Final

/**
 * PrimalId generated by hbm2java
 */
public class PrimalId implements java.io.Serializable {

	private int id;
	private String primal;
	private Double species;
	private Double porder;

	public PrimalId() {
	}

	public PrimalId(int id) {
		this.id = id;
	}

	public PrimalId(int id, String primal, Double species, Double porder) {
		this.id = id;
		this.primal = primal;
		this.species = species;
		this.porder = porder;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrimal() {
		return this.primal;
	}

	public void setPrimal(String primal) {
		this.primal = primal;
	}

	public Double getSpecies() {
		return this.species;
	}

	public void setSpecies(Double species) {
		this.species = species;
	}

	public Double getPorder() {
		return this.porder;
	}

	public void setPorder(Double porder) {
		this.porder = porder;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrimalId))
			return false;
		PrimalId castOther = (PrimalId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getPrimal() == castOther.getPrimal()) || (this.getPrimal() != null
						&& castOther.getPrimal() != null && this.getPrimal().equals(castOther.getPrimal())))
				&& ((this.getSpecies() == castOther.getSpecies()) || (this.getSpecies() != null
						&& castOther.getSpecies() != null && this.getSpecies().equals(castOther.getSpecies())))
				&& ((this.getPorder() == castOther.getPorder()) || (this.getPorder() != null
						&& castOther.getPorder() != null && this.getPorder().equals(castOther.getPorder())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getPrimal() == null ? 0 : this.getPrimal().hashCode());
		result = 37 * result + (getSpecies() == null ? 0 : this.getSpecies().hashCode());
		result = 37 * result + (getPorder() == null ? 0 : this.getPorder().hashCode());
		return result;
	}

}
