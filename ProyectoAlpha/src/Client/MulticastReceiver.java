/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import GUI.InterfazGrafica;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/**
 *
 * @author diego
 */
public class MulticastReceiver {

    public MyThread hilo;
    
    public static void main(String args[]) {

    }
    
    public void ganador(InterfazGrafica interfaz){
        hilo=new MyThread(interfaz);
        hilo.start();
        
    }
    
    

    
    /**
     * 
     * @param datos
     * @param nombre
     * @return msg
     * Instancia un hilo y lo inicializa.
     */
    Hilo miHilo;
    public Hilo getHilo()
    {
        return miHilo;
    }
    public String iniciaJuego(String[] datos, String nombre) {

        
        miHilo = new Hilo(datos, nombre);
        miHilo.start();
        String msg = miHilo.msg;
        //System.out.println(msg);
        return msg;

    }

    
    
    public static class MyThread extends Thread{
        
        String data;
        String nombre;
        public InterfazGrafica interfaz;

        public String getData() {
            return data;
        }
        
        public void setInter(Object o)
        {
            this.interfaz=(InterfazGrafica)(o);
        }
        
        public String getNombre(){
            return nombre;
        }
        
        public MyThread(InterfazGrafica interfaz) {
            this.interfaz=interfaz;
        }
        
        @Override
        public void run() {

            int numPuerto = 6788;
            MulticastSocket s = null;
            
            try {
                InetAddress group = InetAddress.getByName("228.5.6.8"); // destination multicast group 
                s = new MulticastSocket(numPuerto);
                s.joinGroup(group);

                byte[] buffer = new byte[1000];
                boolean ban = true;
                while (ban) {
                    System.out.println("Waiting for messages");
                    DatagramPacket messageIn
                            = new DatagramPacket(buffer, buffer.length);
                    s.receive(messageIn);
                    String msg = new String(messageIn.getData());
                    String[] msjSender = msg.split(",");
                     //nombre,puntaje
                    nombre=msjSender[0]; 
                    data=msjSender[1];
                    interfaz.setText(data+" aciertos");
                    System.out.println("Message: " + msg + " from: " + messageIn.getAddress());
                  
                    //int punt = Integer.parseInt(msjSender[2]);
                    //interfaz.setCont(msjSender[1],punt);
                }
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

    private static class Hilo extends Thread {

        private String[] datos;
        private String msg;
        private InterfazGrafica interfaz;
        private String nombre;
        

        public Hilo(String[] datos, String nombre) {
            this.datos = datos;

            InterfazGrafica gui = new InterfazGrafica();
            gui.setVisible(true);
            gui.setDatos(datos);
            gui.setNombre(nombre);
            this.interfaz=gui;
            this.nombre=nombre;
        }
        public void setInter(Object o)
        {
            this.interfaz=(InterfazGrafica)(o);
        }
        
        public Hilo (String[] datos, String nombre,String emp) {
            this.datos = datos;

            
            this.nombre=nombre;
            this.interfaz=null;
            this.nombre=nombre;
            
        }
        @Override
        /*
         * Asigna puerto y direccion al thread para poder realizar la conexion 
         * al grupo correcto, al terminar cierra la conexion.
         */
        public void run() {
            
            String direccion = datos[0];
            String puerto = datos[1];
            int numPuerto = Integer.parseInt(puerto);
            MulticastSocket s = null;
            try {
                InetAddress group = InetAddress.getByName(direccion); // destination multicast group 
                s = new MulticastSocket(numPuerto);
                s.joinGroup(group);

                byte[] buffer = new byte[1000];
                boolean ban = true;
                while (ban) {
                    //System.out.println("Waiting for messages");
                    DatagramPacket messageIn
                            = new DatagramPacket(buffer, buffer.length);
                    s.receive(messageIn);
                    msg = new String(messageIn.getData());
                    if(msg.charAt(0)==('t') || msg.charAt(0)==('f')){
                        interfaz.setText("ganador");
                    } else {
                    String mensajote[] = msg.split(",");
                    char ch = msg.charAt(0);
                    interfaz.activaBoton(ch);
                    interfaz.setMsg(""+ch);     //
                       // System.out.println("mensajote de 2 "+mensajote[0]);
                   // interfaz.setCont(mensajote[1], Integer.parseInt(mensajote[2]));
                    }
                    //System.out.println("char" + msg.charAt(0));
                    //System.out.println("Message: " + new String(messageIn.getData()) + " from: " + messageIn.getAddress());
                    //System.out.println(msg);
                }
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
}
