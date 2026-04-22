import java.util.*;

class MusicPlaylist {
    private LinkedList<String> playlist = new LinkedList<>();

    void addSong(String song) {
        playlist.add(song);
        System.out.println("Added: " + song);
    }

    void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Current Playlist: " + playlist);
        }
    }

    void playFirst() {
        if (!playlist.isEmpty()) {
            System.out.println("Playing: " + playlist.removeFirst());
        } else {
            System.out.println("No songs to play.");
        }
    }

    void skipLast() {
        if (!playlist.isEmpty()) {
            System.out.println("Skipped: " + playlist.removeLast());
        } else {
            System.out.println("No songs to skip.");
        }
    }
}

public class PBL31_MusicPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlaylist mp = new MusicPlaylist();

        System.out.print("How many songs to add? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Song " + (i + 1) + ": ");
            mp.addSong(sc.nextLine());
        }

        System.out.println("\n--- Full Playlist ---");
        mp.displayPlaylist();

        System.out.println("\n--- Playing First Song ---");
        mp.playFirst();
        mp.displayPlaylist();

        System.out.println("\n--- Skipping Last Song ---");
        mp.skipLast();
        mp.displayPlaylist();

        sc.close();
    }
}
