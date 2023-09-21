public class carVehicle extends vehicle{
    String fuelType;
    public carVehicle(int number,String brand,int year,String fuelType){
       super(number, brand, year);
        this.fuelType=fuelType;

    }
     public int calculateRentAmount(int period){
    return period*4;

   }

}