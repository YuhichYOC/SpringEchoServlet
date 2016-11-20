package test07.eureka3.com;

import java.io.Serializable;

public class EchoForm implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	public void setName(String value) {
		this.name = value;
	}
	public String getName() {
		return this.name;
	}
	
}
