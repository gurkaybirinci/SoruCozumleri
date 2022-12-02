package ifstatement;

public class Soru_03 {
    /*
        Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb
    */
    public static void main(String[] args) {
        int x = 4;
        if (x==1){
            System.out.println("Ocak");
        }else if (x==2){
            System.out.println("Şubat");
        }else if (x==3){
            System.out.println("Mart");
        }else {
            System.out.println("Geçersiz karakter");
        }
    }
}
