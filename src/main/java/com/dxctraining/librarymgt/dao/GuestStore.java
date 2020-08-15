package com.dxctraining.librarymgt.dao;

import java.util.HashMap;
import java.util.Map;

import com.dxctraining.librarymgt.entities.Guest;

public class GuestStore {
	private static Map<String, Guest> guestMap = new HashMap<>();

	public static Map<String, Guest> getGuestMap() {
		return guestMap;
	}
}