package factory;

public class PhoneSeller {
    public static void main(String[] args) {
        Phone phone=PhoneFactory.getPhone("iphone13","500",1,2);
        Phone phone1=PhoneFactory.getPhone("iphone14","123",2,3);

        System.out.println(phone);
        System.out.println(phone1);
    }
}
