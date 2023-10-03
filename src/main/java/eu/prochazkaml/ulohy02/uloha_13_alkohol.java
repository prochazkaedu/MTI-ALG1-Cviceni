/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eu.prochazkaml.ulohy02;

/**
 *
 * @author michal
 */
public class uloha_13_alkohol {
    private static double Q = 1000; // in cm^3 = ml
    private static double p = .8; // some decent absinthe
    private static double m_konzument = 80; // in kg
    
    private static final double rho = .8; // constant density of ethanol, in g/cm^3
    private static final double r = .7; // percentage of water in a human
    private static final double beta = .1; // speed of ethanol metabolization, in g/hour
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO - parse input
        
        double m_eth = Q * p * rho;
        double prom = m_eth / (m_konzument * r);
        double u_eth = m_konzument * beta;
        double t_until_sober = m_eth / u_eth;
        
        System.out.printf("Hmotnost prijateho ethanolu: %f g\n", m_eth);
        System.out.printf("Promile ethanolu v krvi: %f 1/1000\n", prom);
        System.out.printf("Rychlost odbouravani ethanolu: %f g/h\n", u_eth);
        
        if(prom >= 4.5) {
            System.out.printf("Uz nebudete moci ridit, jste mrtvi.\n");
            System.out.printf("Pokud se ale i tak probudite, budete moci ridit za %f hodin po konzumace.\n", t_until_sober);
        } else {
            System.out.printf("Budete moci ridit za %f hodin po konzumaci.\n", t_until_sober);

            if(prom >= 3.5) {
                System.out.printf("Pozor, kratce po konzumaci na urcitou dobu vstoupite do stavu bezvedomi.\n");
            }
        }
    }
    
}
