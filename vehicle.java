abstract class vehicle{
    int number=0;
   String brand;
   int year;

   public vehicle(int number,String brand,int year){
this.number=number;
    this.brand=brand;
    this.year = year;
   }
   public abstract  int calculateRentAmount(int period);



   
    
}