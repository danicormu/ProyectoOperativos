/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockolaso;


/**
 *
 * @author geo_2
 */


import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;

public class Reproductor {
    private BasicPlayer player;
    
    public Reproductor(){
    player = new BasicPlayer();}
public void Play() throws Exception {
  player.play();
}
 
public void AbrirFichero(String ruta) throws Exception {
  player.open(new File(ruta));
}
 
public void Pausa() throws Exception {
  player.pause();
}
 
public void Continuar() throws Exception {
  player.resume();
}
 
public void Stop() throws Exception {
  player.stop();
}
    
    public void Reproducir(int num){
try {
    
  String nameSongs[]={"Meditacion","AmorClandestino","Believe","Acrossthenight"};  
  Reproductor mi_reproductor = new Reproductor();
  
  mi_reproductor.AbrirFichero("C:\\Users\\geo_2\\Desktop\\canciones\\"+nameSongs[num]+".mp3");
  mi_reproductor.Play();
} catch (Exception ex) {
  System.out.println("Error: " + ex.getMessage());
}
}
}

      
   

