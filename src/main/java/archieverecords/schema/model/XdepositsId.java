package archieverecords.schema.model;
// Generated Feb 17, 2018 4:24:52 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;

/**
 * XdepositsId generated by hbm2java
 */
public class XdepositsId implements java.io.Serializable {

	private long counter;
	private Date date;
	private Date time;
	private String species;
	private Float dprocessing;
	private Float processing;
	private Float total;
	private String method;
	private Float amount;
	private Float change;
	private Boolean zzed;
	private String name;
	private long xActionNumber;

	public XdepositsId() {
	}

	public XdepositsId(long counter, long xActionNumber) {
		this.counter = counter;
		this.xActionNumber = xActionNumber;
	}

	public XdepositsId(long counter, Date date, Date time, String species, Float dprocessing, Float processing,
			Float total, String method, Float amount, Float change, Boolean zzed, String name, long xActionNumber) {
		this.counter = counter;
		this.date = date;
		this.time = time;
		this.species = species;
		this.dprocessing = dprocessing;
		this.processing = processing;
		this.total = total;
		this.method = method;
		this.amount = amount;
		this.change = change;
		this.zzed = zzed;
		this.name = name;
		this.xActionNumber = xActionNumber;
	}

	public long getCounter() {
		return this.counter;
	}

	public void setCounter(long counter) {
		this.counter = counter;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Float getDprocessing() {
		return this.dprocessing;
	}

	public void setDprocessing(Float dprocessing) {
		this.dprocessing = dprocessing;
	}

	public Float getProcessing() {
		return this.processing;
	}

	public void setProcessing(Float processing) {
		this.processing = processing;
	}

	public Float getTotal() {
		return this.total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Float getChange() {
		return this.change;
	}

	public void setChange(Float change) {
		this.change = change;
	}

	public Boolean getZzed() {
		return this.zzed;
	}

	public void setZzed(Boolean zzed) {
		this.zzed = zzed;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getxActionNumber() {
		return this.xActionNumber;
	}

	public void setxActionNumber(long xActionNumber) {
		this.xActionNumber = xActionNumber;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof XdepositsId))
			return false;
		XdepositsId castOther = (XdepositsId) other;

		return (this.getCounter() == castOther.getCounter())
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
						&& this.getDate().equals(castOther.getDate())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null && castOther.getTime() != null
						&& this.getTime().equals(castOther.getTime())))
				&& ((this.getSpecies() == castOther.getSpecies()) || (this.getSpecies() != null
						&& castOther.getSpecies() != null && this.getSpecies().equals(castOther.getSpecies())))
				&& ((this.getDprocessing() == castOther.getDprocessing())
						|| (this.getDprocessing() != null && castOther.getDprocessing() != null
								&& this.getDprocessing().equals(castOther.getDprocessing())))
				&& ((this.getProcessing() == castOther.getProcessing()) || (this.getProcessing() != null
						&& castOther.getProcessing() != null && this.getProcessing().equals(castOther.getProcessing())))
				&& ((this.getTotal() == castOther.getTotal()) || (this.getTotal() != null
						&& castOther.getTotal() != null && this.getTotal().equals(castOther.getTotal())))
				&& ((this.getMethod() == castOther.getMethod()) || (this.getMethod() != null
						&& castOther.getMethod() != null && this.getMethod().equals(castOther.getMethod())))
				&& ((this.getAmount() == castOther.getAmount()) || (this.getAmount() != null
						&& castOther.getAmount() != null && this.getAmount().equals(castOther.getAmount())))
				&& ((this.getChange() == castOther.getChange()) || (this.getChange() != null
						&& castOther.getChange() != null && this.getChange().equals(castOther.getChange())))
				&& ((this.getZzed() == castOther.getZzed()) || (this.getZzed() != null && castOther.getZzed() != null
						&& this.getZzed().equals(castOther.getZzed())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& (this.getxActionNumber() == castOther.getxActionNumber());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCounter();
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result + (getSpecies() == null ? 0 : this.getSpecies().hashCode());
		result = 37 * result + (getDprocessing() == null ? 0 : this.getDprocessing().hashCode());
		result = 37 * result + (getProcessing() == null ? 0 : this.getProcessing().hashCode());
		result = 37 * result + (getTotal() == null ? 0 : this.getTotal().hashCode());
		result = 37 * result + (getMethod() == null ? 0 : this.getMethod().hashCode());
		result = 37 * result + (getAmount() == null ? 0 : this.getAmount().hashCode());
		result = 37 * result + (getChange() == null ? 0 : this.getChange().hashCode());
		result = 37 * result + (getZzed() == null ? 0 : this.getZzed().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (int) this.getxActionNumber();
		return result;
	}

}
