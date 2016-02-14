package br.com.cinq.sample.bean;

import org.springframework.stereotype.Component;

/**
 * POJO used to store information
 */
@Component
public class Person {
    private int id;
	private String name;
    private String disclosableInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisclosableInfo() {
		return disclosableInfo;
	}

	public void setDisclosableInfo(String disclosableInfo) {
		this.disclosableInfo = disclosableInfo;
	}

}
