package com.dxctraining.librarymgt.ui;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.librarymgt.entities.Guest;
import com.dxctraining.librarymgt.service.GuestServiceImplementation;
import com.dxctraining.librarymgt.service.IguestService;

@Component
public class GuestMain {

	@Autowired
	private IguestService guestservice = new GuestServiceImplementation();

	public static void main(String[] args) {
		GuestMain guestDemo = new GuestMain();
		guestDemo.runApp();
	}

	@PostConstruct
	private void runApp() {
		Guest guest1 = new Guest("pravallika", "x11");
		Guest guest2 = new Guest("pragathi", "x12");
		guestservice.register(guest1);
		guestservice.register(guest2);
		showGuests();
	}

	private void showGuests() {
		List<Guest> list = guestservice.display();
		System.out.println("DISPLAYING ALL THE GUESTS");
		for (Guest guest : list) {
			displayGuest(guest);
		}
	}

	private void displayGuest(Guest guest) {
		String name = guest.getName();
		String id = guest.getId();
		System.out.println("The Name is=" + name + " The id is=" + id);
	}
}