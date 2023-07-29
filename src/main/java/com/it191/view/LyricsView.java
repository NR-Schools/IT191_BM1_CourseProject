package com.it191.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class LyricsView extends JPanel {

    private javax.swing.JPanel favoritesBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lyricsBtn;
    private javax.swing.JLabel nameOfArtist;
    private javax.swing.JLabel nextBtn;
    private javax.swing.JLabel pauseBtn;
    private javax.swing.JLabel playBtn;
    private javax.swing.JPanel playlistsBtn;
    private javax.swing.JLabel previousBtn;
    private javax.swing.JTextField searchBar;
    private javax.swing.JSlider seekSlider;
    private javax.swing.JLabel songTitle;
    private javax.swing.JPanel songsBtn;
    private javax.swing.JLabel stopBtn;
    private javax.swing.JLabel volumeIcon;
    private javax.swing.JSlider volumeSlider;
    

    public LyricsView(){
        this.setLayout(new BorderLayout());

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        volumeIcon = new javax.swing.JLabel();
        volumeSlider = new javax.swing.JSlider();
        lyricsBtn = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        songTitle = new javax.swing.JLabel();
        nameOfArtist = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        seekSlider = new javax.swing.JSlider();
        jPanel17 = new javax.swing.JPanel();
        previousBtn = new javax.swing.JLabel();
        pauseBtn = new javax.swing.JLabel();
        playBtn = new javax.swing.JLabel();
        stopBtn = new javax.swing.JLabel();
        nextBtn = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        songsBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        playlistsBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        favoritesBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1.setBackground(new java.awt.Color(244, 245, 254));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(82, 89, 114));
        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 130));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel14.setBackground(new java.awt.Color(72, 51, 87));
        jPanel14.setPreferredSize(new java.awt.Dimension(302, 113));
        jPanel14.setLayout(new java.awt.GridBagLayout());

        volumeIcon.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\volumeIcon.png"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanel14.add(volumeIcon, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 145;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 8, 0, 32);
        jPanel14.add(volumeSlider, gridBagConstraints);
        volumeSlider.setOpaque(false);

        lyricsBtn.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\lyrics-icon.png"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 40, 0);
        jPanel14.add(lyricsBtn, gridBagConstraints);

        jPanel2.add(jPanel14, java.awt.BorderLayout.EAST);

        jPanel16.setBackground(new java.awt.Color(72, 51, 87));
        jPanel16.setPreferredSize(new java.awt.Dimension(302, 113));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        songTitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        songTitle.setForeground(new java.awt.Color(255, 255, 255));
        songTitle.setText("Song Title");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 12, 0, 0);
        jPanel16.add(songTitle, gridBagConstraints);

        nameOfArtist.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        nameOfArtist.setForeground(new java.awt.Color(255, 255, 255));
        nameOfArtist.setText("Name of Artist");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 28);
        jPanel16.add(nameOfArtist, gridBagConstraints);

        jLabel23.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\album-cover - Copy.jpg"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 0);
        jPanel16.add(jLabel23, gridBagConstraints);

        jPanel2.add(jPanel16, java.awt.BorderLayout.WEST);

        jPanel18.setBackground(new java.awt.Color(72, 51, 87));

        jPanel15.setBackground(new java.awt.Color(72, 51, 87));
        jPanel15.setPreferredSize(new java.awt.Dimension(735, 130));
        jPanel15.setLayout(new java.awt.BorderLayout(0, -35));

        seekSlider.setPaintLabels(true);
        jPanel15.add(seekSlider, java.awt.BorderLayout.CENTER);
        seekSlider.setOpaque(false);

        jPanel17.setBackground(new java.awt.Color(72, 51, 87));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 25));

        previousBtn.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\previous-button.png"));
        jPanel17.add(previousBtn);

        pauseBtn.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\pause-button.png"));
        jPanel17.add(pauseBtn);

        playBtn.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\play-button.png"));
        jPanel17.add(playBtn);

        stopBtn.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\stop-button.png"));
        jPanel17.add(stopBtn);

        nextBtn.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\next-button.png"));
        jPanel17.add(nextBtn);

        jPanel15.add(jPanel17, java.awt.BorderLayout.NORTH);

        jPanel18.add(jPanel15);

        jPanel2.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(72, 51, 87));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 100));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\logo.png"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 580, 16, 0);
        jPanel3.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Music Player");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 16, 0, 601);
        jPanel3.add(jLabel8, gridBagConstraints);

        jPanel4.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(1300, 10));
        jPanel5.add(jPanel9, java.awt.BorderLayout.NORTH);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(1300, 10));
        jPanel5.add(jPanel7, java.awt.BorderLayout.SOUTH);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(10, 494));
        jPanel5.add(jPanel8, java.awt.BorderLayout.WEST);

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setPreferredSize(new java.awt.Dimension(10, 494));
        jPanel5.add(jPanel10, java.awt.BorderLayout.EAST);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new java.awt.BorderLayout(10, 10));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(250, 494));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel19.setPreferredSize(new java.awt.Dimension(250, 205));

        jLabel25.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\album-cover - Copy - Copy.jpg"));
        jPanel19.add(jLabel25);

        jPanel11.add(jPanel19, java.awt.BorderLayout.NORTH);

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel21.setLayout(new java.awt.GridBagLayout());

        songsBtn.setBackground(new java.awt.Color(102, 102, 102));
        songsBtn.setPreferredSize(new java.awt.Dimension(250, 97));
        songsBtn.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Songs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 31, 31, 76);
        songsBtn.add(jLabel2, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\songs-icon.png"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 26, 31, 0);
        songsBtn.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 0, 0, 0);
        jPanel21.add(songsBtn, gridBagConstraints);

        playlistsBtn.setBackground(new java.awt.Color(102, 102, 102));
        playlistsBtn.setPreferredSize(new java.awt.Dimension(250, 97));
        playlistsBtn.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Playlists");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 18, 29, 48);
        playlistsBtn.add(jLabel3, gridBagConstraints);

        jLabel14.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\playlist-icon.png"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 24, 29, 0);
        playlistsBtn.add(jLabel14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 171, 0);
        jPanel21.add(playlistsBtn, gridBagConstraints);

        favoritesBtn.setBackground(new java.awt.Color(102, 102, 102));
        favoritesBtn.setPreferredSize(new java.awt.Dimension(250, 97));
        favoritesBtn.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Favorites");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 25, 27, 34);
        favoritesBtn.add(jLabel1, gridBagConstraints);

        jLabel9.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\favorites-icon.png"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 25, 0, 0);
        favoritesBtn.add(jLabel9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        jPanel21.add(favoritesBtn, gridBagConstraints);

        jPanel11.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel11, java.awt.BorderLayout.WEST);

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setDoubleBuffered(false);
        jPanel13.setLayout(new java.awt.BorderLayout(0, 10));

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.setPreferredSize(new java.awt.Dimension(1193, 50));
        jPanel23.setLayout(new java.awt.BorderLayout());

        searchBar.setBackground(new java.awt.Color(51, 51, 51));
        searchBar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        searchBar.setForeground(new java.awt.Color(255, 255, 255));
        searchBar.setBorder(null);
        jPanel23.add(searchBar, java.awt.BorderLayout.CENTER);

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel24.setLayout(new java.awt.GridBagLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon("target\\classes\\com\\it191\\view\\images\\search-icon.png"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 19, 0, 17);
        jPanel24.add(jLabel12, gridBagConstraints);

        jPanel23.add(jPanel24, java.awt.BorderLayout.WEST);

        jPanel13.add(jPanel23, java.awt.BorderLayout.NORTH);

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(null);

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setPreferredSize(new java.awt.Dimension(200, 1000));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        jPanel27.setPreferredSize(new java.awt.Dimension(10, 1000));
        jPanel27.setLayout(null);
        jPanel22.add(jPanel27, java.awt.BorderLayout.LINE_START);

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        jPanel26.setPreferredSize(new java.awt.Dimension(1180, 10));
        jPanel22.add(jPanel26, java.awt.BorderLayout.PAGE_START);

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        jPanel28.setPreferredSize(new java.awt.Dimension(10, 990));
        jPanel22.add(jPanel28, java.awt.BorderLayout.LINE_END);

        jPanel29.setBackground(new java.awt.Color(51, 51, 51));
        jPanel29.setPreferredSize(new java.awt.Dimension(0, 10));
        jPanel22.add(jPanel29, java.awt.BorderLayout.SOUTH);

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("STXihei", 1, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel22.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel22);

        jPanel13.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        this.add(jPanel1, java.awt.BorderLayout.CENTER);
    }
}