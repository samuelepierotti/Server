/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcpcommunication_server;

/**
 *
 * @author Amministratore
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Server s= new Server(2000);
        s.attendi();
        s.chiudi();
    }
}