/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemath;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Bintang
 */
public class FormatBilangan {
    
    private int angka;
    private String number;
    private int bilNegatif;
    
    public void FormatBilangan(int a){
       NumberFormat formatter;
       angka = a;
       if(angka >= 0){
           formatter = new DecimalFormat("##");
           number = formatter.format(angka);
       }else{
           formatter = new DecimalFormat("(-##)");
           bilNegatif = (angka) * -1;
           number = formatter.format(bilNegatif);
       }
    }
    public String getFormat(){
        return number;
    }
}
