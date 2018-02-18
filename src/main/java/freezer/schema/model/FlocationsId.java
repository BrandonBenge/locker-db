package freezer.schema.model;
// Generated Feb 17, 2018 3:45:47 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * FlocationsId generated by hbm2java
 */
public class FlocationsId implements java.io.Serializable {

	private String name;
	private String locations;
	private Date date;

	public FlocationsId() {
	}

	public FlocationsId(String name, String locations, Date date) {
		this.name = name;
		this.locations = locations;
		this.date = date;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocations() {
		return this.locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FlocationsId))
			return false;
		FlocationsId castOther = (FlocationsId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
				&& this.getName().equals(castOther.getName())))
				&& ((this.getLocations() == castOther.getLocations()) || (this.getLocations() != null
						&& castOther.getLocations() != null && this.getLocations().equals(castOther.getLocations())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
						&& this.getDate().equals(castOther.getDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getLocations() == null ? 0 : this.getLocations().hashCode());
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		return result;
	}

}