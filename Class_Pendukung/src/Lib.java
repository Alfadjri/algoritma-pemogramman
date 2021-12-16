public class Lib {
    // isi dari class pendukung
    // contoh modifire public
    public float luasSegitiga(int alas,int tinggi){
        float hasil = bagi(kali(alas,tinggi),2);
        return hasil;
    }
    // contoh ovaerload method
    public float luasSegitiga(float alas,float tinggi){
        float hasil =alas*tinggi/2;
        return hasil;
    }
    // conotoh modifire default
    float luasSegiEmpat(int sisi){
        float hasil = kali(sisi,sisi);
        return  hasil;
    }
    // contoh smodifire private
    private float luasSegiEmpat2(int sisi){
        float hasil = kali(sisi,sisi);
        return  hasil;
    }
    public int tambah(int val1, int val2){
        return val1 + val2;
    }
    public int kurang(int val1 , int val2 ) {
        return val1 - val2;
    }
    private int bagi(int val1 , int val2 ){
        return val1 / val2;
    }
    private int kali ( int val1 , int val2){
        return val1 * val2;
    }
}
