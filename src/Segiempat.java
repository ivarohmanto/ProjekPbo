/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Msi-Modern
 */
public abstract class Segiempat implements BangunDatar {
    protected double panjang;
    protected double lebar;
    
    public Segiempat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Getter
    public double getPanjang() { return panjang; }
    public double getLebar() { return lebar; }
    
    // Implementasi BangunDatar
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    // Abstract method untuk display
    public abstract void displayInfo();
}