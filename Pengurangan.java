/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemath;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bintang
 */
public class Pengurangan extends Penjumlahan {

    public Pengurangan(String username) {
        super(username);
    }
       
    @Override
    public void play(){
        // load nyawa, level dan skor
        DataUser atur = new DataUser();
        atur.setNyawa(3);
        atur.setLevel(1);
        atur.setSkor(0);
        
        int lives = atur.getNyawa();
        double lvl = atur.getLevel();
        int skor = atur.getSkor();
        
        // load  format bilangan
        FormatBilangan f1 = new FormatBilangan();
        FormatBilangan f2 = new FormatBilangan();
        
        while (true){
            // deteksi level dan auto upgrade level
            if(skor >= 0 && skor < 101){
                lvl = 1;
            }else if(skor > 100 && skor < 201){
                lvl = 2;
            }else if(skor > 200 && skor <= 300){
                lvl =3;
            }else if(skor > 300){
                System.out.println("********************");
                System.out.println("[Selamat "+ this.username +", Anda telah menyelesaikan soal pengurangan dengan baik.]");
                System.out.println("********************");
                break;
            }
                
            if(lives != 0 && lvl == 1){
                // level 1
                // merandom bilangan sampai number 1 lebih besar
                while(true){
                    Random randomNumbers = new Random();
                    number1 = randomNumbers.nextInt(11);
                    number2 = randomNumbers.nextInt(11);

                    if(number2 <= number1){
                        break;
                    }
                }
                hasil = number1 - number2;
                
                String jawab;
                Scanner keyboard = new Scanner(System.in);
                
                System.out.println("");
                System.out.println("********************");
                System.out.println("Game Math - Pengurangan");
                System.out.println("********************");
                System.out.println("Berapakah hasil dari " + number1 + " - " + number2 + " ?");
                System.out.print("Jawab : ");
                jawab = keyboard.nextLine();
        
                int jawab1 = Integer.parseInt(jawab);
                if(hasil == jawab1){
                    skor = skor + 4;
                    System.out.println("[Selamat " + this.username + ", Anda benar][Skor: "+ skor +"][Lives: "+ lives +"][Level: "+ lvl +"]");
                }else{
                    skor = skor - 1;
                    lives = lives - 1;
                    System.out.println("[Wah, salah deh][Skor: "+ skor +"][Lives: "+ lives +"][Level: "+ lvl+ "]");
                }   
                
            }else if(lives != 0 && lvl == 2){
                // level 2
                Random randomNumbers = new Random();
                number1 = -1 * (1 + randomNumbers.nextInt(10));
                number2 = -1 * (1 + randomNumbers.nextInt(10));
                hasil = number1 - number2;
                
                // Format bilangan untuk tampilan
                f1.FormatBilangan(number1);
                f2.FormatBilangan(number2);
                String a = f1.getFormat();
                String b = f2.getFormat();
                
                String jawab;
                Scanner keyboard = new Scanner(System.in);
                
                System.out.println("");
                System.out.println("********************");
                System.out.println("Game Math - Pengurangan");
                System.out.println("********************");
                System.out.println("Berapakah hasil dari " + a + " - " + b + " ?");
                System.out.print("Jawab : ");
                jawab = keyboard.nextLine();
        
                int jawab1 = Integer.parseInt(jawab);
                if(hasil == jawab1){
                    skor = skor + 4;
                    System.out.println("[Selamat " + this.username + ", Anda benar][Skor: "+ skor +"][Lives: "+ lives +"][Level: "+ lvl +"]");
                }else{
                    skor = skor - 1;
                    lives = lives - 1;
                    System.out.println("[Wah, salah deh][Skor: "+ skor +"][Lives: "+ lives +"][Level: "+ lvl+ "]");
                }
                
            }else if(lives != 0 && lvl == 3){
                // level 3
                Random randomNumbers = new Random();
                number1 = randomNumbers.nextInt(21) - 10;
                number2 = randomNumbers.nextInt(21) - 10;
                hasil = number1 - number2;
                
                // Format bilangan untuk tampilan
                f1.FormatBilangan(number1);
                f2.FormatBilangan(number2);
                String a = f1.getFormat();
                String b = f2.getFormat();
                
                String jawab;
                Scanner keyboard = new Scanner(System.in);
                
                System.out.println("");
                System.out.println("********************");
                System.out.println("Game Math - Pengurangan");
                System.out.println("********************");
                System.out.println("Berapakah hasil dari " + a + " - " + b + " ?");
                System.out.print("Jawab : ");
                jawab = keyboard.nextLine();
        
                int jawab1 = Integer.parseInt(jawab);
                if(hasil == jawab1){
                    skor = skor + 4;
                    System.out.println("[Selamat " + this.username + ", Anda benar][Skor: "+ skor +"][Lives: "+ lives +"][Level: "+ lvl +"]");
                }else{
                    skor = skor - 1;
                    lives = lives - 1;
                    System.out.println("[Wah, salah deh][Skor: "+ skor +"][Lives: "+ lives +"][Level: "+ lvl+ "]");
                }
                
            }else if(lives == 0){
                // nyawa habis progaram keluar dari perulangan
                System.out.println("");
                System.out.println("Hai "+ this.username +" , jangan menyerah ya untuk mencoba lagi");
                break;
            }
        }
        // Nyawa habis kemudian kembali kemenu utama
        GameMath again = new GameMath(username);
        again.MenuUtama();
    }
}
