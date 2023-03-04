package strategy;

public class CryptX implements Crypt {
    @Override
    public void encrypt(String key) {
        System.out.println(key+" is crypting with CryptX");
    }

    @Override
    public void decrypt(String key) {
        System.out.println(key+" is decrypting with CryptX");
    }
}
