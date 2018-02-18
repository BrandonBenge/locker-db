package freezer.schema.model;
// Generated Feb 17, 2018 3:45:47 PM by Hibernate Tools 5.2.8.Final

/**
 * DeolId generated by hbm2java
 */
public class DeolId implements java.io.Serializable {

	private int location;
	private String i1;
	private String i2;
	private String i3;
	private String i4;
	private String i5;
	private String i6;
	private String i7;
	private String i8;

	public DeolId() {
	}

	public DeolId(int location, String i1, String i2, String i3, String i4, String i5, String i6, String i7) {
		this.location = location;
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
		this.i4 = i4;
		this.i5 = i5;
		this.i6 = i6;
		this.i7 = i7;
	}

	public DeolId(int location, String i1, String i2, String i3, String i4, String i5, String i6, String i7,
			String i8) {
		this.location = location;
		this.i1 = i1;
		this.i2 = i2;
		this.i3 = i3;
		this.i4 = i4;
		this.i5 = i5;
		this.i6 = i6;
		this.i7 = i7;
		this.i8 = i8;
	}

	public int getLocation() {
		return this.location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getI1() {
		return this.i1;
	}

	public void setI1(String i1) {
		this.i1 = i1;
	}

	public String getI2() {
		return this.i2;
	}

	public void setI2(String i2) {
		this.i2 = i2;
	}

	public String getI3() {
		return this.i3;
	}

	public void setI3(String i3) {
		this.i3 = i3;
	}

	public String getI4() {
		return this.i4;
	}

	public void setI4(String i4) {
		this.i4 = i4;
	}

	public String getI5() {
		return this.i5;
	}

	public void setI5(String i5) {
		this.i5 = i5;
	}

	public String getI6() {
		return this.i6;
	}

	public void setI6(String i6) {
		this.i6 = i6;
	}

	public String getI7() {
		return this.i7;
	}

	public void setI7(String i7) {
		this.i7 = i7;
	}

	public String getI8() {
		return this.i8;
	}

	public void setI8(String i8) {
		this.i8 = i8;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DeolId))
			return false;
		DeolId castOther = (DeolId) other;

		return (this.getLocation() == castOther.getLocation()) && ((this.getI1() == castOther.getI1())
				|| (this.getI1() != null && castOther.getI1() != null && this.getI1().equals(castOther.getI1())))
				&& ((this.getI2() == castOther.getI2()) || (this.getI2() != null && castOther.getI2() != null
						&& this.getI2().equals(castOther.getI2())))
				&& ((this.getI3() == castOther.getI3()) || (this.getI3() != null && castOther.getI3() != null
						&& this.getI3().equals(castOther.getI3())))
				&& ((this.getI4() == castOther.getI4()) || (this.getI4() != null && castOther.getI4() != null
						&& this.getI4().equals(castOther.getI4())))
				&& ((this.getI5() == castOther.getI5()) || (this.getI5() != null && castOther.getI5() != null
						&& this.getI5().equals(castOther.getI5())))
				&& ((this.getI6() == castOther.getI6()) || (this.getI6() != null && castOther.getI6() != null
						&& this.getI6().equals(castOther.getI6())))
				&& ((this.getI7() == castOther.getI7()) || (this.getI7() != null && castOther.getI7() != null
						&& this.getI7().equals(castOther.getI7())))
				&& ((this.getI8() == castOther.getI8()) || (this.getI8() != null && castOther.getI8() != null
						&& this.getI8().equals(castOther.getI8())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getLocation();
		result = 37 * result + (getI1() == null ? 0 : this.getI1().hashCode());
		result = 37 * result + (getI2() == null ? 0 : this.getI2().hashCode());
		result = 37 * result + (getI3() == null ? 0 : this.getI3().hashCode());
		result = 37 * result + (getI4() == null ? 0 : this.getI4().hashCode());
		result = 37 * result + (getI5() == null ? 0 : this.getI5().hashCode());
		result = 37 * result + (getI6() == null ? 0 : this.getI6().hashCode());
		result = 37 * result + (getI7() == null ? 0 : this.getI7().hashCode());
		result = 37 * result + (getI8() == null ? 0 : this.getI8().hashCode());
		return result;
	}

}