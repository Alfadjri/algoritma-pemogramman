public class Main {
    public static void main(String[] args) {
        System.out.println("Kalkulator Sederhana");
        // Memanggil function
        int hasil = tambah(1,5);
        // mencetak hasil
        System.out.println(hasil);
        System.out.println();

        // contoh ke dua
        // menghitung luas segitiga
        // rumus alas * tInggi / 2
        int alas = 2;
        int tinggi = 10;
        float luas = luasSegitiga(alas,tinggi);

        System.out.println(luas);
    }

    public static float luasSegitiga(int alas , int tinggi ){
        // contoh memnaggil function dalam function
        return bagi(kali(alas,tinggi) , 2);
    }

    // cara membuat function
    // keamanan caraKerja tipeData namafuntin(nilai yang mau di masukan ke funciton){
    //    // code yang akan di jalankan
    //    return (nilai yang akan di kembalikan)
    // }

    public static int tambah(int val1, int val2){
        return val1 + val2;
    }

    public static int kurang(int val1 , int val2 ) {
        return val1 - val2;
    }
    public static int bagi(int val1 , int val2 ){
        return val1 / val2;
    }

    public static int kali ( int val1 , int val2){
        return val1 * val2;
    }
}
