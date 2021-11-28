public class latihan1 {

    /* ini di sebut badan program di ikutin dengan kurung kurawal
        public static void main(String args[]){
        // pemogramman dan alogoritma
        System.out.println("Hello IF-A"); // berguna Menampilkan atau mencetak teks pada komsole // println : setelah tampil di beri new line

        }
    */
    public static void main(String args[]){
        System.out.println("Hello IF-A");
        System.out.println("Contoh Sequenstial : ");
        // deklasrasi variabel
        int a = 0;
        int b = 3;
        int c = 4 + a + b;

        // mencetak variabel
        System.out.println(c);

        System.out.println("Percabangan");
        if ( c <= 7 ){
            System.out.println("Lebih kecil sama dengan  7");
        }else{
            System.out.println("Lebih besar dari 7");
        }

        System.out.println("Contoh Perulangan");
        // dalam for wajin dekarasi perulangan
        for(int i = 0 ; i < c ; i++){
            System.out.println("Putar ke " + (i+1) + " = " + i);
        }

    }
}
