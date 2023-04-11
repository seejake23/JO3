package J03.weekTwo.Album;


import java.util.ArrayList;

public class Album {

    String artistName;
    String albumName;
    String genre;
    int numberOfTracks;
    double runtime;
    int releaseYear;

    

    public Album(String artistName, String albumName, String genre, int numberOfTracks, double runtime, int releaseYear) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.genre = genre;
        this.numberOfTracks = numberOfTracks;
        this.runtime = runtime;
        this.releaseYear = releaseYear;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public double getRuntime() {
        return runtime;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void playSong(int trackNumber) {
        System.out.println("Track " + trackNumber + " is playing.");
    }

    public void skipSong(int trackNumber) {
        trackNumber += 1;
        System.out.println("Track " + trackNumber + " is playing.");
    }

    public void previousSong(int trackNumber) {
        if (trackNumber == 1) {
            System.out.println("Track 1 has reset, you cannot go back further.");
        }
        else {
            System.out.println(("Track " + trackNumber + " is playing."));
            trackNumber -= 1;
        } 
    }

    public void pauseSong() {
        System.out.println("Song is paused.");
    }



    public void describeAlbum() {
        System.out.println(getAlbumName() + " is by the " + getGenre() + " band " + getArtistName());
        System.out.println("It was released in " + getReleaseYear() + ", and has " + getNumberOfTracks() + " tracks, with a runtime of " + getRuntime() + " minutes.");
    }

    public void shuffleSong(int numberOfTracks) {
        double shuffle = (Math.random() * numberOfTracks) + 1;
        int shuffledTrack = (int) shuffle;
        System.out.println(("Track " + shuffledTrack + " is playing.")); 
    }

    
}




