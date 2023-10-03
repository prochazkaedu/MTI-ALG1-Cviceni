package eu.prochazkaml.ulohy02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author michal
 */
public class uloha_02_cas_to_hms {
    private static int full_seconds = 12345678;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO - parse input
        
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
