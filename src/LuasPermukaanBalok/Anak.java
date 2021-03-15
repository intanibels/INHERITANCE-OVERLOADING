package LuasPermukaanBalok;
public class Anak extends Induk{
    //membuat method BalokDua menggunakan parameter
    public void BalokDua(double panjang, double lebar, double tinggi){
        //mengubah isi variabel
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        //hasil output dan perhitungan
        System.out.println("|   LUAS PERMUKAAN BALOK II  |");
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