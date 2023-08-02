package com.it191.view;

import java.util.ArrayList;

import javax.swing.JPanel;

import com.it191.controller.SongsController;
import com.it191.model.SongModel;
import com.it191.view.listeners.ISongRequestListener;
import com.it191.view.listeners.ISongUpdateListener;
import com.it191.view.objects.SongEvent;

public class SongsPanel extends JPanel implements ISongUpdateListener {

    private SongsController songsController;
    private ISongRequestListener songRequestListener;
    private String songFilterQuery;

    private ArrayList<SongModel> loadedSongs;

    public SongsPanel() {
        this.onUISetup();
        this.songsController = new SongsController();
        this.songFilterQuery = "";
        this.loadedSongs = songsController.getSongs();
    }

    public void setSongRequestListener(ISongRequestListener songRequestListener) {
        this.songRequestListener = songRequestListener;
    }

    private void onUISetup() {
        this.setBackground(new java.awt.Color(51, 51, 51));
        this.setLayout(new java.awt.GridLayout(10, 1));
    }

    public void setSongFilterByName(String name) {
        this.songFilterQuery = name;
        this.onRefreshSongs();
    }

    public void onRefreshSongs() {
        this.removeAll();

        for (SongModel songModel : loadedSongs) {

            if(!songModel.getTitle().toLowerCase().contains(songFilterQuery.toLowerCase()) && !songFilterQuery.trim().isEmpty())
                continue;

            SongItem songItem = new SongItem(songModel);
            songItem.setSongRequestListener(songRequestListener);
            songItem.setSongUpdateListener(this);
            this.add(songItem);
        }

        this.repaint();
        this.revalidate();
    }

    @Override
    public void onSongUpdate(SongEvent evt) {
        if (evt.isInFavorites()) {
            songsController.addSongToFavorites(evt);
        } else {
            songsController.removeSongFromFavorites(evt);
        }
    }
}
