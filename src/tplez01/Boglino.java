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
public class Boglino
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
        //Differenzio
        try
        {
                double differenza = primo_numero-secondo_numero;
                String messaggio = "la differenza fra i due numeri è " + differenza;
                JOptionPane.showMessageDialog(null, messaggio);
        }
        catch (Exception e)
        {
                JOptionPane.showMessageDialog(null, "Ti do uno sciafon che ti fico su per il muro tua mamma puttana che te copo dio cane");
        }
    }
}