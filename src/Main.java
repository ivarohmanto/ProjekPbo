public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== PROGRAM BANGUN RUANG OOP ===\n");
        
        // Membuat objek Limas
        LimasSegiempat limas = new LimasSegiempat(8, 6, 12);
        limas.displayInfo();
        
        System.out.println();
        
        // Membuat objek Prisma
        PrismaSegiempat prisma = new PrismaSegiempat(5, 4, 10);
        prisma.displayInfo();
        
        System.out.println("\n=== DEMO POLYMORPHISM ===");
        
        // Array dengan interface BangunRuang
        BangunRuang[] bangun3D = new BangunRuang[2];
        bangun3D[0] = new LimasSegiempat(10, 8, 15);
        bangun3D[1] = new PrismaSegiempat(6, 4, 12);
        
        System.out.println("\nVolume bangun ruang:");
        for(int i = 0; i < bangun3D.length; i++) {
            System.out.println("Bangun " + (i+1) + ": " + bangun3D[i].hitungVolume());
        }
        
        // Array dengan abstract class Segiempat
        Segiempat[] alas = new Segiempat[2];
        alas[0] = new LimasSegiempat(7, 5, 10);
        alas[1] = new PrismaSegiempat(9, 6, 8);
        
        System.out.println("\nLuas alas bangun:");
        for(int i = 0; i < alas.length; i++) {
            System.out.println("Alas " + (i+1) + ": " + alas[i].hitungLuas());
        }
    }
}