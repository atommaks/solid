package ru.atom.solid.lsp.violation;

import java.util.ArrayList;
import java.util.List;

public class ClientTestProgram {
    public static void main(String[] args) {
        List<MediaPlayer> players = new ArrayList<>();
        players.add(new VlcMediaPlayer());
        players.add(new TorMediaPlayer());
        playVideoFiles(players);

        System.out.println("----------------------");
        players.add(new WinampMediaPlayer());
        playVideoFiles(players);
    }

    public static void playVideoFiles(List<MediaPlayer> players) {
        players.forEach(MediaPlayer::playVideo);
    }
}
