package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * ArchieveId generated by hbm2java
 */
public class ArchieveId implements java.io.Serializable {

	private int counter;
	private String fullName;
	private Date deliveryDate;
	private Integer order;
	private Date active;
	private String type;
	private Double hangingWeight;
	private BigDecimal processing;
	private Double liverWeight;
	private Double dressedWeight;
	private Float liveWeight;
	private Float tagNumber;
	private Double storage;
	private Double totalCharges;
	private Float numberOfBeef;
	private Double dress;
	private Boolean ztill;
	private Boolean cuttingOrder;
	private Boolean age;
	private String owner;
	private String condit;
	private String breed;

	public ArchieveId() {
	}

	public ArchieveId(int counter, String fullName, Date deliveryDate, String type) {
		this.counter = counter;
		this.fullName = fullName;
		this.deliveryDate = deliveryDate;
		this.type = type;
	}

	public ArchieveId(int counter, String fullName, Date deliveryDate, Integer order, Date active, String type,
			Double hangingWeight, BigDecimal processing, Double liverWeight, Double dressedWeight, Float liveWeight,
			Float tagNumber, Double storage, Double totalCharges, Float numberOfBeef, Double dress, Boolean ztill,
			Boolean cuttingOrder, Boolean age, String owner, String condit, String breed) {
		this.counter = counter;
		this.fullName = fullName;
		this.deliveryDate = deliveryDate;
		this.order = order;
		this.active = active;
		this.type = type;
		this.hangingWeight = hangingWeight;
		this.processing = processing;
		this.liverWeight = liverWeight;
		this.dressedWeight = dressedWeight;
		this.liveWeight = liveWeight;
		this.tagNumber = tagNumber;
		this.storage = storage;
		this.totalCharges = totalCharges;
		this.numberOfBeef = numberOfBeef;
		this.dress = dress;
		this.ztill = ztill;
		this.cuttingOrder = cuttingOrder;
		this.age = age;
		this.owner = owner;
		this.condit = condit;
		this.breed = breed;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Date getActive() {
		return this.active;
	}

	public void setActive(Date active) {
		this.active = active;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getHangingWeight() {
		return this.hangingWeight;
	}

	public void setHangingWeight(Double hangingWeight) {
		this.hangingWeight = hangingWeight;
	}

	public BigDecimal getProcessing() {
		return this.processing;
	}

	public void setProcessing(BigDecimal processing) {
		this.processing = processing;
	}

	public Double getLiverWeight() {
		return this.liverWeight;
	}

	public void setLiverWeight(Double liverWeight) {
		this.liverWeight = liverWeight;
	}

	public Double getDressedWeight() {
		return this.dressedWeight;
	}

	public void setDressedWeight(Double dressedWeight) {
		this.dressedWeight = dressedWeight;
	}

	public Float getLiveWeight() {
		return this.liveWeight;
	}

	public void setLiveWeight(Float liveWeight) {
		this.liveWeight = liveWeight;
	}

	public Float getTagNumber() {
		return this.tagNumber;
	}

	public void setTagNumber(Float tagNumber) {
		this.tagNumber = tagNumber;
	}

	public Double getStorage() {
		return this.storage;
	}

	public void setStorage(Double storage) {
		this.storage = storage;
	}

	public Double getTotalCharges() {
		return this.totalCharges;
	}

	public void setTotalCharges(Double totalCharges) {
		this.totalCharges = totalCharges;
	}

	public Float getNumberOfBeef() {
		return this.numberOfBeef;
	}

	public void setNumberOfBeef(Float numberOfBeef) {
		this.numberOfBeef = numberOfBeef;
	}

	public Double getDress() {
		return this.dress;
	}

	public void setDress(Double dress) {
		this.dress = dress;
	}

	public Boolean getZtill() {
		return this.ztill;
	}

	public void setZtill(Boolean ztill) {
		this.ztill = ztill;
	}

	public Boolean getCuttingOrder() {
		return this.cuttingOrder;
	}

	public void setCuttingOrder(Boolean cuttingOrder) {
		this.cuttingOrder = cuttingOrder;
	}

	public Boolean getAge() {
		return this.age;
	}

	public void setAge(Boolean age) {
		this.age = age;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCondit() {
		return this.condit;
	}

	public void setCondit(String condit) {
		this.condit = condit;
	}

	public String getBreed() {
		return this.breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ArchieveId))
			return false;
		ArchieveId castOther = (ArchieveId) other;

		return (this.getCounter() == castOther.getCounter())
				&& ((this.getFullName() == castOther.getFullName()) || (this.getFullName() != null
						&& castOther.getFullName() != null && this.getFullName().equals(castOther.getFullName())))
				&& ((this.getDeliveryDate() == castOther.getDeliveryDate())
						|| (this.getDeliveryDate() != null && castOther.getDeliveryDate() != null
								&& this.getDeliveryDate().equals(castOther.getDeliveryDate())))
				&& ((this.getOrder() == castOther.getOrder()) || (this.getOrder() != null
						&& castOther.getOrder() != null && this.getOrder().equals(castOther.getOrder())))
				&& ((this.getActive() == castOther.getActive()) || (this.getActive() != null
						&& castOther.getActive() != null && this.getActive().equals(castOther.getActive())))
				&& ((this.getType() == castOther.getType()) || (this.getType() != null && castOther.getType() != null
						&& this.getType().equals(castOther.getType())))
				&& ((this.getHangingWeight() == castOther.getHangingWeight())
						|| (this.getHangingWeight() != null && castOther.getHangingWeight() != null
								&& this.getHangingWeight().equals(castOther.getHangingWeight())))
				&& ((this.getProcessing() == castOther.getProcessing()) || (this.getProcessing() != null
						&& castOther.getProcessing() != null && this.getProcessing().equals(castOther.getProcessing())))
				&& ((this.getLiverWeight() == castOther.getLiverWeight())
						|| (this.getLiverWeight() != null && castOther.getLiverWeight() != null
								&& this.getLiverWeight().equals(castOther.getLiverWeight())))
				&& ((this.getDressedWeight() == castOther.getDressedWeight())
						|| (this.getDressedWeight() != null && castOther.getDressedWeight() != null
								&& this.getDressedWeight().equals(castOther.getDressedWeight())))
				&& ((this.getLiveWeight() == castOther.getLiveWeight()) || (this.getLiveWeight() != null
						&& castOther.getLiveWeight() != null && this.getLiveWeight().equals(castOther.getLiveWeight())))
				&& ((this.getTagNumber() == castOther.getTagNumber()) || (this.getTagNumber() != null
						&& castOther.getTagNumber() != null && this.getTagNumber().equals(castOther.getTagNumber())))
				&& ((this.getStorage() == castOther.getStorage()) || (this.getStorage() != null
						&& castOther.getStorage() != null && this.getStorage().equals(castOther.getStorage())))
				&& ((this.getTotalCharges() == castOther.getTotalCharges())
						|| (this.getTotalCharges() != null && castOther.getTotalCharges() != null
								&& this.getTotalCharges().equals(castOther.getTotalCharges())))
				&& ((this.getNumberOfBeef() == castOther.getNumberOfBeef())
						|| (this.getNumberOfBeef() != null && castOther.getNumberOfBeef() != null
								&& this.getNumberOfBeef().equals(castOther.getNumberOfBeef())))
				&& ((this.getDress() == castOther.getDress()) || (this.getDress() != null
						&& castOther.getDress() != null && this.getDress().equals(castOther.getDress())))
				&& ((this.getZtill() == castOther.getZtill()) || (this.getZtill() != null
						&& castOther.getZtill() != null && this.getZtill().equals(castOther.getZtill())))
				&& ((this.getCuttingOrder() == castOther.getCuttingOrder())
						|| (this.getCuttingOrder() != null && castOther.getCuttingOrder() != null
								&& this.getCuttingOrder().equals(castOther.getCuttingOrder())))
				&& ((this.getAge() == castOther.getAge()) || (this.getAge() != null && castOther.getAge() != null
						&& this.getAge().equals(castOther.getAge())))
				&& ((this.getOwner() == castOther.getOwner()) || (this.getOwner() != null
						&& castOther.getOwner() != null && this.getOwner().equals(castOther.getOwner())))
				&& ((this.getCondit() == castOther.getCondit()) || (this.getCondit() != null
						&& castOther.getCondit() != null && this.getCondit().equals(castOther.getCondit())))
				&& ((this.getBreed() == castOther.getBreed()) || (this.getBreed() != null
						&& castOther.getBreed() != null && this.getBreed().equals(castOther.getBreed())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCounter();
		result = 37 * result + (getFullName() == null ? 0 : this.getFullName().hashCode());
		result = 37 * result + (getDeliveryDate() == null ? 0 : this.getDeliveryDate().hashCode());
		result = 37 * result + (getOrder() == null ? 0 : this.getOrder().hashCode());
		result = 37 * result + (getActive() == null ? 0 : this.getActive().hashCode());
		result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
		result = 37 * result + (getHangingWeight() == null ? 0 : this.getHangingWeight().hashCode());
		result = 37 * result + (getProcessing() == null ? 0 : this.getProcessing().hashCode());
		result = 37 * result + (getLiverWeight() == null ? 0 : this.getLiverWeight().hashCode());
		result = 37 * result + (getDressedWeight() == null ? 0 : this.getDressedWeight().hashCode());
		result = 37 * result + (getLiveWeight() == null ? 0 : this.getLiveWeight().hashCode());
		result = 37 * result + (getTagNumber() == null ? 0 : this.getTagNumber().hashCode());
		result = 37 * result + (getStorage() == null ? 0 : this.getStorage().hashCode());
		result = 37 * result + (getTotalCharges() == null ? 0 : this.getTotalCharges().hashCode());
		result = 37 * result + (getNumberOfBeef() == null ? 0 : this.getNumberOfBeef().hashCode());
		result = 37 * result + (getDress() == null ? 0 : this.getDress().hashCode());
		result = 37 * result + (getZtill() == null ? 0 : this.getZtill().hashCode());
		result = 37 * result + (getCuttingOrder() == null ? 0 : this.getCuttingOrder().hashCode());
		result = 37 * result + (getAge() == null ? 0 : this.getAge().hashCode());
		result = 37 * result + (getOwner() == null ? 0 : this.getOwner().hashCode());
		result = 37 * result + (getCondit() == null ? 0 : this.getCondit().hashCode());
		result = 37 * result + (getBreed() == null ? 0 : this.getBreed().hashCode());
		return result;
	}

}
