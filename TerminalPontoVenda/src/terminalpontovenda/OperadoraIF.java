/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminalpontovenda;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author sergio
 */
public interface OperadoraIF extends Remote{
    public void sms(String msg) throws RemoteException;
    
}
