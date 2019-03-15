/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class MulticastSender extends TimerTask{

    private boolean ganador;
    public String[] datos=new String[6];
    
    public boolean isGanador() {
    return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public static void main(String args[]) {
        try {
            ComputeServer compser=new ComputeServer();
            compser.registro();
        } catch (RemoteException ex) {
            Logger.getLogger(MulticastSender.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TCPServer tcp = new TCPServer();
        
        MulticastSender sender=new MulticastSender();
        sender.datos[4]=tcp.getNom();
        sender.datos[5]=tcp.getCont()+"";
        sender.envia(false);
        
        tcp.listen();
        
      
        
    }
    
    public void envia(boolean ganador){
        Timer timer = new Timer();
        timer.schedule(new MulticastSender(), 0, 1000);
        
    }
    
    

    /**
     * 
     * @param ganador 
     * Se instancia e inicializa una conexion y se comienza a mandar mensajes 
     * para los tableros de los jugadores.
     */
    public void enviaMonstruo(boolean ganador) {
        MulticastSocket s = null;
        //TCPServer tcp = this.tcpS;
      //  Map <String, Integer> map2 = tcp.getHm();
        if (!ganador) {
            
                try {
                    
                    InetAddress group = InetAddress.getByName("228.5.6.7"); // destination multicast group 
                    s = new MulticastSocket(6789);
                    s.joinGroup(group);
                    //s.setTimeToLive(700);
                    //System.out.println("Messages' TTL (Time-To-Live): " + s.getTimeToLive());
                    Integer rand = 1 + (int) (Math.random() * ((9 - 1) + 1));
                    String myMessage = rand+""; //necesitamos get nombre, para poder tener valor y eso es lo mandamos al multicastReceiver
                    System.out.println(myMessage);

                    byte[] m = myMessage.getBytes();
                    DatagramPacket messageOut
                            = new DatagramPacket(m, m.length, group, 6789);
                    s.send(messageOut);

                    s.leaveGroup(group);

                } catch (SocketException e) {
                    System.out.println("Socket: " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("IO: " + e.getMessage());
                } finally {
                    if (s != null) {
                        s.close();
                    }
                }
            
        } else{
            try {

                    InetAddress group = InetAddress.getByName("228.5.6.7"); // destination multicast group 
                    s = new MulticastSocket(6789);
                    s.joinGroup(group);
                    //s.setTimeToLive(700);
                    //System.out.println("Messages' TTL (Time-To-Live): " + s.getTimeToLive());
                    String myMessage = ganador + "";
                    System.out.println(myMessage);

                    byte[] m = myMessage.getBytes();
                    DatagramPacket messageOut
                            = new DatagramPacket(m, m.length, group, 6789);
                    s.send(messageOut);

                    s.leaveGroup(group);

                } catch (SocketException e) {
                    System.out.println("Socket: " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("IO: " + e.getMessage());
                } finally {
                    if (s != null) {
                        s.close();
                    }
                }
        }

    }
    
    public void enviaMensaje(String nombre) {
        MulticastSocket s = null;
        boolean ganador = false;
        if (!ganador) {
            
                try {

                    InetAddress group = InetAddress.getByName("228.5.6.8"); // destination multicast group 
                    s = new MulticastSocket(6788);
                    s.joinGroup(group);
                    //s.setTimeToLive(700);
                    //System.out.println("Messages' TTL (Time-To-Live): " + s.getTimeToLive());
                    
                    String myMessage = nombre +","+ datos[5];
                    
                    byte[] m = myMessage.getBytes();
                    DatagramPacket messageOut
                            = new DatagramPacket(m, m.length, group, 6789);
                    s.send(messageOut);

                    s.leaveGroup(group);

                } catch (SocketException e) {
                    System.out.println("Socket: " + e.getMessage());
                } catch (IOException e) {
                    System.out.println("IO: " + e.getMessage());
                } finally {
                    if (s != null) {
                        s.close();
                    }
                }
            
        }

    }

    @Override
    public void run() {
        enviaMonstruo(ganador);
    }
}
