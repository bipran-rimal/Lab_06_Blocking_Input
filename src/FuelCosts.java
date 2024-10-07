import java.util.Scanner;
public class FuelCosts{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        boolean done = false;
        System.out.println("Enter the number of gallons of gas in tank");
        double numberOfGallons = in.nextDouble();
        System.out.println("Enter the fuel efficiency in miles per gallon");
        double fuelEfficiency = in.nextDouble();
        System.out.println("Enter the price per gallon");
        double priceOfGallon = in.nextDouble();
        double costToDrive100Miles = (100/fuelEfficiency)*priceOfGallon;
        double distanceWithFullTank = numberOfGallons * fuelEfficiency;
        System.out.println("Cost to drive 100 miles: $"+ costToDrive100Miles);
        System.out.println("Distance the car can go with a full tank :"+ distanceWithFullTank);
        done = true;
    }
}