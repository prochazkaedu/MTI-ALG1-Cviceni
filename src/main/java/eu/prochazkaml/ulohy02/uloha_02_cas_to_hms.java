package eu.prochazkaml.ulohy02;
import eu.prochazkaml.inputparser.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author michal
 */
public class uloha_02_cas_to_hms {
    /**
     * @param args the command line arguments
     * @throws eu.prochazkaml.inputparser.OutOfArgumentsException
     * @throws eu.prochazkaml.inputparser.InvalidTypeException
     */
    public static void main(String[] args) throws OutOfArgumentsException, InvalidTypeException {
        InputParser ip = new InputParser(args, 1);
        
        int full_seconds = ip.readInt("Doba (s)", 12345678);
        
        int tmpval = full_seconds;
        
        int seconds = tmpval % 60;
        tmpval /= 60;

        int minutes = tmpval % 60;
        tmpval /= 60;

        int hours = tmpval % 24;
        tmpval /= 24;

        int days = tmpval;

        System.out.printf("%d sekund = %d:%02d:%02d:%02d\n", full_seconds, days, hours, minutes, seconds);
    }
    
}
