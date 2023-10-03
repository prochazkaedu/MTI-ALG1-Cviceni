/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu.prochazkaml.inputparser;

/**
 *
 * @author michal
 */
public class InvalidTypeException extends Exception {
    public InvalidTypeException(String err) {
        super(err);
    }
}
