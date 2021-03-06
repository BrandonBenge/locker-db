package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

/**
 * SeasoningId generated by hbm2java
 */
public class SeasoningId implements java.io.Serializable {

	private int id;
	private String seasoning;
	private String description;

	public SeasoningId() {
	}

	public SeasoningId(int id, String seasoning) {
		this.id = id;
		this.seasoning = seasoning;
	}

	public SeasoningId(int id, String seasoning, String description) {
		this.id = id;
		this.seasoning = seasoning;
		this.description = description;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeasoning() {
		return this.seasoning;
	}

	public void setSeasoning(String seasoning) {
		this.seasoning = seasoning;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SeasoningId))
			return false;
		SeasoningId castOther = (SeasoningId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getSeasoning() == castOther.getSeasoning()) || (this.getSeasoning() != null
						&& castOther.getSeasoning() != null && this.getSeasoning().equals(castOther.getSeasoning())))
				&& ((this.getDescription() == castOther.getDescription())
						|| (this.getDescription() != null && castOther.getDescription() != null
								&& this.getDescription().equals(castOther.getDescription())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getSeasoning() == null ? 0 : this.getSeasoning().hashCode());
		result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
		return result;
	}

}
