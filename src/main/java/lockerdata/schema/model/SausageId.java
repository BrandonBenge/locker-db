package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

/**
 * SausageId generated by hbm2java
 */
public class SausageId implements java.io.Serializable {

	private Double id;
	private String fullName;
	private Double deer;
	private Double pork;
	private Double sausage;
	private Double batchNo;
	private boolean done;
	private String tpe;

	public SausageId() {
	}

	public SausageId(boolean done) {
		this.done = done;
	}

	public SausageId(Double id, String fullName, Double deer, Double pork, Double sausage, Double batchNo, boolean done,
			String tpe) {
		this.id = id;
		this.fullName = fullName;
		this.deer = deer;
		this.pork = pork;
		this.sausage = sausage;
		this.batchNo = batchNo;
		this.done = done;
		this.tpe = tpe;
	}

	public Double getId() {
		return this.id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Double getDeer() {
		return this.deer;
	}

	public void setDeer(Double deer) {
		this.deer = deer;
	}

	public Double getPork() {
		return this.pork;
	}

	public void setPork(Double pork) {
		this.pork = pork;
	}

	public Double getSausage() {
		return this.sausage;
	}

	public void setSausage(Double sausage) {
		this.sausage = sausage;
	}

	public Double getBatchNo() {
		return this.batchNo;
	}

	public void setBatchNo(Double batchNo) {
		this.batchNo = batchNo;
	}

	public boolean isDone() {
		return this.done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getTpe() {
		return this.tpe;
	}

	public void setTpe(String tpe) {
		this.tpe = tpe;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SausageId))
			return false;
		SausageId castOther = (SausageId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getFullName() == castOther.getFullName()) || (this.getFullName() != null
						&& castOther.getFullName() != null && this.getFullName().equals(castOther.getFullName())))
				&& ((this.getDeer() == castOther.getDeer()) || (this.getDeer() != null && castOther.getDeer() != null
						&& this.getDeer().equals(castOther.getDeer())))
				&& ((this.getPork() == castOther.getPork()) || (this.getPork() != null && castOther.getPork() != null
						&& this.getPork().equals(castOther.getPork())))
				&& ((this.getSausage() == castOther.getSausage()) || (this.getSausage() != null
						&& castOther.getSausage() != null && this.getSausage().equals(castOther.getSausage())))
				&& ((this.getBatchNo() == castOther.getBatchNo()) || (this.getBatchNo() != null
						&& castOther.getBatchNo() != null && this.getBatchNo().equals(castOther.getBatchNo())))
				&& (this.isDone() == castOther.isDone())
				&& ((this.getTpe() == castOther.getTpe()) || (this.getTpe() != null && castOther.getTpe() != null
						&& this.getTpe().equals(castOther.getTpe())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getFullName() == null ? 0 : this.getFullName().hashCode());
		result = 37 * result + (getDeer() == null ? 0 : this.getDeer().hashCode());
		result = 37 * result + (getPork() == null ? 0 : this.getPork().hashCode());
		result = 37 * result + (getSausage() == null ? 0 : this.getSausage().hashCode());
		result = 37 * result + (getBatchNo() == null ? 0 : this.getBatchNo().hashCode());
		result = 37 * result + (this.isDone() ? 1 : 0);
		result = 37 * result + (getTpe() == null ? 0 : this.getTpe().hashCode());
		return result;
	}

}
