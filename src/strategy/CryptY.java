package strategy;

public class CryptY implements Crypt{
    @Override
    public void encrypt(String key) {
        System.out.println(key+" is crypting with CryptY");
    }

    @Override
    public void decrypt(String key) {
        System.out.println(key+" is decrypting with CryptY");
    }
}
