package wrapperclass;

public class Soru_02 {

    //Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
    //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
    //değişken arasındaki farkı yazdırınız.
    public static void main(String[] args) {

        String a = "103";
        byte b = Byte.valueOf(a);

        String c = "2351";
        Short d = Short.valueOf(c);

        System.out.println(d - b);

//        String x="103";
//        byte a = Byte.parseByte(x);
//
//        String y = "2351";
//        Short b=Short.parseShort(y);



    }

}
