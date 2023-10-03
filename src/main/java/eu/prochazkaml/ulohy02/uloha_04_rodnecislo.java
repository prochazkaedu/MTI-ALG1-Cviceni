/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eu.prochazkaml.ulohy02;
import eu.prochazkaml.inputparser.*;

/**
 *
 * @author michal
 */
public class uloha_04_rodnecislo {
    /**
     * @param args the command line arguments
     * @throws eu.prochazkaml.inputparser.OutOfArgumentsException
     */
    public static void main(String[] args) throws OutOfArgumentsException {
        InputParser ip = new InputParser(args, 1);
        
        String id = ip.readLine("Rodne cislo", "0309172666");

        int year = Integer.parseInt(id.substring(0, 2));
        int month = Integer.parseInt(id.substring(2, 4));
        int day = Integer.parseInt(id.substring(4, 6));
        
        if(year >= 54)
            year += 1900;
        else
            year += 2000;
        
        int gender = month / 50;
        month %= 50;
        month %= 20;
        
        System.out.printf("Nositel%s rodneho cisla se narodil%s %d. %d. %d.\n", (gender > 0) ? "ka" : "", (gender > 0) ? "a" : "", day, month, year);
    }
    
}
