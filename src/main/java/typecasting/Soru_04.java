package typecasting;

public class Soru_04 {

    // Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
    // Sonrasında bu short değişkenin değerini konsolda yazdırınız.
    // Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
    public static void main(String[] args) {
        double a = 225.65;
        short b = (short)a;
        System.out.println(b);
    }
}
