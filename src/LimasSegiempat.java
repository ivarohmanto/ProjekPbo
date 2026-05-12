/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Msi-Modern
 */
public class LimasSegiempat extends Segiempat implements BangunRuang {
    private double tinggi;
    
    public LimasSegiempat(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public double getTinggi() { return tinggi; }
    
    // Tinggi segitiga sisi tegak (pakai Pythagoras)
    private double tinggiSisiPanjang() {
        return Math.sqrt(tinggi * tinggi + (lebar/2) * (lebar/2));
    }
    
    private double tinggiSisiLebar() {
        return Math.sqrt(tinggi * tinggi + (panjang/2) * (panjang/2));
    }
    
    // Implementasi BangunRuang
    @Override
    public double hitungVolume() {
        return (1.0/3.0) * hitungLuas() * tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();
        double luasSisi = panjang * tinggiSisiPanjang() + lebar * tinggiSisiLebar();
        return luasAlas + luasSisi;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("===== LIMAS SEGIEMPAT =====");
        System.out.println("Panjang alas: " + panjang);
        System.out.println("Lebar alas: " + lebar);
        System.out.println("Tinggi limas: " + tinggi);
        System.out.println("Luas permukaan: " + hitungLuasPermukaan());
        System.out.println("Volume: " + hitungVolume());
    }
}