import java.util.Scanner;

public class Cargo extends GraundTransport{
    private int tonnage;

    public Cargo(int power, double maxSpeed, int weight, String carBrand, int numberOfWheel, int fuelConsumption, int tonnage) {
        super(power, maxSpeed, weight, carBrand, numberOfWheel, fuelConsumption);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public void checkTonnage(){
        Scanner scanner=new Scanner(System.in);
        int tonnageToCargo=scanner.nextInt();
        if(tonnage>tonnageToCargo){
            System.out.println("Грузовик загружен");
        }
        else {
            System.out.println("вам нужен грузовик побольше");
        }
    }
}
