package com.example;
import java.io.FileInputStream;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class AudioPlayer {

    private Player player;
    private Thread playerThread;

    public void playMP3(String filePath) {
        playerThread = new Thread(() -> {
            try (FileInputStream fis = new FileInputStream(filePath)) {
                player = new Player(fis);
                player.play();
            } catch (JavaLayerException | IOException e) {
                e.printStackTrace();
            }
        });
        playerThread.start();
    }

    public void stopMP3() {
        if (player != null) {
            player.close(); // Dies beendet das Abspielen der MP3-Datei
        }
        if (playerThread != null) {
            playerThread.interrupt(); // Dies unterbricht den Thread
        }
    }

    public static void playMenu() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playMP3("demo\\src\\main\\java\\com\\example\\ost\\fightmusic.mp3");
    }
}

