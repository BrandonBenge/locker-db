package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

/**
 * Carriers generated by hbm2java
 */
public class Carriers implements java.io.Serializable {

	private Integer id;
	private String carrier;
	private String code;

	public Carriers() {
	}

	public Carriers(String carrier, String code) {
		this.carrier = carrier;
		this.code = code;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarrier() {
		return this.carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}