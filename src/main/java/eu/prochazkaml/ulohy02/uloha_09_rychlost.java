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
public class uloha_09_rychlost {
    /**
     * @param args the command line arguments
     * @throws eu.prochazkaml.inputparser.OutOfArgumentsException
     * @throws eu.prochazkaml.inputparser.InvalidTypeException
     */
    public static void main(String[] args) throws OutOfArgumentsException, InvalidTypeException {
        InputParser ip = new InputParser(args, 1);
        
        double maxspeed = ip.readPositiveDouble("Maximalni povolena rychlost (km/h)", 50);
        double length = ip.readPositiveDouble("Delka useku (m)", 123);
        double time = ip.readPositiveDouble("Doba s(edovaneho useku (s)", 2.43);
        
        double avgspeed = length * time;
        double overlimit = (avgspeed > maxspeed) ? (avgspeed - maxspeed) : 0.0;
        
        System.out.printf("Vozidlo dosahlo prumerne rychlosti %f km/h.\n", avgspeed);
        
        if(overlimit != 0.0) {
            System.out.printf("Tim presahlo maximalni rychlost o %f km/h.\n", overlimit);
        } else {
            System.out.printf("Neporusilo zadne predpisy.\n");
        }
    }
    
}
