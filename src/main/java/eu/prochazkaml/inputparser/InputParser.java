/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.prochazkaml.inputparser;

import java.util.Scanner;

/**
 *
 * @author michal
 */
public class InputParser {
    enum InputSource {
        PREDEFINED,
        FROMARGS,
        FROMUSER
    }
    
    String[] _args;
    int _ptr;
    InputSource _srctype;
    
    public InputParser(String[] args, int startarg) {
        _srctype = InputSource.PREDEFINED;
        _ptr = -1;
        
        if(args.length > startarg) switch(args[startarg]) {
            case "fromargs":
                _srctype = InputSource.FROMARGS;
                _ptr = startarg + 1;
                break;
                
            case "fromuser":
                _srctype = InputSource.FROMUSER;
                break;
        }
        
        _args = args;
    }
    
    public String readLine(String prompt, String predefined) throws OutOfArgumentsException {
        if(_ptr >= _args.length) throw new OutOfArgumentsException("Dosly mi argumenty.");
        
        System.out.printf("%s: ", prompt);
        
        switch(this._srctype) {
            case FROMARGS:
                System.out.printf("%s (z argumentu %d)\n", _args[_ptr], _ptr);
                return _args[_ptr++];
                
            case FROMUSER:
                Scanner scanner = new Scanner(System.in);
                String retval = scanner.nextLine().split("\n")[0];
                scanner.close();
                return retval;
                
            default:
                System.out.printf("%s (preddefinovana hodnota)\n", predefined);
                return predefined;
        }
    }
    
    public int readInt(String prompt, int predefined) throws OutOfArgumentsException, InvalidTypeException {
        String val = readLine(prompt, String.valueOf(predefined));
        int retval;
        
        try {
            retval = Integer.parseInt(val);
        } catch(NumberFormatException e) {
            throw new InvalidTypeException("Ocekaval jsem cele cislo.");
        }
        
        return retval;
    }

    public int readPositiveInt(String prompt, int predefined) throws OutOfArgumentsException, InvalidTypeException {
        String val = readLine(prompt, String.valueOf(predefined));
        int retval;
        
        try {
            retval = Integer.parseInt(val);
            
            if(retval < 0) throw new NumberFormatException();
        } catch(NumberFormatException e) {
            throw new InvalidTypeException("Ocekaval jsem cele kladne cislo.");
        }
        
        return retval;
    }
    
    public double readDouble(String prompt, double predefined) throws OutOfArgumentsException, InvalidTypeException {
        String val = readLine(prompt, String.valueOf(predefined));
        double retval;
        
        try {
            retval = Double.parseDouble(val);
        } catch(NumberFormatException e) {
            throw new InvalidTypeException("Ocekaval jsem cele kladne cislo.");
        }
        
        return retval;
    }

    public double readPositiveDouble(String prompt, double predefined) throws OutOfArgumentsException, InvalidTypeException {
        String val = readLine(prompt, String.valueOf(predefined));
        double retval;
        
        try {
            retval = Double.parseDouble(val);

            if(retval < 0.0) throw new NumberFormatException();
        } catch(NumberFormatException e) {
            throw new InvalidTypeException("Ocekaval jsem cele kladne cislo.");
        }
        
        return retval;
    }
}
