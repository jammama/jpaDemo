package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.Getter;

@Embeddable
@Getter
public class Address {
	private String city;
	private String street;
	private String zipCode;
	
	public String fullAddress() {
		return getCity() + " " + getStreet() + " " + getZipCode();
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, street, zipCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.getCity()) && Objects.equals(street, other.getStreet())
				&& Objects.equals(zipCode, other.getZipCode());
	}
	

	
	
}
