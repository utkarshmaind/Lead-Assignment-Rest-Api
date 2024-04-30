package com.leadassignment.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Attribute {
    private String key;
    public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	private String value;
}

