/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Interfaces.InterfazRMI;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class ComputeClient {
    public static void main(String[] args) throws NotBoundException {               
    }
    
    /**
     * 
     * @return
     * @throws NotBoundException 
     * Manda datos que contiene la informacion de conexiones; puertos y direcciones.
     */
    public String[] conecta() throws NotBoundException{
        String[] datos=new String[6];
        try {
            // TODO code application logic here
            System.setProperty("java.security.policy",  "file:/C:/Users/pgomeze/Documents/PAlpha/ProyectoAlpha/src/Client/client.policy");
            
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }
            
            String name = "InterfazRMI";
            Registry registry = LocateRegistry.getRegistry("localhost"); // server's ip address
            InterfazRMI comp = (InterfazRMI) registry.lookup(name);
            datos = comp.datos();
        } catch (RemoteException ex) {
            Logger.getLogger(ComputeClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }
    
    
}


