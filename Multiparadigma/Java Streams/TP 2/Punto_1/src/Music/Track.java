/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Music;

/**
 * @author richard
 */
public final class Track {
    
    private final String name;
    private final int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the length of the track in milliseconds.
     */
    public int getLength() {
        return length;
    }

    public Track copy() {
        return new Track(name, length);
    }

    @Override
    public String toString() {
        long minutos = length / 60000;
        long segundos = (length % 60000) / 1000;
        return String.format("%s (%d:%02d)", this.getName(), minutos, segundos);
    }
    
    

}

