TestVagrant

Coding Assignment

OVERVIEW
Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. This store must have the capability to store a list of song-user pairs, with each song linked to a user. It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.

EXAMPLE
Illustration, when 4 different songs were played by a user & Initial capacity is 3: 
Let's assume that the user has played 3 songs - S1, S2 and S3.
The playlist would look like -> S1,S2,S3
When S4 song is played -> S2,S3,S4 
When S2 song is played -> S3,S4,S2 
When S1 song is played -> S4,S2,S1

EXPECTATIONS
Adhere to clean coding standards and principles. OOP is recommended.
Write tests to test the logic

Explanation:

The RecentlyPlayedStore class represents the in-memory store for recently played songs.
The capacity field represents the maximum number of songs that can be stored per user.
The userSongs map stores the list of songs for each user.
The addSong method adds a new song for a given user. If the song already exists in the list, it is removed first. If the list exceeds the capacity, the least recently played song (i.e. the last element) is removed.