/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Music.Album;
import Music.Artist;
import Music.Track;

import java.util.stream.Stream;
import java.util.List;

import punto_1.Punto_1;
/**
 *
 * @author agusg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int auxInt;
        String auxString;
        
        //PUNTO 1
        
        System.out.println("\n PUNTO 1 \n");

        Punto_1 funcionesP1 = new Punto_1();
        
        //Punto a)
        Stream<Integer> puntoA = Stream.of(1,2,3,4,5);
        auxInt = funcionesP1.addup(puntoA);
        System.out.println("Punto a)\nNumeros: 1, 2, 3, 4, 5 \t  | \t addup: " + auxInt);
        
        
        //Punto b)
        System.out.println("\nPunto b)");
        Stream<Artist> artistas = Stream.of(
                new Artist("Daft Punk", "Francia"),
                new Artist("Queen", "Reino Unido"),
                new Artist("Soda Stereo", "Argentina")
        );
        
        List<String> listaArtistas = funcionesP1.artistasToString(artistas);
        listaArtistas.forEach(strings -> System.out.println(strings));
        
        //Punto c)
        System.out.println("\nPunto c)");
        Artist artistaPrincipal = new Artist("La Banda", "Argentina");
        
        List<Artist> musicos = List.of(artistaPrincipal);

        Track pista1 = new Track("Cancion 1", 180000);
        Track pista2 = new Track("Cancion 2", 210000);

        List<Track> pistasDelAlbum = List.of(pista1, pista2);

        
        Album albumA = new Album("Sesion Acustica", pistasDelAlbum, musicos);
        
        Stream<Album> puntoC = Stream.of(albumA);
        List<Album> listaAlbumes = funcionesP1.albumToString(puntoC);
        listaAlbumes.forEach(albumes -> System.out.println(albumes.getName() + "\t" + albumes.getTrackList() + "\t" + albumes.getMusicianList()));
        
        System.out.println("\n PUNTO 2 \n");
        
        //PUNTO 2

        //NO SE TIENE QUE REUSAR PORQUE UN STREAM NO LO PERMITE
        //LO HACEMOS SOLO POR EL PUNTO 2
        
        //DEFINIMOS LOS MIEMBROS APARTE Y LUEGO LOS "JUNTAMOS" EN UNA BANDA
        
        //MIEMBROS DE QUEEN
        Artist freddie = new Artist("Freddie Mercury", "Británico");
        Artist brian = new Artist("Brian May", "Británico");
        Artist roger = new Artist("Roger Taylor", "Británico");
        Artist john = new Artist("John Deacon", "Británico");
        
        //LOS MIEMBROS DE QUEEN EN UNA LISTA
        List<Artist> queenMembers = List.of(freddie, brian, roger, john);
      
        //EL ARTISTA (Banda) QUEEN SE VA A LLAMAR "Queen", SUS MIEMBROS SERAN DE LA LISTA "queenMembers", Y SON DE REINO UNIDO
        Artist queen = new Artist("Queen", queenMembers, "Reino Unido");
        
        
        //MIEMBROS APARTE
        Artist thomas = new Artist("Thomas Bangalter", "Frances");
        Artist guy = new Artist("Guillaume Emmanuel", "Frances");
        
        //MIEMBROS EN UNA LISTA
        List<Artist> daftpunkM = List.of(thomas, guy);
        
        //ARTISTA (Daft Punk) CON LOS MIEMBROS DE LA LISTA ANTERIOR
        Artist daftpunk = new Artist("Daft Punk", daftpunkM, "Francia");
        
        
        //SI NO CARGAMOS LOS MIEMBROS APARTE, NO TENDRA MIEMBROS POR EL CONSTRUCTOR DE ARTIST
        Artist soda = new Artist("Soda Stereo", "Argentina");
        
        Stream<Artist> artistas2 = Stream.of(
                    daftpunk,
                    queen,
                    soda
        );

        long totalMembers = artistas2
                .mapToLong(artista -> artista.getMembers().count())
                .sum();
        
        System.out.println("Miembros totales: " + totalMembers);
    }
}
