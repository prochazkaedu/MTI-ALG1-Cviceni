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
public class BanknotesCounts {
    public static Boolean args_invalid = false;
    private static int money = 999;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Input parsing
        
        String inputmethod = "predefined";
        
        if(args.length < 2) {
            System.err.printf("Chybi parametr pro metodu vstupu dat. Pouziji preddefinovane hodnoty.\n");
        } else {
            inputmethod = args[1];
        }

        switch(inputmethod) {
            case "predefined":
                break;
            
            case "fromargs":
                if(args.length != 3) {
                    System.err.printf("Neplatny pocet argumentu.\n\n");
                    args_invalid = true;
                    return;
                }
                
                money = Integer.parseInt(args[2]);
                
                break;
                
            case "fromuser":
                if(args.length != 2) {
                    System.err.printf("Moznost fromuser neocekava zadne argumenty.\n\n");
                    args_invalid = true;
                    return;
                }
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
                
                System.out.printf("Zadejte castku v Kc: ");
                money = Integer.parseInt(reader.readLine());

                break;
        }
        
        System.out.printf("Zadana castka: %d Kc\n", money);
        
        // Data processing
        
        final int[] notesizes = new int[]{ 100, 50, 20, 10, 5, 2, 1 };
        int[] output = new int[notesizes.length];
        int tmpmoney = money;
        
        for(int i = 0; i < notesizes.length; i++) {
            output[i] = tmpmoney / notesizes[i];
            tmpmoney %= notesizes[i];
        }
        
        // Output
        
        System.out.printf("Castku %d Kc lze vyjadrit nasledujicimi mincemi/bankovkami:\n", money);
        
        for(int i = 0; i < notesizes.length; i++) {
            System.out.printf("%d: %dx\n", notesizes[i], output[i]);
        }
    }
}
