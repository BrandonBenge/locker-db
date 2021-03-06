package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

/**
 * AuthoritiesId generated by hbm2java
 */
public class AuthoritiesId implements java.io.Serializable {

	private int counter;
	private String name;
	private Double phoneNumber;
	private String EMail;
	private String title;
	private String employer;
	private Double workPhone;
	private Double celPhone;
	private Double altPhone;

	public AuthoritiesId() {
	}

	public AuthoritiesId(int counter) {
		this.counter = counter;
	}

	public AuthoritiesId(int counter, String name, Double phoneNumber, String EMail, String title, String employer,
			Double workPhone, Double celPhone, Double altPhone) {
		this.counter = counter;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.EMail = EMail;
		this.title = title;
		this.employer = employer;
		this.workPhone = workPhone;
		this.celPhone = celPhone;
		this.altPhone = altPhone;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return this.employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public Double getWorkPhone() {
		return this.workPhone;
	}

	public void setWorkPhone(Double workPhone) {
		this.workPhone = workPhone;
	}

	public Double getCelPhone() {
		return this.celPhone;
	}

	public void setCelPhone(Double celPhone) {
		this.celPhone = celPhone;
	}

	public Double getAltPhone() {
		return this.altPhone;
	}

	public void setAltPhone(Double altPhone) {
		this.altPhone = altPhone;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AuthoritiesId))
			return false;
		AuthoritiesId castOther = (AuthoritiesId) other;

		return (this.getCounter() == castOther.getCounter())
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getPhoneNumber() == castOther.getPhoneNumber())
						|| (this.getPhoneNumber() != null && castOther.getPhoneNumber() != null
								&& this.getPhoneNumber().equals(castOther.getPhoneNumber())))
				&& ((this.getEMail() == castOther.getEMail()) || (this.getEMail() != null
						&& castOther.getEMail() != null && this.getEMail().equals(castOther.getEMail())))
				&& ((this.getTitle() == castOther.getTitle()) || (this.getTitle() != null
						&& castOther.getTitle() != null && this.getTitle().equals(castOther.getTitle())))
				&& ((this.getEmployer() == castOther.getEmployer()) || (this.getEmployer() != null
						&& castOther.getEmployer() != null && this.getEmployer().equals(castOther.getEmployer())))
				&& ((this.getWorkPhone() == castOther.getWorkPhone()) || (this.getWorkPhone() != null
						&& castOther.getWorkPhone() != null && this.getWorkPhone().equals(castOther.getWorkPhone())))
				&& ((this.getCelPhone() == castOther.getCelPhone()) || (this.getCelPhone() != null
						&& castOther.getCelPhone() != null && this.getCelPhone().equals(castOther.getCelPhone())))
				&& ((this.getAltPhone() == castOther.getAltPhone()) || (this.getAltPhone() != null
						&& castOther.getAltPhone() != null && this.getAltPhone().equals(castOther.getAltPhone())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCounter();
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getPhoneNumber() == null ? 0 : this.getPhoneNumber().hashCode());
		result = 37 * result + (getEMail() == null ? 0 : this.getEMail().hashCode());
		result = 37 * result + (getTitle() == null ? 0 : this.getTitle().hashCode());
		result = 37 * result + (getEmployer() == null ? 0 : this.getEmployer().hashCode());
		result = 37 * result + (getWorkPhone() == null ? 0 : this.getWorkPhone().hashCode());
		result = 37 * result + (getCelPhone() == null ? 0 : this.getCelPhone().hashCode());
		result = 37 * result + (getAltPhone() == null ? 0 : this.getAltPhone().hashCode());
		return result;
	}

}
