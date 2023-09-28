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
public class ToSeconds {
    private static int hours = 5;
    private static int minutes = 4;
    private static int seconds = 59;
    public static Boolean args_invalid = false;

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
                if(args.length != 5) {
                    System.err.printf("Neplatny pocet argumentu.\n\n");
                    args_invalid = true;
                    return;
                }
                
                hours = Integer.parseInt(args[2]);
                minutes = Integer.parseInt(args[3]);
                seconds = Integer.parseInt(args[4]);
                
                break;
                
            case "fromuser":
                if(args.length != 2) {
                    System.err.printf("Moznost fromuser neocekava zadne argumenty.\n\n");
                    args_invalid = true;
                    return;
                }
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
                
                System.out.printf("Zadejte pocet hodin: ");
                hours = Integer.parseInt(reader.readLine());

                System.out.printf("Zadejte pocet minut: ");
                minutes = Integer.parseInt(reader.readLine());

                System.out.printf("Zadejte pocet seconds: ");
                seconds = Integer.parseInt(reader.readLine());

                break;
        }
        
        // Data processing
        
        minutes += seconds / 60;
        seconds %= 60;
        
        hours += minutes / 60;
        minutes %= 60;
        
        int time = seconds + (hours * 60 + minutes) * 60;
        
        // Output
        
        System.out.printf("Zadany cas: %02d:%02d:%02d\n", hours, minutes, seconds);
        
        System.out.printf("Pocet sekund: %d\n", time);
    }
}
