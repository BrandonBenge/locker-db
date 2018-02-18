package freezer.schema.model;
// Generated Feb 17, 2018 3:45:47 PM by Hibernate Tools 5.2.8.Final

/**
 * SpeciesId generated by hbm2java
 */
public class SpeciesId implements java.io.Serializable {

	private String species;
	private int counter;

	public SpeciesId() {
	}

	public SpeciesId(int counter) {
		this.counter = counter;
	}

	public SpeciesId(String species, int counter) {
		this.species = species;
		this.counter = counter;
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SpeciesId))
			return false;
		SpeciesId castOther = (SpeciesId) other;

		return ((this.getSpecies() == castOther.getSpecies()) || (this.getSpecies() != null
				&& castOther.getSpecies() != null && this.getSpecies().equals(castOther.getSpecies())))
				&& (this.getCounter() == castOther.getCounter());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSpecies() == null ? 0 : this.getSpecies().hashCode());
		result = 37 * result + this.getCounter();
		return result;
	}

}
