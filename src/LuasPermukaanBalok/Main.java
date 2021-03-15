package LuasPermukaanBalok;
public class Main {
    public static void main(String[] args) {
        //membuat object dari kelas Induk
        Induk a = new Induk();
        //memanggil method BalokSatu
        a.BalokSatu();
        
        //memberi jarak
        System.out.println("");
        
        //membuat method dari kelas Anak
        Anak b = new Anak();
        //memanggil method BalokDua
        b.BalokDua(40, 50, 60);
    }
}