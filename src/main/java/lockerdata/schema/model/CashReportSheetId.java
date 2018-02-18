package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * CashReportSheetId generated by hbm2java
 */
public class CashReportSheetId implements java.io.Serializable {

	private int id;
	private Double month;
	private Date date;
	private BigDecimal beginningCash;
	private BigDecimal totalSales;
	private BigDecimal subtotal1;
	private BigDecimal paidOuts;
	private BigDecimal subtotal2;
	private BigDecimal deposit;
	private BigDecimal total;
	private BigDecimal endingCash;
	private BigDecimal cashOverUnder;
	private BigDecimal meatSales;
	private BigDecimal tax;
	private BigDecimal nonTax;
	private BigDecimal lockerRent;
	private BigDecimal curingandseasoning;
	private BigDecimal processing;
	private BigDecimal porkProcessing;
	private BigDecimal deerProcessing;
	private BigDecimal dogFood;
	private BigDecimal hides;
	private BigDecimal uniform;
	private BigDecimal lunchroom;
	private BigDecimal personal;
	private BigDecimal maintance;
	private BigDecimal donations;
	private BigDecimal postal;
	private BigDecimal medical;
	private BigDecimal supplies;
	private BigDecimal meatPurchase;
	private BigDecimal otherCat;
	private BigDecimal totalPaidOuts;

	public CashReportSheetId() {
	}

	public CashReportSheetId(int id) {
		this.id = id;
	}

