import java.util.*;
public class Distance 
{   
    public static void main(String args [])
    {   
        Scanner scan = new Scanner(System.in);
        double latitude1,latitude2,longitude1,longitude2,distance;
        double r = 6378.1;
    
        System.out.println("Please enter the latitude of point one");
        latitude1 = scan.nextDouble();
        
        System.out.println("Please enter the longitude of point one");
        longitude1 = scan.nextDouble();
        
        System.out.println("Please enter the latitude of point two");
        latitude2 = scan.nextDouble();
        
        System.out.println("Please enter the longitude of point two");
        longitude2 = scan.nextDouble();
        
        distance = (2*r)*(Math.asin(Math.sqrt( Math.pow(Math.sin((Math.toRadians(latitude2-latitude1))/2),2) + (Math.cos(Math.toRadians(latitude1)))*(Math.cos(Math.toRadians(latitude2)))*(Math.pow(Math.sin((Math.toRadians(longitude2-longitude1))/2),2)))));
        System.out.println("The distance between your two points is: " + distance+" km");
    }
}