/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1;

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

import Music.Artist;
import Music.Album;

/**
 *
 * @author agusg
 */
public class Punto_1 {

    public Punto_1() {
    }
    
    
    
    //Punto a)
    public int addup(Stream<Integer> nums){
        
        //Si el stream esta vacio devolvemos 0, evitar errores
        if(nums == null){
            return 0;
        }
        
        //Pasaremos todo el Stream a Integers, esto para despues sumar cada uno
        return nums.mapToInt(Integer::intValue).sum();
    }
    
    //Punto b)
    public List<String> artistasToString(Stream<Artist> a){
        
        //El map transforma al nombre de un artista y su nacionalidad en un solo string
        return a.map(artistaMapa -> artistaMapa.getName() + " | " + artistaMapa.getNationality())
                //El collect agarra los strings generados por el map, y los va llevando a una sola lista
                .collect(Collectors.toList());
    }
    
    //Punto c)
    public List<Album> albumToString(Stream<Album> a){
        
        //El filter deja pasar a todos los albumes que tengan 3 o menos pistas
        return a.filter(albumFiltro -> albumFiltro.getTrackList().size() <= 3)
            //El collect agarra los albumes que pasaron por el filtro y los deja en una lista
            .collect(Collectors.toList());
    }
}
