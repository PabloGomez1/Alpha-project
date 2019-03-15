/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author JGUTIERRGARC
 */

import java.net.*;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class TCPServer {
    
    public static Map <String, Integer> hm = new HashMap<String, Integer>();
    static String nom;
    static int contador;
    
    
    
    
    public Map<String, Integer> getHm() {
        return hm;
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getCont()
    {
        return contador;
    }
    
    public static void main (String args[]) {
	try{       
                
		int serverPort = 7896; 
		ServerSocket listenSocket = new ServerSocket(serverPort);
                boolean ban=true;
		while(ban) {
			System.out.println("Waiting for messages..."); 
                        Socket clientSocket = listenSocket.accept();  // Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made. 
			Connection c = new Connection(clientSocket);
                        c.start();
                        contador=c.cont;
                        nom=c.nombre;
                        
                        if(hm.containsKey(nom)){
                            hm.put(nom, hm.get(nom));
                            contador=hm.get(nom);
                            
                        }else{
                            hm.put(nom, contador);
                        }
                            
                        
                        if(contador==5){
                            ban=false;
                            System.out.println("Ganador");
                        }
                        
                        
		}
	} catch(IOException e) {System.out.println("Listen :"+ e.getMessage());}
    }
    
    
    /**
     * Espera los mensajes TCP del cliente, cuando se llega a cinco aciertos o 
     * más, se deja de escuchar mensajes.
     */
    public void listen(){
        try{
		int serverPort = 7896; 
		ServerSocket listenSocket = new ServerSocket(serverPort);
                boolean ban=true;
		while(ban) {
			//System.out.println("Waiting for messages..."); 
                        Socket clientSocket = listenSocket.accept();  // Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made. 
			Connection c = new Connection(clientSocket);
                        c.start();
                        int cont=c.cont;
                        //System.out.println("cont: "+cont);
                        if(cont>=5){
                            ban=false;
                            System.out.println("Ganador");
                            
                        }
		}
	} catch(IOException e) {System.out.println("Listen :"+ e.getMessage());}
    }
   
}

class Connection extends Thread {
	DataInputStream in;
	DataOutputStream out;
	Socket clientSocket;
        int cont;
        String  nombre;
        
	public Connection (Socket aClientSocket) {
	    try {
		clientSocket = aClientSocket;
		in = new DataInputStream(clientSocket.getInputStream());
		out =new DataOutputStream(clientSocket.getOutputStream());
                
	     } catch(IOException e)  {System.out.println("Connection:"+e.getMessage());}
	}
        
        @Override
	public void run(){
	    try {			                 // an echo server
		//String data = in.readUTF();
                nombre=in.readUTF();
                cont=in.readInt();
                System.out.println("TCP message received from: " + clientSocket.getRemoteSocketAddress() + " message is "+ nombre);
                
                
                
                
                
                boolean res=false;
                if(cont>5){
                    res=true;
                    cont=0;
                }
                //System.out.println(res);
                out.writeBoolean(res);
	    } 
            catch(EOFException e) {
                System.out.println("EOF:"+e.getMessage());
	    } 
            catch(IOException e) {
                System.out.println("IO:"+e.getMessage());
	    } finally {
                try {
                    clientSocket.close();
                } catch (IOException e){
                    System.out.println(e);
                }
                }
            }
}
