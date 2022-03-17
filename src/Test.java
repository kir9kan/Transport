public class Test {
    public static void main(String[] args) {
        Passanger auto=new Passanger(100,125,1000," audi quatro",4,11,"auto",5);
        System.out.println("за время "+auto.time+" ч, автомобиль"+ auto.getCarBrand() +" двигаясь с максимальной скоростью"+
                auto.getMaxSpeed()+" км/ч проедет"+auto.timeRideOnMaxSpeed()+" км и израсходует"+auto.flueConsumption()+" литров топлива");
        Military plane=new Military(1200,1300,1500,"mig29",10,800,true,3);
        plane.checkRocets();

        plane.checkRocets();
        plane.checkRocets();
        plane.checkRocets();
        plane.cata();


    }
}
