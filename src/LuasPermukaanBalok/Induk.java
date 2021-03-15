package LuasPermukaanBalok;
public class Induk {
    //membuat variabel instance
    double panjang, lebar, tinggi;
    //membuat method BalokSatu
    public void BalokSatu(){
        //deklarasi Variabel
        this.panjang = 10;
        this.lebar = 20;
        this.tinggi = 30;
        //hasil output dan perhitungan
        System.out.println("|   LUAS PERMUKAAN BALOK I   |");
        System.out.println("==============================");
        System.out.println("Panjang Balok : "+panjang);
        System.out.println("Lebar Balok   : "+lebar);
        System.out.println("Tinggi Balok  : "+tinggi);
        double hasil = (panjang*lebar)+(panjang*tinggi)+(lebar*tinggi);
        System.out.println("Hasil         : 2*[("+panjang+"*"+lebar+")+("+panjang+"*"+tinggi+")+("+lebar+"*"+tinggi+")]");
        System.out.println("                2*("+(panjang*lebar)+"+"+(panjang*tinggi)+"+"+(lebar*tinggi)+")");
        System.out.println("                2*"+hasil);
        System.out.println("                "+(2*hasil));
    }
}