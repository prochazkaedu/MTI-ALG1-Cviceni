/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eu.prochazkaml.cv19092023;

import java.time.Year;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author michal
 */
public class Sentence {
    private static String child_name = "Filip";
    private static int child_birth_year = 2009;
    private static String class_suffix = "A";
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
                if(args.length != 5) {
                    System.err.printf("Neplatny pocet argumentu.\n\n");
                    args_invalid = true;
                    return;
                }
                
                child_name = args[2];
                child_birth_year = Integer.parseInt(args[3]);
                class_suffix = args[4];
                
                System.out.printf("Prijate argumenty: %s %d %s\n", 
                        child_name,
                        child_birth_year,
                        class_suffix);
                
                break;
                
            case "fromuser":
                if(args.length != 2) {
                    System.err.printf("Moznost fromuser neocekava zadne argumenty.\n\n");
                    args_invalid = true;
                    return;
                }
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
                
                System.out.printf("Zadejte jmeno ditete: ");
                child_name = reader.readLine();

                System.out.printf("Zadejte rok narozeni ditete: ");
                child_birth_year = Integer.parseInt(reader.readLine());

                System.out.printf("Zadejte priponu tridy: ");
                class_suffix = reader.readLine();
                
                break;
        }
        
        final int current_year = Year.now().getValue();
        
        final int child_age = current_year - child_birth_year;
        
        if(child_age < 0) {
            System.out.printf("Dite %s se narodi za %d rok(u).\n",
                    child_name, -child_age);
        } else if(child_age < 3) {
            System.out.printf("Dite %s ma %d let, zatim nikam nechodi.\n",
                    child_name,
                    child_age);
        } else if(child_age < 6) {
            System.out.printf("Dite %s ma %d let a chodi uz %d let do skolky.\n",
                    child_name,
                    child_age,
                    child_age - 3);
        } else if(child_age < 15) {
            System.out.printf("Dite %s ma %d let a chodi do %d.%s.\n",
                    child_name,
                    child_age,
                    child_age - 5,
                    class_suffix);
        } else if(child_age < 19) {
            System.out.printf("Dite %s ma %d let a chodi do %d. rocniku na stredni skole.\n",
                    child_name,
                    child_age,
                    child_age - 14);
        } else if(child_age < 100) {
            System.out.printf("Dite %s ma %d let, nezvladlo maturitu a asi pracuje jako prodavac(ka) v Lidlu %d let.\n",
                    child_name,
                    child_age,
                    child_age - 19);
        } else {
            System.out.printf("Dite %s ma %d let, pravdepodobne uz je mrtve.\n",
                    child_name,
                    child_age);
        }
    }
}
