/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nyilvantarto;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Ádám
 */
public interface NyilvantartoService extends Remote {

    ArrayList<aru> aruLista() throws RemoteException;

    int aruMaxID() throws RemoteException;

    boolean aruHozzaad(aru ujAru) throws RemoteException;

    int aruEllenoriz(aru aktAru) throws RemoteException;

    boolean aruTorol(aru ujAru) throws RemoteException;

    boolean aruModosit(aru ujAru) throws RemoteException;

    boolean aruImport(ArrayList<aru> aruk) throws RemoteException;

    boolean naploHozzaad(Naplo naplo) throws RemoteException;

    ArrayList<Naplo> naploOlvasas() throws RemoteException;

    void naploTisztitas() throws RemoteException;

    ArrayList<Felhasznalo> felhasznaloLista() throws RemoteException;

    Felhasznalo aktFelhasznalo() throws RemoteException;

    boolean felhasznaloHozzaad(Felhasznalo ujFelhasznalo) throws RemoteException;

    boolean felhasznaloTorol(Felhasznalo toroltFelhasznalo) throws RemoteException;

    boolean felhasznaloModosit(Felhasznalo modositottFelhasznalo) throws RemoteException;

    int felhasznaloEllenoriz(Felhasznalo aktFelhasznalo) throws RemoteException;
}
