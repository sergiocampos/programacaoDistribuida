/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celulares;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import operadora.OperadoraCelular;
import terminalpontovenda.TPVIF;

/**
 *
 * @author sergio
 */
public class Celulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            TPVIF tpv = (TPVIF) Naming.lookup("CelularRemoto");
            OperadoraCelular ob = new OperadoraCelular();
            tpv.addOperadora(ob);
        } catch (NotBoundException ex) {
            Logger.getLogger(Celulares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Celulares.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Celulares.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
