/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eu.prochazkaml.cv19092023;

/**
 *
 * @author michal
 */
public class Swap {
    private static int a, b;
    
    private static void initState() {
        a = 34;
        b = 89;
    }
    
    public static void main(String[] args) {
        variantA();
        variantB();
        variantC();
    }
    
    public static void variantA() {
        // Varianta A: bez výměny v paměti
        
        initState();
        
        System.out.printf("%d, %d\n", b, a);
    }
    
    public static void variantB() {
        // Varianta B: s výměnou v paměti s pomocnou proměnnou
        
        initState();

        int temp = a;
        a = b;
        b = temp;
        
        System.out.printf("%d, %d\n", a, b);
    }
    
    public static void variantC() {
        // Varianta C: s výměnou v paměti bez pomocné proměnné
        
        initState();

        a += b;
        b = a - b;
        a -= b;
        
        System.out.printf("%d, %d\n", a, b);        
    }
}
