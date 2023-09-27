/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eu.prochazkaml.cv19092023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author michal
 */
public class Farm {
    private static int pocetHus = 5;
    private static int pocetKraliku = 4;
    public static Boolean args_invalid = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        if(args.length < 2) {
            System.err.printf("Chybi parametr pro metodu vstupu dat.\n\n");
            args_invalid = true;
            return;
        }
        
        switch(args[1]) {
            case "predefined":
                break;
            
            case "fromargs":
                if(args.length != 4) {
                    System.err.printf("Neplatny pocet argumentu.\n\n");
                    args_invalid = true;
                    return;
                }
                
                pocetHus = Integer.parseInt(args[2]);
                pocetKraliku = Integer.parseInt(args[3]);
                
                break;
                
            case "fromuser":
                if(args.length != 2) {
                    System.err.printf("Moznost fromuser neocekava zadne argumenty.\n\n");
                    args_invalid = true;
                    return;
                }
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
                
                System.out.printf("Zadejte jmeno ditete: ");
                pocetHus = Integer.parseInt(reader.readLine());

                System.out.printf("Zadejte rok narozeni ditete: ");
                pocetKraliku = Integer.parseInt(reader.readLine());
                
                break;
        }
                
        System.out.printf("Pocet hus: %d\n", pocetHus);
        System.out.printf("Pocet kraliku: %d\n", pocetKraliku);

        final int pocetZvirat = pocetHus + pocetKraliku;
        final int pocetNohou = pocetHus * 2 + pocetKraliku * 4;
        
        System.out.printf("Pocet hus: %d\n", pocetHus);
        System.out.printf("Pocet kraliku: %d\n", pocetKraliku);
        System.out.printf("Na farme je %d zvirat a maji %d nohou.\n", pocetZvirat, pocetNohou);
    }
}
