package com.dxctraining.librarymgt.entities;

public class Guest {
	private String name;
	private String id;

	public Guest(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Guest() {
		this("", "1");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int hashCode() {
		int idhash = id.hashCode();
		return idhash;
	}

	@Override
	public boolean equals(Object Arg) {
		if (Arg == this) {
			return true;
		}
		if (Arg == null || !(Arg instanceof Guest)) {
			return false;
		}
		Guest that = (Guest) Arg;
		boolean isequal = this.id.equals(that.id);
		return isequal;
	}
}
