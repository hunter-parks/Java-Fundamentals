public class MusicLibrary {
    private Song[] songs;

    public MusicLibrary(Song[] songs) {
        this.songs = songs;
    }

    public int getSongCount() {
        return songs.length;
    }

    public void displaySongs() {
        for (int i = 0; i < songs.length; i++) {
            System.out.println(songs[i].getTitle() + ": " + songs[i].getStreams() + " streams");
        }
    }

    public int calculateTotalStreams() {

        int totalStreams = 0;
        for (Song song : songs) {
            totalStreams += song.getStreams();
        }

        return totalStreams;
    }

    public Song findMostPopularSong() {
        Song highestStreams = songs[0];

        for (int i = 1; i < songs.length; i++) {
            if (songs[i].getStreams() > highestStreams.getStreams()) {
                highestStreams = songs[i];
            }
        }

        return highestStreams;
    }

    public Song findSongByTitle(String title) {
        String song = title;

        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getTitle().equalsIgnoreCase(title)) {
                return songs[i];
            }
        }
        return null;
    }

    public boolean addStreamsToSong(String title, int additionalStreams) {

        Song foundSong = findSongByTitle(title);

        if (foundSong != null && additionalStreams > 0) {
            foundSong.addStreams(additionalStreams);
            return true;
        }

        return false;
    }

}
