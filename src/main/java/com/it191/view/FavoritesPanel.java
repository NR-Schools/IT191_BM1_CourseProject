package com.it191.view;

import java.util.ArrayList;

import javax.swing.JPanel;

import com.it191.controller.FavoritesController;
import com.it191.model.SongModel;
import com.it191.view.listeners.ISongRequestListener;
import com.it191.view.listeners.ISongUpdateListener;
import com.it191.view.objects.SongEvent;

public class FavoritesPanel extends JPanel implements ISongUpdateListener {

    private FavoritesController favoritesController;
    private ISongRequestListener songRequestListener;
    private String songFilterQuery;

    private ArrayList<SongModel> loadedSongs;

    public FavoritesPanel() {
        this.onUISetup();
        this.favoritesController = new FavoritesController();
        this.songFilterQuery = "";
        this.loadedSongs = favoritesController.getFavoriteSongs();
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
            favoritesController.addSongToFavorites(evt);
        } else {
            favoritesController.removeSongFromFavorites(evt);
        }

        this.onRefreshSongs();
    }
}
