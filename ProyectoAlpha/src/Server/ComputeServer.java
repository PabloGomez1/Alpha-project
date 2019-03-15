/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import GUI.Inicio;
import Interfaces.InterfazRMI;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class ComputeServer implements InterfazRMI {
    

    public static void main(String[] args) {
        try {
            ComputeServer server = new ComputeServer();
            server.registro();
        } catch (RemoteException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ComputeServer() throws RemoteException {
        super();
    }

    /**
     * Crea el registro del RMI.
     */
    public void registro() {
        try {
            // TODO code application logic here
            System.setProperty("java.security.policy", "file:/C:/Users/pgomeze/Documents/PAlpha/ProyectoAlpha/src/Server/server.policy");

            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }

            LocateRegistry.createRegistry(1099);

            String name = "InterfazRMI";
            ComputeServer engine = new ComputeServer();
            InterfazRMI stub = (InterfazRMI) UnicastRemoteObject.exportObject(engine, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
        } catch (RemoteException ex) {
            Logger.getLogger(ComputeServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Funcionalidad registro
    @Override
    /**
     * Asigna los datos de puertos y direcciones a datos.
     */
    public String[] datos() throws RemoteException {
        String[] datos = new String[6];
        String direccionM = "228.5.6.7";
        String puertoM = "6789";
        String direccionT = "127.0.0.1";
        String puertoT = "7896";
        datos[0] = direccionM;
        datos[1] = puertoM;
        datos[2] = direccionT;
        datos[3] = puertoT;
        return datos;
    }

}
