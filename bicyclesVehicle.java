public class bicyclesVehicle extends vehicle{ 
   
   public bicyclesVehicle(int number,String brand,int year){
       super(number, brand, year);

   }
     public int calculateRentAmount(int period){
    return period*3;

   }

}