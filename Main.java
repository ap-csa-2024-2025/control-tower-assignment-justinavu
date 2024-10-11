import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
   // Complete the code below
   
   // TODO: Create Airplane 1 and 2
   Airplane a1 = new Airplane();
   Airplane a2 = new Airplane("AAA02", 15.8, 128, 30000);
   // TODO: Create a Scanner
   Scanner sc = new Scanner(System.in);
   // TODO: Getting inputs for Airplane 3
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");

   // TODO: Create Airplane 3 from inputs
   String cs = sc.nextLine();
   cs = cs.toUpperCase();
   double dist = sc.nextDouble();
   int dir = sc.nextInt();
   int alt = sc.nextInt();
   Airplane a3 = new Airplane(cs, dist, dir, alt);
   // TODO: Print the initial positions
   System.out.println("\nInitial Positions:\nAirplane 1 -" + a1 + "\nAirplane 2 -" + a2 + "\nAirplane 3 -" + a3);
   
   // TODO: Print initial distances 
   System.out.println("\nInitial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + a1.distTo(a2));
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + a1.distTo(a3));
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + a2.distTo(a3));
   
   // TODO: Print initial height differences
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(a1.getAlt() - a2.getAlt()));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(a1.getAlt() - a3.getAlt()));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(a3.getAlt() - a2.getAlt()));
   
   // TODO: Airplane 1 changes
   a1.move(a2.distTo(a3), 65);
   a1.gainAlt();
   a1.gainAlt();
   a1.gainAlt();
   // TODO: Airplane 2 changes
   a2.move(8.0, 55);
   a2.loseAlt();
   a2.loseAlt();
   // TODO: Airplane 3 changes
   a3.move(5.0, 55);
   a3.loseAlt();
   a3.loseAlt();
   a3.loseAlt();
   a3.loseAlt();
   // TODO: Print new positions of airplanes
   System.out.println("\nNew Positions:\nAirplane 1 -" + a1 + "\nAirplane 2 -" + a2 + "\nAirplane 3 -" + a3);
   
   // TODO: Print new distances between airplanes
   System.out.println("\nNew Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + a1.distTo(a2));
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + a1.distTo(a3));
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + a2.distTo(a3));
   
   // TODO: Print new heights between airplanes
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(a1.getAlt() - a2.getAlt()));
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(a1.getAlt() - a3.getAlt()));
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(a2.getAlt() - a3.getAlt()));
   
  }
}
