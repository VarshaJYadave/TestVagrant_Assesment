package com.testvagrant.recentlyplayedsongs;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author Varsha J Yadave
 *
 */
public class RecentlyPlayedStoreTest {

	@Test
	public void testRecentlyPlayedStore() {
		RecentlyPlayedStore store = new RecentlyPlayedStore(3);

		store.addSong("user1", "S1");
		store.addSong("user1", "S2");
		store.addSong("user1", "S3");
		assertEquals(Arrays.asList("S3", "S2", "S1"), store.getRecentSongs("user1"));

		store.addSong("user1", "S4");
		assertEquals(Arrays.asList("S4", "S3", "S2"), store.getRecentSongs("user1"));

		store.addSong("user1", "S2");
		assertEquals(Arrays.asList("S2", "S4", "S3"), store.getRecentSongs("user1"));
	}
}