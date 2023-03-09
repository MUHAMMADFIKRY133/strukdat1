/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strukdat;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();
        
        
        Makanan roti = new Makanan();
        roti.setNamaHidangan ("roti tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("SUSU SAPI");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);
        
        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("nasi putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("air putih");
        
        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch);
        
        System.out.println("Menu Konsumsi");
        for (Konsumsi<Makanan,Minuman> konsumsi: listKonsumsi){
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();
            
            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }
    }
            
}
