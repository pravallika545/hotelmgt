package com.dxctraining.librarymgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.librarymgt.dao.GuestDaoImplem;
import com.dxctraining.librarymgt.dao.IguestDao;
import com.dxctraining.librarymgt.entities.Guest;
import com.dxctraining.librarymgt.exceptions.NullException;

@Service
public class GuestServiceImplementation implements IguestService {

	@Autowired
	private IguestDao guestDao = new GuestDaoImplem();

	@Override
	public void register(Guest guest) {
		guestDao.register(guest);
	}

	@Override
	public void removeGuest(String id) {
		validateId(id);
		guestDao.remove(id);
	}

	private void validateId(String id) {
		if (id == null || id.isEmpty()) {
			throw new NullException("id cant be empty and null");
		}
	}

	@Override
	public List<Guest> display() {
		List<Guest> list = guestDao.guestlist();
		return list;
	}

	@Override
	public Guest findById(String id) {
		validateId(id);
		Guest guest = guestDao.findById(id);
		return guest;
	}
}
