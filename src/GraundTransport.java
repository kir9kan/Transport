public class GraundTransport extends Transport {
    private int numberOfWheel;
    private int fuelConsumption;

    public GraundTransport(int power, double maxSpeed, int weight, String carBrand, int numberOfWheel, int fuelConsumption) {
        super(power, maxSpeed, weight, carBrand);
        this.numberOfWheel = numberOfWheel;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}


