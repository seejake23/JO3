package J03.weekTwo.Album;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        
        Album album1 = new Album("Shadow of Intent", "Elegy", "Deathcore", 10, 60.0, 2022);
        Album album2 = new Album("Angel Vivaldi", "Away With Words, Pt. 2", "Prog Metal", 5, 19.5, 2023);
        Album album3 = new Album("Periphery", "Periphery V: Djent Is Not A Genre", "Djent", 9, 70, 2023);


        
        album1.describeAlbum();
        album1.playSong(1);
        album1.skipSong(1);
        album1.previousSong(2); 
        album1.pauseSong();
        album2.describeAlbum();
        album3.describeAlbum();

        album2.playSong(4);
        album2.skipSong(4);

        album1.shuffleSong(album1.numberOfTracks);
        album2.shuffleSong(album2.numberOfTracks);
        album3.shuffleSong(album3.numberOfTracks);

    }
}
