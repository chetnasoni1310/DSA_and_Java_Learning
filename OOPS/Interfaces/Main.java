package OOPS.Interfaces;

public class Main {
public static void main(String[] args) {

//   Engine car=new Vehicle();
////    Engine car;              WHATT IS THISS ??????????
//    car.stop();




//    MediaPlayer car=new Vehicle();
//    car.stop();
     // I  was tring to stop the media player but the car engine gets stop




//    now I will solve this problem
    //by creating nice car
    NiceCar car=new NiceCar();
    car.start();
    car.startMusic();
    car.UpgradeEngine(new ElectricEngine());
    car.start();
}
}
