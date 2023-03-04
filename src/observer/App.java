package observer;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        BigDecimal min = BigDecimal.valueOf(23);
        BigDecimal max = BigDecimal.valueOf(28);

        Thermometer thermometer = new Thermometer(min, max);

        Parent mom=new Parent("she");
        Parent dad=new Parent("he");

        thermometer.add(mom);
        thermometer.add(dad);
        for(int i=thermometer.getCurrentTemp().intValue();i<=30;i++){
            thermometer.setCurrentTemp(BigDecimal.valueOf(i));
        }

        for(int i=thermometer.getCurrentTemp().intValue();i>=22;i--){
            thermometer.setCurrentTemp(BigDecimal.valueOf(i));
        }

    }
}
