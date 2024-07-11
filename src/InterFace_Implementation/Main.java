//package InterFace_Implementation;
//
//import java.io.IOException;
//
//public class Main {
//
//    public static void main(String[]args) throws IOException {
//       Bird bird = new Bird();
//       Animal animal = bird;
//       FlightEnabled flier = bird;
//       Trackable track = bird;
//
//       animal.move();
//       //flier.move();
//       //track.move();
//
////        flier.TakeOff();
////        flier.fly();
////        track.track();
////        flier.land();
//        inFlight(flier);
//        inFlight(new Jet());
//        Trackable truck = new Truck();
//        truck.track();
//        double kmsTravelled = 100;
//        double milesTravelled = kmsTravelled * FlightEnabled.KM_TO_MILS;
//        System.out.printf("The Truck Travelled %.2f km or %.ef miles%n",kmsTravelled, milesTravelled);
//
//    }
//
//    private static void inFlight(FlightEnabled flight){
//        flight.TakeOff();
//        flight.fly();
//        if(flight instanceof Trackable tracked){
//            tracked.track();
//        }
//        flight.land();
//
//    }
//}
