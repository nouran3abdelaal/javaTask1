import java.util.*;
public class vehicleRentalSystemClass{
    Map<String, vehicle> veichles ;
    int totalRentRevenue;
    int number =1;

    public vehicleRentalSystemClass(){
        this.veichles= new HashMap<>();
        totalRentRevenue=0;
    }
    public void addVehicles(vehicle v){
        veichles.put(("A,"+v.number),v);
    }
    public vehicle rentVehicle(int registrationNumber, int rentalPeriod){
        // vehicle rentVehicle = returnVehicle(registrationNumber);
        vehicle rentVehicle =null;
if (veichles.containsKey("A,"+registrationNumber)) {
           rentVehicle = veichles.get("A,"+registrationNumber);
        veichles.remove("A,"+registrationNumber);
        veichles.put(("B,"+registrationNumber),rentVehicle);
        totalRentRevenue+=rentVehicle.calculateRentAmount(rentalPeriod);
        if(rentVehicle instanceof carVehicle){
            System.out.println("Car is rented");
        }
        else  if(rentVehicle instanceof motorcycleVehicle){
            System.out.println("Motorcycle is rented");
        }
          else  if(rentVehicle instanceof bicyclesVehicle){
            System.out.println("bicycle is rented");
        }
        else{
          System.out.println("unkonwn type is rented");

        }
        // return rentVehicle;
       }
       else if(veichles.containsKey("B,"+registrationNumber)){
        System.out.println("Sorry this vehicle is unavaiable now");

       }
       else{
                System.out.println("Sorry there is no car with this registrationNumber "+registrationNumber);

       }
        
        // registrationNumber++;
        return rentVehicle;


    }
    public vehicle returnVehicle(int registrationNumber){
         vehicle rentVehicle = veichles.get("B,"+registrationNumber);
        veichles.remove("B,"+registrationNumber);
        veichles.put(("A,"+registrationNumber),rentVehicle);
        return rentVehicle;
    }
    public int getTotalRentalRevenue(){
        return totalRentRevenue;
    }
      public static void main(String[] args) {
        vehicleRentalSystemClass mySystem = new vehicleRentalSystemClass();
        carVehicle car1 = new carVehicle(mySystem.number++,"brad1",2000,"type1");
                // System.out.println(car1.number);

        motorcycleVehicle motor1 = new motorcycleVehicle(mySystem.number++,"brand2",2000,12);
                        // System.out.println(motor1.number);
        bicyclesVehicle b1 = new bicyclesVehicle(mySystem.number++,"brand2",2000);
         carVehicle car2 = new carVehicle(mySystem.number++,"brad1",2000,"type1");
                // System.out.println(car1.number);

        motorcycleVehicle motor2 = new motorcycleVehicle(mySystem.number++,"brand2",2000,12);
                        // System.out.println(motor1.number);
        bicyclesVehicle b2 = new bicyclesVehicle(mySystem.number++,"brand2",2000);

        mySystem.addVehicles(car1);
        mySystem.addVehicles(motor1);
        mySystem.addVehicles(b1);
         mySystem.addVehicles(car2);
        mySystem.addVehicles(motor2);
        mySystem.addVehicles(b2);

         for (Map.Entry<String, vehicle> entry : mySystem.veichles.entrySet()) {
            String key = entry.getKey();
            vehicle value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value.number);
        }
        mySystem.rentVehicle(1,2);
                System.out.println("The total Revenue is: "+mySystem.getTotalRentalRevenue());

        mySystem.rentVehicle(1,2);
                System.out.println("The total Revenue is: "+mySystem.getTotalRentalRevenue());

        mySystem.returnVehicle(1);
                System.out.println("The total Revenue is: "+mySystem.getTotalRentalRevenue());

        mySystem.rentVehicle(1,2);
                System.out.println("The total Revenue is: "+mySystem.getTotalRentalRevenue());

        mySystem.rentVehicle(2,2);
                System.out.println("The total Revenue is: "+mySystem.getTotalRentalRevenue());

         mySystem.rentVehicle(3,2);
                 System.out.println("The total Revenue is: "+mySystem.getTotalRentalRevenue());

          mySystem.rentVehicle(2,2);
        System.out.println("The total Revenue is: "+mySystem.getTotalRentalRevenue());



    }


}