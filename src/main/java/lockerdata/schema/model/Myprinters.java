package lockerdata.schema.model;
// Generated Feb 17, 2018 5:14:42 PM by Hibernate Tools 5.2.8.Final

/**
 * Myprinters generated by hbm2java
 */
public class Myprinters implements java.io.Serializable {

	private Integer counter;
	private String printerDesc;
	private String printerName;
	private String serverName;

	public Myprinters() {
	}

	public Myprinters(String printerDesc, String printerName, String serverName) {
		this.printerDesc = printerDesc;
		this.printerName = printerName;
		this.serverName = serverName;
	}

	public Integer getCounter() {
		return this.counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public String getPrinterDesc() {
		return this.printerDesc;
	}

	public void setPrinterDesc(String printerDesc) {
		this.printerDesc = printerDesc;
	}

	public String getPrinterName() {
		return this.printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

}