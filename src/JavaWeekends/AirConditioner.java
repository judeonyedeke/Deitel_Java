package JavaWeekends;

public class AirConditioner {
    private int temperature;
    private boolean isOn;

    public void turnAcOn() {
        isOn = true;
    }

    public void turnAcOff() {
        isOn = false;
    }


    public void increaseTemperature(int degree) {
                temperature = temperature + degree;
            if (temperature > 30) {
                temperature = 30;
            }
        System.out.println("Temperature is cold. ");
    }

    public boolean onOff() {
        return isOn;
    }

    public void decreaseTemperature(int degree) {
        temperature = temperature - degree;
        if(temperature < 16) {
                temperature = 16;
        }
        System.out.println("Temperature is hot.");
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int degree) {
        if (degree >= 16) {
            if (degree <= 30) {
                temperature = degree;
            }
        }
        if (degree < 16) {
            temperature = 16;
        }
        if (degree > 30) {
            temperature = 30;
        }
    }
}
