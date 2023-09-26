/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eu.prochazkaml.cv19092023;

import java.io.IOException;

/**
 *
 * @author michal
 */
public class App {
    private static void printhelp() {
        System.err.printf("""
                          Pouziti: cmd ...
                          
                          Mozne hodnoty pro cmd:
                          \tswap - spusti program Swap.java
                          \tsentence - spusti program Sentence.java, prijima dalsi parametr:
                          \t\tpredefined - spusti program s preddefinovanymi hodnotami
                          \t\tfromargs jmenoditete roknarozeni priponatridy - spusti program s danymi hodnotami
                          \t\tfromuser - spusti program, pro hodnoty se zepta
                          \tfarm - spusti program Farm.java
                          \t\tpredefined - spusti program s preddefinovanymi hodnotami
                          \t\tfromargs pocethus pocetkraliku - spusti program s danymi hodnotami
                          \t\tfromuser - spusti program, pro hodnoty se zepta
                          """);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        if(args.length < 1) {
            printhelp();
            return;
        }
        
        switch(args[0]) {
            case "swap":
                Swap.main(args);
                break;
                
            case "sentence":
                Sentence.main(args);
                if(Sentence.args_invalid) printhelp();
                break;
                
            case "farm":
                Farm.main(args);
                if(Farm.args_invalid) printhelp();
                break;
        }
    }
}
