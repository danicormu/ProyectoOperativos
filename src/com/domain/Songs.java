/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author geo_2
 */
public class Songs {
    
    public void SendSong() throws IOException{
    
         
	    	   
	     Socket servidor  = new Socket("192.168.0.112", 8888 );
	     try
         {
         

            // Creamos flujo de entrada para leer los datos que envia el cliente 
            DataInputStream dis = new DataInputStream( servidor.getInputStream() );
     
            // Obtenemos el nombre del archivo
            //String nombreArchivo = dis.readUTF().toString(); 

            // Obtenemos el tamaño del archivo
            int tam[] ={4446364,4871568,5542960,8205779};
            String name []={"Meditacion","AmorClandestino","Believe","Acrossthenight"};
            int temp=0;
            System.out.println( "Recibiendo archivo " );
            
            for(int j=0; j<4;j++){
            // Creamos flujo de salida, este flujo nos sirve para 
            // indicar donde guardaremos el archivo
            FileOutputStream fos = new FileOutputStream( "C:\\Users\\geo_2\\Documents\\NetBeansProjects\\OperativosRockola\\src\\Songs\\ "+name[temp]+".mp3" );
            BufferedOutputStream out = new BufferedOutputStream( fos );
            BufferedInputStream in = new BufferedInputStream( servidor.getInputStream() );

            
          
            // Creamos el array de bytes para leer los datos del archivo
            byte[] buffer = new byte[ tam[temp] ];

           
            // Obtenemos el archivo mediante la lectura de bytes enviados
            for( int i = 0; i < buffer.length; i++ )
            {
               buffer[ i ] = ( byte )in.read( ); 
            }
           temp++;
          
            // Escribimos el archivo 
            out.write( buffer ); 
            
            // Cerramos flujos
            out.flush(); 
            //in.close();
            //out.close(); 
            

            System.out.println( "Archivo Recibido " );
     
        }
            servidor.close();   
         }
        catch( Exception e )
        {
           System.out.println( "Recibir: "+e.toString() ); 
        }
      } 
        
    
    
    
    }
    
    
