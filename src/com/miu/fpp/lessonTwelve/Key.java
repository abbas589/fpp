package com.miu.fpp.lessonTwelve;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Key key = (Key) o;
		return Objects.equals(firstName, key.firstName) && Objects.equals(lastName, key.lastName);
	}

	@Override
	public int hashCode() {

//		return Objects.hash(firstName, lastName);
		String fullName = firstName + lastName;

		int sumOfNames = 0;
		for (int i = 0; i < fullName.length(); i++) {
			sumOfNames+= fullName.charAt(i);
		}



		return sumOfNames;
	}
}
