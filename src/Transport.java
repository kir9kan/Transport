public class Transport {
    private int power;
    private double maxSpeed;
    private int weight;
    private String carBrand;

    public Transport(int power, double maxSpeed, int weight, String carBrand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carBrand = carBrand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
    public double powerKWat(double powerKWat){
        powerKWat=power*0.74;
        return powerKWat;
    }
}
