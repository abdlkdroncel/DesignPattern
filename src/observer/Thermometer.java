package observer;

import java.math.BigDecimal;

public class Thermometer extends Observable {

    private BigDecimal currentTemp;
    private BigDecimal minTemp;
    private BigDecimal maxTemp;

    public Thermometer(BigDecimal minTemp, BigDecimal maxTemp) {
        this.currentTemp = BigDecimal.valueOf(24);
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public BigDecimal getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(BigDecimal currentTemp) {
        this.currentTemp = currentTemp;

        System.out.println(currentTemp);

        checkTemp();
    }

    private void checkTemp() {

        boolean hot = currentTemp.compareTo(maxTemp) >= 0;
        boolean cold = currentTemp.compareTo(minTemp) <= 0;

        if(hot || cold){
            info();
        }

    }
}
