/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bruch;


public class Bruchtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bruch b = new Bruch();
        System.out.println("b1: " + b); // gibt Speicheradresse aus
        b.zaehler = 5;
        b.nenner = 8;
        b.ausgeben();
        System.out.println("\tAusgabe durch Methode ausgeben()");
        System.out.println("Bruch b = " + b.zaehler + " / " + b.nenner);
    }

}
