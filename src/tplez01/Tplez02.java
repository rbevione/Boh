/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
  * and open the template in the editor.
 */

package tplez01;
import javax.swing.JOptionPane;
import static javax.xml.bind.DatatypeConverter.parseDouble;

//PROBLEMA
/*
    Ho un cinema, devo capire se mi conviene tenere aperto in inverno nel prato.
    I riscaldatori sono di tante misure diverse e chiedono un tot all'ora. Devo vedere se rientro nel costo del riscaldamento con i biglietti. Comunque ho pure una legge per cui
    non posso mettere più di una sedia al metro quadro.
*/
/**

*
 * @author tss
 */

public class Tplez02
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        double  prezzo_riscaldamento = 1.0;
        double  prezzo_biglietto = 1.0;
        double  raggio_pallone = 1.0;
        final double PI = 3.1415;
        double  durata_film = 120;

        prezzo_riscaldamento = Double.parseDouble(JOptionPane.showInputDialog("Inserire il costo orario del riscaldamento al metro cubo di merda"));
        raggio_pallone = Double.parseDouble(JOptionPane.showInputDialog("Inserire la dimensione del pallone riscaldante di merda"));
        prezzo_biglietto = Double.parseDouble(JOptionPane.showInputDialog("Inserire il prezzo del biglietto di merda"));
        durata_film = Double.parseDouble (JOptionPane.showInputDialog("Inserire la durata di 'sto film di merda"));

        double  superficie_pallone = PI * raggio_pallone * raggio_pallone;
        double  max_persone = Math.floor (superficie_pallone);
        double  volume_pallone = superficie_pallone * 2 / 3 * raggio_pallone;
        double  ricavo = (max_persone * prezzo_biglietto) - (volume_pallone * prezzo_riscaldamento * durata_film);
//      printf ("tua mamma è antipatica");
    }
}
