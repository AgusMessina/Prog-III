/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2.Punto_2;

import java.util.stream.Stream;
import TP2.music.Artist;

/**
 *
 * @author agusg
 */
public class Punto2 {
    
/*
    public int contadorDeMiembros(Stream <Artist> artists){
        int totalMembers = 0;
        for (Artist artist : artists) {
            Stream<Artist> members = artist.getMembers();
            totalMembers += members.count();
        }
        return totalMembers;
    }
 */
    
    public long contadorDeMiembros(Stream <Artist> artists){
        return artists
                .flatMap(members -> members.getMembers())
                .count();
    }
    
    
} 
