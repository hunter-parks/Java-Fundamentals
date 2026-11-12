public class Song {
    private String title;
    private String artist;
    private int streams;

    public Song(String title, String artist, int streams) {
        this.title = title;
        this.artist = artist;
        this.streams = streams;
    }

    public void addStreams(int additionalStreams) {
        streams += additionalStreams;
    }

    // Creating my Getters & Setters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getStreams() {
        return streams;
    }

    public void setStreams(int streams) {
        if (streams >= 0) {
            this.streams = streams;
        }
    }
}
