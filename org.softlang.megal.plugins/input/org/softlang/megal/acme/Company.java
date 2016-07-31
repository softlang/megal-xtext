package org.softlang.megal.acme;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company {

	
	private String name;
	private List<Department> departments = new ArrayList<Department>();
	
	public Company () {
		
	}
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	public void addDepartment(Department department) {
		departments.add(department);
	}
	
}
