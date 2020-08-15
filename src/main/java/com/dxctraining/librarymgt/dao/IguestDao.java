package com.dxctraining.librarymgt.dao;

import java.util.List;

import com.dxctraining.librarymgt.entities.Guest;

public interface IguestDao {
	public Guest findById(String id);

	public void remove(String id);

	public void register(Guest guest);

	public List<Guest> guestlist();

}
