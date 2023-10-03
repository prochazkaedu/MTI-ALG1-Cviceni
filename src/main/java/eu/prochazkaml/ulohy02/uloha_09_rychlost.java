/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eu.prochazkaml.ulohy02;

/**
 *
 * @author michal
 */
public class uloha_09_rychlost {
    static double maxspeed = 50.0; // in km/h
    static double length = 123.0; // in metres
    static double time = 2.43; // in seconds
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO - parse input
        
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
