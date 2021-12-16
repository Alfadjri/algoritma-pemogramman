public class Main {
    public static void main(String[] args) {
        // contoh kasus menghitung luas segitiga;
        int alas= 2;
        int tinggi=10;

        // memanggil class  penudukung
        Lib lib = new Lib();
        // memanggil funtion yang ada dalam class pendukung
        // .namaFuntion(parameter)
        float luasSegitiga = lib.luasSegitiga(alas,tinggi);
        float luasSegiempat = lib.luasSegiEmpat(4);

        System.out.println("Luas Segitiga");
        System.out.println("Jika alas 2 dan tinggi 10 adalah " + luasSegitiga);

        System.out.println("Luas SegiEmpat");
        System.out.println("Jika sisinya 4 adalah " + luasSegiempat);

    }
}
