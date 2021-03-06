package freezer.schema.model;
// Generated Feb 17, 2018 3:45:47 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * TimepunchesId generated by hbm2java
 */
public class TimepunchesId implements java.io.Serializable {

	private int counter;
	private String intime;
	private String otl;
	private String ifl;
	private String outTime;
	private String extraIn;
	private String extraOut;
	private Date dte;

	public TimepunchesId() {
	}

	public TimepunchesId(int counter, String intime, String otl, String ifl, String outTime, String extraIn,
			String extraOut, Date dte) {
		this.counter = counter;
		this.intime = intime;
		this.otl = otl;
		this.ifl = ifl;
		this.outTime = outTime;
		this.extraIn = extraIn;
		this.extraOut = extraOut;
		this.dte = dte;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getIntime() {
		return this.intime;
	}

	public void setIntime(String intime) {
		this.intime = intime;
	}

	public String getOtl() {
		return this.otl;
	}

	public void setOtl(String otl) {
		this.otl = otl;
	}

	public String getIfl() {
		return this.ifl;
	}

	public void setIfl(String ifl) {
		this.ifl = ifl;
	}

	public String getOutTime() {
		return this.outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getExtraIn() {
		return this.extraIn;
	}

	public void setExtraIn(String extraIn) {
		this.extraIn = extraIn;
	}

	public String getExtraOut() {
		return this.extraOut;
	}

	public void setExtraOut(String extraOut) {
		this.extraOut = extraOut;
	}

	public Date getDte() {
		return this.dte;
	}

	public void setDte(Date dte) {
		this.dte = dte;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TimepunchesId))
			return false;
		TimepunchesId castOther = (TimepunchesId) other;

		return (this.getCounter() == castOther.getCounter())
				&& ((this.getIntime() == castOther.getIntime()) || (this.getIntime() != null
						&& castOther.getIntime() != null && this.getIntime().equals(castOther.getIntime())))
				&& ((this.getOtl() == castOther.getOtl()) || (this.getOtl() != null && castOther.getOtl() != null
						&& this.getOtl().equals(castOther.getOtl())))
				&& ((this.getIfl() == castOther.getIfl()) || (this.getIfl() != null && castOther.getIfl() != null
						&& this.getIfl().equals(castOther.getIfl())))
				&& ((this.getOutTime() == castOther.getOutTime()) || (this.getOutTime() != null
						&& castOther.getOutTime() != null && this.getOutTime().equals(castOther.getOutTime())))
				&& ((this.getExtraIn() == castOther.getExtraIn()) || (this.getExtraIn() != null
						&& castOther.getExtraIn() != null && this.getExtraIn().equals(castOther.getExtraIn())))
				&& ((this.getExtraOut() == castOther.getExtraOut()) || (this.getExtraOut() != null
						&& castOther.getExtraOut() != null && this.getExtraOut().equals(castOther.getExtraOut())))
				&& ((this.getDte() == castOther.getDte()) || (this.getDte() != null && castOther.getDte() != null
						&& this.getDte().equals(castOther.getDte())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCounter();
		result = 37 * result + (getIntime() == null ? 0 : this.getIntime().hashCode());
		result = 37 * result + (getOtl() == null ? 0 : this.getOtl().hashCode());
		result = 37 * result + (getIfl() == null ? 0 : this.getIfl().hashCode());
		result = 37 * result + (getOutTime() == null ? 0 : this.getOutTime().hashCode());
		result = 37 * result + (getExtraIn() == null ? 0 : this.getExtraIn().hashCode());
		result = 37 * result + (getExtraOut() == null ? 0 : this.getExtraOut().hashCode());
		result = 37 * result + (getDte() == null ? 0 : this.getDte().hashCode());
		return result;
	}

}
