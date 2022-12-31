/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectkelompok16;

import jenisroti.Pizza;
import jenisroti.RotiManis;
import jenisroti.RotiTawar;
/**
 *
 * @author Lenovo
 */
public class ProjectKelompok16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RotiManis rm = new RotiManis();
        rm.varian1(50);
        System.out.println("");
        rm.varian2(100);
        System.out.println("");
        rm.varian3(70);
        System.out.println("");
        
        RotiTawar rt = new RotiTawar();
        rt.varian1(20);
        System.out.println("");
        rt.varian2(15);
        System.out.println("");
        
        Pizza pz = new Pizza();
        pz.varian1(10);
    }
    
}
