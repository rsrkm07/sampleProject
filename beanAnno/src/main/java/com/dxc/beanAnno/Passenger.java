package com.dxc.beanAnno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("p1")
//@Controller
//@Service
//@Repository
public class Passenger {
	
	private int pid;
	
	private String pname;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	

}
