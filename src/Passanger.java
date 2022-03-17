import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Passanger extends GraundTransport {
    private String bodyType;
    private int numberOfPassenger;

    public Passanger(int power, double maxSpeed, int weight, String carBrand, int numberOfWheel, int fuelConsumption, String bodyType, int numberOfPassenger) {
        super(power, maxSpeed, weight, carBrand, numberOfWheel, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassenger = numberOfPassenger;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    Scanner scanner =new Scanner(System.in);
    double time=scanner.nextDouble();
    public double timeRideOnMaxSpeed(){
        return time*getMaxSpeed();
    }
    public double flueConsumption(){
        double flueConsumption=timeRideOnMaxSpeed()/100*getFuelConsumption();
        return  flueConsumption;
    }
}
