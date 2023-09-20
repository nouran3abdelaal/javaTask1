public class motorcycleVehicle extends vehicle{ 
    int engineCapacity;
    public motorcycleVehicle(int number,String brand,int year,int engineCapacity){
       super(number, brand, year);
        this.engineCapacity=engineCapacity;

    }
     public int calculateRentAmount(int period){
    return super.calculateRentAmount( period)*2;

   }

}