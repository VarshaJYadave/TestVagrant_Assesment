package com.testvagrant.recentlyplayedsongs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Varsha J Yadave
 *
 */
public class RecentlyPlayedStore {
	private int capacity;
	private Map<String, LinkedList<String>> userSongs;

	public RecentlyPlayedStore(int capacity) {
		this.capacity = capacity;
		this.userSongs = new HashMap<>();
	}

	public void addSong(String user, String song) {
		LinkedList<String> songs = userSongs.getOrDefault(user, new LinkedList<>());

		// Remove the song if it already exists in the list
		songs.remove(song);

		// Add the new song to the front of the list
		songs.addFirst(song);

		// If the list exceeds the capacity, remove the last element
		if (songs.size() > capacity) {
			songs.removeLast();
		}

		// Update the map
		userSongs.put(user, songs);
	}

	public List<String> getRecentSongs(String user) {
		LinkedList<String> songs = userSongs.get(user);
		if (songs == null) {
			return Collections.emptyList();
		}
		return new ArrayList<>(songs);
	}
}
