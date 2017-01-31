/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadora;

import java.rmi.Naming;
import terminalpontovenda.TPVIF;

/**
 *
 * @author sergio
 */
public class Operadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            TPVIF tpv = (TPVIF)Naming.lookup("CelularRemoto");
            tpv.creditar("88545516", 20);
        } catch (Exception e) {
        }
    }
    
}
