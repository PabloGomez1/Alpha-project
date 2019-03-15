/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Client.ComputeClient;
import Client.MulticastReceiver;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.rmi.NotBoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;

/**
 *
 * @author pablo
 */
public class StressTest {
    
    public static long[] stress(int clientes){
        long[] tiempos = new long[clientes+1]; 
        long total=0;long acum=0;
        for(int j=0; j<10; j++){
            total=0;
            for(int i=0;i<clientes;i++){
                long startTime = System.currentTimeMillis();
                int aux=(int) Math.random();
                String nomaux="nombre "+aux;
                ComputeClient cliente = new ComputeClient();
            try {
                String[] datos=cliente.conecta();
                //System.out.println(datos[0] + " " + datos[1]);
                MulticastReceiver receiver=new MulticastReceiver();
                receiver.iniciaJuego(datos, nomaux);
                //Object o = receiver.hilo.interfaz;
                
                
            } catch (NotBoundException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }




            long finalTime = System.currentTimeMillis() - startTime;
            total = total + finalTime;
            acum+=total;
            
            tiempos[i]= tiempos[i]+(long)(finalTime*.1);

                System.out.println("ft "+finalTime);
            }
            
            System.out.println("tpos ctes: "+ tiempos[clientes]);
        }
        
        
                        
        return tiempos;
        
    }
    
    
        public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        
        
        
        
        System.setProperty("sun.net.maxDatagramSockets", "5000");
        StressTest prueba = new StressTest();
        
        int tams = 100;
        PrintWriter fileout;  
        
            long resp[]=prueba.stress(tams);
            fileout = new PrintWriter( new FileWriter("Promedios_para_"+tams+"_clientes.txt") );
            for(int k = 0; k < resp.length-1;k++)
            {
                fileout.write(resp[k]+"\n");
            }
             fileout.close();
        
        
        
        
            System.out.println(prueba+" resultado ");
        
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        
        

        /* Create and display the form */
            
         
    }
    
    
    
}
