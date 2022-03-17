import java.util.Scanner;

public class Civilian extends AitTransport {
    private int numberOfPassengers;
    private boolean businessClass;

    public Civilian(int power, double maxSpeed, int weight, String carBrand, int wingsFrame, int minRunwayLength, int numberOfPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, carBrand, wingsFrame, minRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void checkPassenger(){
        Scanner scanner=new Scanner(System.in);
        int passenger=scanner.nextInt();
        if(numberOfPassengers>=passenger){
            System.out.println("пасажири на месте");
        }
        else {
            System.out.println("самолет переполнен");
        }
    }
}

