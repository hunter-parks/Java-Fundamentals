public class MusicApp {
    public static void main(String[] args) {

        // Creating array named songs
        Song[] songs = new Song[4];

        // Intializing new objects for Songs array
        songs[0] = new Song("Blinding Lights", "The Weeknd", 2500);
        songs[1] = new Song("Starboy", "The Weeknd", 1800);
        songs[2] = new Song("Bad Habit", "Steve Lacy", 1200);
        songs[3] = new Song("See You Again", "Tyler, the Creator", 900);

        // Music Library Mini Project
        MusicLibrary library = new MusicLibrary(songs);

        System.out.println("Songs in Library: " + library.getSongCount());

        // Print the total number of streams
        library.displaySongs();
        int totalStreams = library.calculateTotalStreams();
        Song popularSong = library.findMostPopularSong();

        System.out.println("Total Streams: " + totalStreams);
        System.out.println(
                "Most Popular Song: " + popularSong.getTitle() + " (" + popularSong.getStreams() + " streams)");

        Song searchedSong = library.findSongByTitle("starboy");
        if (searchedSong != null) {
            System.out.println(
                    "Found song: " + searchedSong.getTitle() + " (" + searchedSong.getStreams() + " streams)");
        } else {
            System.out.println("Song not found: starboy");
        }

        boolean streamsAdded = library.addStreamsToSong("Starboy", 500);
        System.out.println("Adding 500 streams to Starboy succeeded: " + streamsAdded);

        Song unknownSong = library.findSongByTitle("Unknown Song");
        System.out.println("Unknown Song found: " + (unknownSong != null));

        boolean invalidStreamsAdded = library.addStreamsToSong("Starboy", -100);
        System.out.println("Adding -100 streams to Starboy succeeded: " + invalidStreamsAdded);

        int updatedTotalStreams = library.calculateTotalStreams();
        System.out.println("Updated Total Streams: " + updatedTotalStreams);
    }
}
