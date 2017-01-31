/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminalpontovenda;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class TPV extends UnicastRemoteObject implements TPVIF{
    
    private ArrayList<OperadoraIF> operadoras = new ArrayList<OperadoraIF>();
    
    public TPV() throws RemoteException{}

    @Override
    public void creditar(String numero, float valor) throws RemoteException {
        
        for(OperadoraIF ob:operadoras){
            ob.sms("Valor creditado: "+valor);
        }
    }

    @Override
    public void addOperadora(OperadoraIF ob) throws RemoteException {
        operadoras.add(ob);
    }
    
    
    
}
