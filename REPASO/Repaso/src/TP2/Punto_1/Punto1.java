/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2.Punto_1;

import java.util.List;
import java.util.stream.Stream;
import TP2.music.Album;
import TP2.music.Artist;

/**
 *
 * @author agusg
 */
public class Punto1 {
    public int addup(Stream <Integer> nums){
        return nums
                .mapToInt(x -> x)
                .sum();
    }
    
    public List<String> artistInfo(Stream <Artist> a){
        return a
                .map(artist -> artist.getName() + " | " + artist.getNationality() + ", ")
                .toList();
    }
    
    public List<Album> nameTracks(Stream <Album> albums){
        return albums
                .filter(tracks -> tracks.getTrackList().size() <= 3)
                //.map(album -> album.getName() + ", ")
                .toList();
    }
}
