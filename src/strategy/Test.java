package strategy;

public class Test {
    public static void main(String[] args) {
        Crypt x=new CryptX();
        x.encrypt("test");
        x.decrypt("test");

        Crypt y=new CryptY();
        y.decrypt("test");
        y.encrypt("test");
    }
}
