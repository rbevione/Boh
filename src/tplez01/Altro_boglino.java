/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Altro_boglino
    {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String string;
        double primo_numero = 1.0;
        double secondo_numero = 1.0;
        boolean error = false;
        //Prendo in input il primo numero
        do
        {
            string = JOptionPane.showInputDialog("Inserire il primo numero di merda");
            try
                {
                    primo_numero = Double.parseDouble(string);
                    error = false;
                }
            catch (Exception e)
            {
                    JOptionPane.showMessageDialog(null, "QUINDICI E DICIOTTO QUANTO FA? COGLIONE! DIO PORCO");
                    error = true;
            }
        }
        while (error == true);
        
        //prendo in input il secondo numero
        do
        {
            string = JOptionPane.showInputDialog("Inserire il secondo numero di merda");
            try
                {
                    secondo_numero = Double.parseDouble(string);
                    error = false;
                }
            catch (Exception e)
            {
                    JOptionPane.showMessageDialog(null, "TE SPACCO LA SCHIENA DIO CRETINO");
                    error = true;
            }
        }
        while (error == true);
        //Scambio
        {
        double temp = primo_numero;
        primo_numero = secondo_numero;
        secondo_numero = temp;
        string = "Il secondo numero è "+primo_numero+ " e il primo numero è "+secondo_numero+ " e li ho appena scambiati";
        JOptionPane.showInputDialog (null, string);
        }
    }
}