	public CashReportSheetId(int id, Double month, Date date, BigDecimal beginningCash, BigDecimal totalSales,
			BigDecimal subtotal1, BigDecimal paidOuts, BigDecimal subtotal2, BigDecimal deposit, BigDecimal total,
			BigDecimal endingCash, BigDecimal cashOverUnder, BigDecimal meatSales, BigDecimal tax, BigDecimal nonTax,
			BigDecimal lockerRent, BigDecimal curingandseasoning, BigDecimal processing, BigDecimal porkProcessing,
			BigDecimal deerProcessing, BigDecimal dogFood, BigDecimal hides, BigDecimal uniform, BigDecimal lunchroom,
			BigDecimal personal, BigDecimal maintance, BigDecimal donations, BigDecimal postal, BigDecimal medical,
			BigDecimal supplies, BigDecimal meatPurchase, BigDecimal otherCat, BigDecimal totalPaidOuts) {
		this.id = id;
		this.month = month;
		this.date = date;
		this.beginningCash = beginningCash;
		this.totalSales = totalSales;
		this.subtotal1 = subtotal1;
		this.paidOuts = paidOuts;
		this.subtotal2 = subtotal2;
		this.deposit = deposit;
		this.total = total;
		this.endingCash = endingCash;
		this.cashOverUnder = cashOverUnder;
		this.meatSales = meatSales;
		this.tax = tax;
		this.nonTax = nonTax;
		this.lockerRent = lockerRent;
		this.curingandseasoning = curingandseasoning;
		this.processing = processing;
		this.porkProcessing = porkProcessing;
		this.deerProcessing = deerProcessing;
		this.dogFood = dogFood;
		this.hides = hides;
		this.uniform = uniform;
		this.lunchroom = lunchroom;
		this.personal = personal;
		this.maintance = maintance;
		this.donations = donations;
		this.postal = postal;
		this.medical = medical;
		this.supplies = supplies;
		this.meatPurchase = meatPurchase;
		this.otherCat = otherCat;
		this.totalPaidOuts = totalPaidOuts;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getMonth() {
		return this.month;
	}

	public void setMonth(Double month) {
		this.month = month;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getBeginningCash() {
		return this.beginningCash;
	}

	public void setBeginningCash(BigDecimal beginningCash) {
		this.beginningCash = beginningCash;
	}

	public BigDecimal getTotalSales() {
		return this.totalSales;
	}

	public void setTotalSales(BigDecimal totalSales) {
		this.totalSales = totalSales;
	}

	public BigDecimal getSubtotal1() {
		return this.subtotal1;
	}

	public void setSubtotal1(BigDecimal subtotal1) {
		this.subtotal1 = subtotal1;
	}

	public BigDecimal getPaidOuts() {
		return this.paidOuts;
	}

	public void setPaidOuts(BigDecimal paidOuts) {
		this.paidOuts = paidOuts;
	}

	public BigDecimal getSubtotal2() {
		return this.subtotal2;
	}

	public void setSubtotal2(BigDecimal subtotal2) {
		this.subtotal2 = subtotal2;
	}

	public BigDecimal getDeposit() {
		return this.deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getEndingCash() {
		return this.endingCash;
	}

	public void setEndingCash(BigDecimal endingCash) {
		this.endingCash = endingCash;
	}

	public BigDecimal getCashOverUnder() {
		return this.cashOverUnder;
	}

	public void setCashOverUnder(BigDecimal cashOverUnder) {
		this.cashOverUnder = cashOverUnder;
	}

	public BigDecimal getMeatSales() {
		return this.meatSales;
	}

	public void setMeatSales(BigDecimal meatSales) {
		this.meatSales = meatSales;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getNonTax() {
		return this.nonTax;
	}

	public void setNonTax(BigDecimal nonTax) {
		this.nonTax = nonTax;
	}

	public BigDecimal getLockerRent() {
		return this.lockerRent;
	}

	public void setLockerRent(BigDecimal lockerRent) {
		this.lockerRent = lockerRent;
	}

	public BigDecimal getCuringandseasoning() {
		return this.curingandseasoning;
	}

	public void setCuringandseasoning(BigDecimal curingandseasoning) {
		this.curingandseasoning = curingandseasoning;
	}

	public BigDecimal getProcessing() {
		return this.processing;
	}

	public void setProcessing(BigDecimal processing) {
		this.processing = processing;
	}

	public BigDecimal getPorkProcessing() {
		return this.porkProcessing;
	}

	public void setPorkProcessing(BigDecimal porkProcessing) {
		this.porkProcessing = porkProcessing;
	}

	public BigDecimal getDeerProcessing() {
		return this.deerProcessing;
	}

	public void setDeerProcessing(BigDecimal deerProcessing) {
		this.deerProcessing = deerProcessing;
	}

	public BigDecimal getDogFood() {
		return this.dogFood;
	}

	public void setDogFood(BigDecimal dogFood) {
		this.dogFood = dogFood;
	}

	public BigDecimal getHides() {
		return this.hides;
	}

	public void setHides(BigDecimal hides) {
		this.hides = hides;
	}

	public BigDecimal getUniform() {
		return this.uniform;
	}

	public void setUniform(BigDecimal uniform) {
		this.uniform = uniform;
	}

	public BigDecimal getLunchroom() {
		return this.lunchroom;
	}

	public void setLunchroom(BigDecimal lunchroom) {
		this.lunchroom = lunchroom;
	}

	public BigDecimal getPersonal() {
		return this.personal;
	}

	public void setPersonal(BigDecimal personal) {
		this.personal = personal;
	}

	public BigDecimal getMaintance() {
		return this.maintance;
	}

	public void setMaintance(BigDecimal maintance) {
		this.maintance = maintance;
	}

	public BigDecimal getDonations() {
		return this.donations;
	}

	public void setDonations(BigDecimal donations) {
		this.donations = donations;
	}

	public BigDecimal getPostal() {
		return this.postal;
	}

	public void setPostal(BigDecimal postal) {
		this.postal = postal;
	}

	public BigDecimal getMedical() {
		return this.medical;
	}

	public void setMedical(BigDecimal medical) {
		this.medical = medical;
	}

	public BigDecimal getSupplies() {
		return this.supplies;
	}

	public void setSupplies(BigDecimal supplies) {
		this.supplies = supplies;
	}

	public BigDecimal getMeatPurchase() {
		return this.meatPurchase;
	}

	public void setMeatPurchase(BigDecimal meatPurchase) {
		this.meatPurchase = meatPurchase;
	}

	public BigDecimal getOtherCat() {
		return this.otherCat;
	}

	public void setOtherCat(BigDecimal otherCat) {
		this.otherCat = otherCat;
	}

	public BigDecimal getTotalPaidOuts() {
		return this.totalPaidOuts;
	}

	public void setTotalPaidOuts(BigDecimal totalPaidOuts) {
		this.totalPaidOuts = totalPaidOuts;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CashReportSheetId))
			return false;
		CashReportSheetId castOther = (CashReportSheetId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getMonth() == castOther.getMonth()) || (this.getMonth() != null
						&& castOther.getMonth() != null && this.getMonth().equals(castOther.getMonth())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
						&& this.getDate().equals(castOther.getDate())))
				&& ((this.getBeginningCash() == castOther.getBeginningCash())
						|| (this.getBeginningCash() != null && castOther.getBeginningCash() != null
								&& this.getBeginningCash().equals(castOther.getBeginningCash())))
				&& ((this.getTotalSales() == castOther.getTotalSales()) || (this.getTotalSales() != null
						&& castOther.getTotalSales() != null && this.getTotalSales().equals(castOther.getTotalSales())))
				&& ((this.getSubtotal1() == castOther.getSubtotal1()) || (this.getSubtotal1() != null
						&& castOther.getSubtotal1() != null && this.getSubtotal1().equals(castOther.getSubtotal1())))
				&& ((this.getPaidOuts() == castOther.getPaidOuts()) || (this.getPaidOuts() != null
						&& castOther.getPaidOuts() != null && this.getPaidOuts().equals(castOther.getPaidOuts())))
				&& ((this.getSubtotal2() == castOther.getSubtotal2()) || (this.getSubtotal2() != null
						&& castOther.getSubtotal2() != null && this.getSubtotal2().equals(castOther.getSubtotal2())))
				&& ((this.getDeposit() == castOther.getDeposit()) || (this.getDeposit() != null
						&& castOther.getDeposit() != null && this.getDeposit().equals(castOther.getDeposit())))
				&& ((this.getTotal() == castOther.getTotal()) || (this.getTotal() != null
						&& castOther.getTotal() != null && this.getTotal().equals(castOther.getTotal())))
				&& ((this.getEndingCash() == castOther.getEndingCash()) || (this.getEndingCash() != null
						&& castOther.getEndingCash() != null && this.getEndingCash().equals(castOther.getEndingCash())))
				&& ((this.getCashOverUnder() == castOther.getCashOverUnder())
						|| (this.getCashOverUnder() != null && castOther.getCashOverUnder() != null
								&& this.getCashOverUnder().equals(castOther.getCashOverUnder())))
				&& ((this.getMeatSales() == castOther.getMeatSales()) || (this.getMeatSales() != null
						&& castOther.getMeatSales() != null && this.getMeatSales().equals(castOther.getMeatSales())))
				&& ((this.getTax() == castOther.getTax()) || (this.getTax() != null && castOther.getTax() != null
						&& this.getTax().equals(castOther.getTax())))
				&& ((this.getNonTax() == castOther.getNonTax()) || (this.getNonTax() != null
						&& castOther.getNonTax() != null && this.getNonTax().equals(castOther.getNonTax())))
				&& ((this.getLockerRent() == castOther.getLockerRent()) || (this.getLockerRent() != null
						&& castOther.getLockerRent() != null && this.getLockerRent().equals(castOther.getLockerRent())))
				&& ((this.getCuringandseasoning() == castOther.getCuringandseasoning())
						|| (this.getCuringandseasoning() != null && castOther.getCuringandseasoning() != null
								&& this.getCuringandseasoning().equals(castOther.getCuringandseasoning())))
				&& ((this.getProcessing() == castOther.getProcessing()) || (this.getProcessing() != null
						&& castOther.getProcessing() != null && this.getProcessing().equals(castOther.getProcessing())))
				&& ((this.getPorkProcessing() == castOther.getPorkProcessing())
						|| (this.getPorkProcessing() != null && castOther.getPorkProcessing() != null
								&& this.getPorkProcessing().equals(castOther.getPorkProcessing())))
				&& ((this.getDeerProcessing() == castOther.getDeerProcessing())
						|| (this.getDeerProcessing() != null && castOther.getDeerProcessing() != null
								&& this.getDeerProcessing().equals(castOther.getDeerProcessing())))
				&& ((this.getDogFood() == castOther.getDogFood()) || (this.getDogFood() != null
						&& castOther.getDogFood() != null && this.getDogFood().equals(castOther.getDogFood())))
				&& ((this.getHides() == castOther.getHides()) || (this.getHides() != null
						&& castOther.getHides() != null && this.getHides().equals(castOther.getHides())))
				&& ((this.getUniform() == castOther.getUniform()) || (this.getUniform() != null
						&& castOther.getUniform() != null && this.getUniform().equals(castOther.getUniform())))
				&& ((this.getLunchroom() == castOther.getLunchroom()) || (this.getLunchroom() != null
						&& castOther.getLunchroom() != null && this.getLunchroom().equals(castOther.getLunchroom())))
				&& ((this.getPersonal() == castOther.getPersonal()) || (this.getPersonal() != null
						&& castOther.getPersonal() != null && this.getPersonal().equals(castOther.getPersonal())))
				&& ((this.getMaintance() == castOther.getMaintance()) || (this.getMaintance() != null
						&& castOther.getMaintance() != null && this.getMaintance().equals(castOther.getMaintance())))
				&& ((this.getDonations() == castOther.getDonations()) || (this.getDonations() != null
						&& castOther.getDonations() != null && this.getDonations().equals(castOther.getDonations())))
				&& ((this.getPostal() == castOther.getPostal()) || (this.getPostal() != null
						&& castOther.getPostal() != null && this.getPostal().equals(castOther.getPostal())))
				&& ((this.getMedical() == castOther.getMedical()) || (this.getMedical() != null
						&& castOther.getMedical() != null && this.getMedical().equals(castOther.getMedical())))
				&& ((this.getSupplies() == castOther.getSupplies()) || (this.getSupplies() != null
						&& castOther.getSupplies() != null && this.getSupplies().equals(castOther.getSupplies())))
				&& ((this.getMeatPurchase() == castOther.getMeatPurchase())
						|| (this.getMeatPurchase() != null && castOther.getMeatPurchase() != null
								&& this.getMeatPurchase().equals(castOther.getMeatPurchase())))
				&& ((this.getOtherCat() == castOther.getOtherCat()) || (this.getOtherCat() != null
						&& castOther.getOtherCat() != null && this.getOtherCat().equals(castOther.getOtherCat())))
				&& ((this.getTotalPaidOuts() == castOther.getTotalPaidOuts())
						|| (this.getTotalPaidOuts() != null && castOther.getTotalPaidOuts() != null
								&& this.getTotalPaidOuts().equals(castOther.getTotalPaidOuts())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getMonth() == null ? 0 : this.getMonth().hashCode());
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getBeginningCash() == null ? 0 : this.getBeginningCash().hashCode());
		result = 37 * result + (getTotalSales() == null ? 0 : this.getTotalSales().hashCode());
		result = 37 * result + (getSubtotal1() == null ? 0 : this.getSubtotal1().hashCode());
		result = 37 * result + (getPaidOuts() == null ? 0 : this.getPaidOuts().hashCode());
		result = 37 * result + (getSubtotal2() == null ? 0 : this.getSubtotal2().hashCode());
		result = 37 * result + (getDeposit() == null ? 0 : this.getDeposit().hashCode());
		result = 37 * result + (getTotal() == null ? 0 : this.getTotal().hashCode());
		result = 37 * result + (getEndingCash() == null ? 0 : this.getEndingCash().hashCode());
		result = 37 * result + (getCashOverUnder() == null ? 0 : this.getCashOverUnder().hashCode());
		result = 37 * result + (getMeatSales() == null ? 0 : this.getMeatSales().hashCode());
		result = 37 * result + (getTax() == null ? 0 : this.getTax().hashCode());
		result = 37 * result + (getNonTax() == null ? 0 : this.getNonTax().hashCode());
		result = 37 * result + (getLockerRent() == null ? 0 : this.getLockerRent().hashCode());
		result = 37 * result + (getCuringandseasoning() == null ? 0 : this.getCuringandseasoning().hashCode());
		result = 37 * result + (getProcessing() == null ? 0 : this.getProcessing().hashCode());
		result = 37 * result + (getPorkProcessing() == null ? 0 : this.getPorkProcessing().hashCode());
		result = 37 * result + (getDeerProcessing() == null ? 0 : this.getDeerProcessing().hashCode());
		result = 37 * result + (getDogFood() == null ? 0 : this.getDogFood().hashCode());
		result = 37 * result + (getHides() == null ? 0 : this.getHides().hashCode());
		result = 37 * result + (getUniform() == null ? 0 : this.getUniform().hashCode());
		result = 37 * result + (getLunchroom() == null ? 0 : this.getLunchroom().hashCode());
		result = 37 * result + (getPersonal() == null ? 0 : this.getPersonal().hashCode());
		result = 37 * result + (getMaintance() == null ? 0 : this.getMaintance().hashCode());
		result = 37 * result + (getDonations() == null ? 0 : this.getDonations().hashCode());
		result = 37 * result + (getPostal() == null ? 0 : this.getPostal().hashCode());
		result = 37 * result + (getMedical() == null ? 0 : this.getMedical().hashCode());
		result = 37 * result + (getSupplies() == null ? 0 : this.getSupplies().hashCode());
		result = 37 * result + (getMeatPurchase() == null ? 0 : this.getMeatPurchase().hashCode());
		result = 37 * result + (getOtherCat() == null ? 0 : this.getOtherCat().hashCode());
		result = 37 * result + (getTotalPaidOuts() == null ? 0 : this.getTotalPaidOuts().hashCode());
		return result;
	}

}