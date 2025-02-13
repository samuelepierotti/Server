/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcpcommunication_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        int numero = 0;
        int i = 0;
        System.out.println("Da quanti client vuoi accettare la connessione? ");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        try {
            numero = Integer.parseInt(br.readLine());
            System.out.println("Eseguo la connessione");
        } catch (IOException e) {
            System.err.println("Errore nell'inserimento del numero ");
        }

        while(i<numero){
            System.out.println("\n");
            System.out.println("Client num."+i);

            s.attendi();
            s.chiudi();
            i++;
        }

        System.out.println("\n");
        s.termina();
    }
}
