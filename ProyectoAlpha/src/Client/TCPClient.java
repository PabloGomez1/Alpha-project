/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.net.*;
import java.io.*;

public class TCPClient {

    public static void main(String args[]) {

        
    }

    /**
     * 
     * @param datos
     * @param msg
     * @return 
     * Recibe los datos de conexion y un mensaje con el nombre de usuario y su 
     * puntaje. Imprime el mensaje y dependiendo del puntaje cambia el valor de
     * la variable data.
     */
    public boolean golpeaTopo(String[] datos, int msg) {
        Socket s = null;
        boolean data=false;
        try {
            int serverPort = Integer.parseInt(datos[3]);

            //s = new Socket("localhost", serverPort);
            s = new Socket(datos[2], serverPort);    
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            out.writeInt(msg); 
            out.writeUTF(datos[4]);            // UTF is a string encoding 
            
            System.out.println("mensaje: "+msg);
           
            int aux=msg;
            //System.out.println(aux);
            if(aux>5){
                data=true;
            }
           
           
            //System.out.println("Received: " + data);
            
        } catch (UnknownHostException e) {
            System.out.println("Sock:" + e.getMessage());
        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO:" + e.getMessage());
        } finally {
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    System.out.println("close:" + e.getMessage());
                }
            }
        }
        return data;
    }
}
