import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle: ");
        System.out.println("Enter the weight of the rectangle: ");
        if (in.hasNextDouble()){
            double heightInCms;
            heightInCms = in.nextDouble();
            double weightInCms;
            weightInCms = in.nextDouble();
            double area = heightInCms * weightInCms;
            System.out.println("The area of the rectangle is: "+ area);
            double diagonal = Math.sqrt(heightInCms*heightInCms+weightInCms*weightInCms);
            System.out.println("The diagonal of the rectangle is: "+ diagonal);
        }else{
            System.out.println("You have entered an invalid value");
            in.nextDouble();
        }
    }
}