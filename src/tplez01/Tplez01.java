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
public class Tplez01
{
    /**
     * @param args the command l0.ine arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //carica i dati per ottenere il cont
        String num1;
        String num2;
        int conto;
        
        num1 = JOptionPane.showInputDialog("Primo numero");
        num2 = JOptionPane.showInputDialog("Secondo numero");
        //calcolare il conto
        
        try
        {
                conto = Integer.parseInt(num1) + Integer.parseInt(num2);
                JOptionPane.showMessageDialog(null, conto);
        }
        catch (Exception e)
        {
                JOptionPane.showMessageDialog(null, "LOL NO");
        }
    }
}

/*
    MADONNA CHE SCHIFO IL JAVA
                VOGLIO IL NOME DI 'STO COGLIONE CHE L'HA INVENTATO
                        MA CHE VERGOGNA
                                MA CHE SCHIFO
                                        PIUTTOSTO CHE PROGRAMMARE A QUESTO MODO
                                                   SPERO NEL TIFO
                                        (LA MALATTIA, DICO,
                                                QUELLA CHE TI LASCIA MORTO STECCHITO;
                                        NON QUELLO DA STADIO
                                                PER I GLADIATORI COL GLADIO)
*/