public class PrismaSegiempat extends Segiempat implements BangunRuang {
    private double tinggiPrisma;
    
    public PrismaSegiempat(double panjang, double lebar, double tinggiPrisma) {
        super(panjang, lebar);
        this.tinggiPrisma = tinggiPrisma;
    }
    
    public double getTinggiPrisma() { 
        return tinggiPrisma; 
    }
    
    public double hitungLuasSelimut() {
        return hitungKeliling() * tinggiPrisma;
    }
    
    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggiPrisma;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 2 * hitungLuas() + hitungLuasSelimut();
    }
    
    @Override
    public void displayInfo() {
        System.out.println("===== PRISMA SEGIEMPAT =====");
        System.out.println("Panjang alas: " + panjang);
        System.out.println("Lebar alas: " + lebar);
        System.out.println("Tinggi prisma: " + tinggiPrisma);
        System.out.println("Luas permukaan: " + hitungLuasPermukaan());
        System.out.println("Volume: " + hitungVolume());
    }
}