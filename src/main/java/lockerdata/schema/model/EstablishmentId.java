package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

/**
 * EstablishmentId generated by hbm2java
 */
public class EstablishmentId implements java.io.Serializable {

	private int id;
	private String gtin;
	private String est;

	public EstablishmentId() {
	}

	public EstablishmentId(int id, String gtin, String est) {
		this.id = id;
		this.gtin = gtin;
		this.est = est;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGtin() {
		return this.gtin;
	}

	public void setGtin(String gtin) {
		this.gtin = gtin;
	}

	public String getEst() {
		return this.est;
	}

	public void setEst(String est) {
		this.est = est;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstablishmentId))
			return false;
		EstablishmentId castOther = (EstablishmentId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getGtin() == castOther.getGtin()) || (this.getGtin() != null && castOther.getGtin() != null
						&& this.getGtin().equals(castOther.getGtin())))
				&& ((this.getEst() == castOther.getEst()) || (this.getEst() != null && castOther.getEst() != null
						&& this.getEst().equals(castOther.getEst())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getGtin() == null ? 0 : this.getGtin().hashCode());
		result = 37 * result + (getEst() == null ? 0 : this.getEst().hashCode());
		return result;
	}

}
