package factory;

public class PhoneFactory
{
    public static Phone getPhone(String model,String battery,int width,int height){
        Phone phone;

        if("iphone13".equalsIgnoreCase(model)){
            phone=new iphone13(model,battery,width,height);
        }else if("iphone14".equalsIgnoreCase(model)){
            phone=new iphone13(model,battery,width,height);
        }else{
            throw new RuntimeException("Model Not Found");
        }
        return phone;
    }
}
