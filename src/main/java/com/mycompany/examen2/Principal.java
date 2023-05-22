
package com.mycompany.examen2;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        
        List <VideoJuego> videojuegos = new ArrayList <VideoJuego>();
        
        VideoJuego video1 = new VideoJuego(002, "mario", "Nintendo 64", 2, "accion");
        VideoJuego video4 = new VideoJuego(027, "prince", "Nintendo 64", 4, "muerte");
        
        videojuegos.add(video1);
        videojuegos.add(1, new VideoJuego(976, "zelda", "xbox", 1, "accion"));
        videojuegos.add(video4);
        videojuegos.add(3, new VideoJuego(650, "motogp", "sega", 2, "carreras"));
        videojuegos.add(2, new VideoJuego(055, "coolpix", "sega", 1, "muerte"));
        

//        videojuegos.get(0).setTitulo("KART");
//        videojuegos.get(0).setCantidadJugadores(99);
//        videojuegos.get(1).setTitulo("GOLUM");
//        videojuegos.get(1).setCantidadJugadores(88);
        
        System.out.println("----------------------");
        
//        for(int i=0; i < videojuegos.size(); i++){
//            System.out.println(videojuegos.get(i).titulo);
//            System.out.println(videojuegos.get(i).consola);
//            System.out.println(videojuegos.get(i).cantidadJugadores);
//            System.out.println("-----------");
//        }
        

        //forEach
        //creo variable auxiliar video
        String nintendo = "Nintendo 64";
        for (VideoJuego video : videojuegos){
            if(video.getConsola().equals(nintendo))  
            System.out.println(video.toString());
        }
            
            
            
        }   
    }