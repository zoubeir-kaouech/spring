package tn.fst.persistance;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.fst.persistance.Employee;

/**
 * Entity implementation class for Entity: Commercila
 *
 */
@Entity

public class Commercila extends Employee implements Serializable {

	
	private String code;
	private static final long serialVersionUID = 1L;

	public Commercila() {
		super();
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
   
}
