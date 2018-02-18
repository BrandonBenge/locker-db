package freezer.schema.model;
// Generated Feb 17, 2018 3:45:47 PM by Hibernate Tools 5.2.8.Final

/**
 * CapeId generated by hbm2java
 */
public class CapeId implements java.io.Serializable {

	private int location;
	private String name;
	private Integer tag;

	public CapeId() {
	}

	public CapeId(int location) {
		this.location = location;
	}

	public CapeId(int location, String name, Integer tag) {
		this.location = location;
		this.name = name;
		this.tag = tag;
	}

	public int getLocation() {
		return this.location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTag() {
		return this.tag;
	}

	public void setTag(Integer tag) {
		this.tag = tag;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CapeId))
			return false;
		CapeId castOther = (CapeId) other;

		return (this.getLocation() == castOther.getLocation())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getTag() == castOther.getTag()) || (this.getTag() != null && castOther.getTag() != null
						&& this.getTag().equals(castOther.getTag())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getLocation();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getTag() == null ? 0 : this.getTag().hashCode());
		return result;
	}

}
