import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Military extends AitTransport {
    public boolean ejectionSystem;
    public int missilesOnBoard;

    public Military(int power, double maxSpeed, int weight, String carBrand, int wingsFrame, int minRunwayLength, boolean ejectionSystem, int missilesOnBoard) {
        super(power, maxSpeed, weight, carBrand, wingsFrame, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.missilesOnBoard = missilesOnBoard;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getMissilesOnBoard() {
        return missilesOnBoard;
    }

    public void setMissilesOnBoard(int missilesOnBoard) {
        this.missilesOnBoard = missilesOnBoard;
    }

    public void checkRocets(){
        if(missilesOnBoard>0){
            System.out.println("ракета пошла");
            missilesOnBoard--;
        }
        else {
            System.out.println("боеприпасы отсутствуют");
        }
    }
    public boolean cata(){
        if (ejectionSystem == true){
            System.out.println("катапультирование прошло успешно");

        }
        else{
            System.out.println("нет такой систаемы");
        }
        return true;
    }
}
