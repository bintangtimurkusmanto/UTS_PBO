package gamemath;

import java.util.Scanner;

/**
 *
 * @author Alam K3518049
 */
public class GameMath {
    protected String name;
    
    public GameMath(String name){
        this.name = name;
    }
    public void MenuUtama(){
        String pilih;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("********************");
        System.out.println("Game Math");
        System.out.println("********************");
        System.out.println("Menu :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        
        System.out.print("Pilih no menu : ");        
        pilih = keyboard.nextLine();
        
        int pilih1 = Integer.parseInt(pilih);
        if(pilih1 == 1){
            Penjumlahan p = new Penjumlahan(name);
            p.play();
            
        }else if(pilih1 == 2){
            Pengurangan m = new Pengurangan(name);
            m.play();
            
        }else if(pilih1 == 3){
            System.out.println("********************");
            System.out.println("Anda Keluar dari Game");
            System.out.println("********************");
            
        }else{
            GameMath start = new GameMath(name);
            start.MenuUtama();
        }
    }
    
    public static void main(String[] args) {
        String nama;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("********************");
        System.out.println("Game Math");
        System.out.println("********************");
        
        System.out.print("Masukkan Nama Anda : ");
        nama = keyboard.nextLine();
        
        GameMath start = new GameMath(nama);
        start.MenuUtama();
    }
}
