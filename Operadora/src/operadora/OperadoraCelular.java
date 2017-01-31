/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import terminalpontovenda.OperadoraIF;

/**
 *
 * @author sergio
 */
public class OperadoraCelular extends UnicastRemoteObject implements OperadoraIF{
    
    public OperadoraCelular() throws RemoteException{}

    @Override
    public void sms(String msg) throws RemoteException {
        System.out.println(msg);
    }
    
    
}
