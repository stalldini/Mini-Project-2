import java.util.Scanner;
//Evan Naylor, Reese Spacia, Austin Stallings, Peyton Hicks
//Version 1

class Main {
  public static void main(String[] args) {
    Pillowcase sheet = new Pillowcase();

    Scanner s = new Scanner(System.in);

    System.out.println("Happy Halloween! How many houses should we trick or treat at?");

    int numHouses = s.nextInt();

    while(numHouses > 100){
      System.out.println("You can only hold 1000 pieces of candy. Please enter a number less than 1000.");

      numHouses = s.nextInt();
      
    }
    s.close();

    for(int i=0; i < numHouses; i++){
       sheet.baggedCandy();
    }
    System.out.print("We got a total of " + sheet.getCandy() + " candies. ");
    
  System.out.print("This is " + sheet.getPercentage() + "% of our pillow case.");

}
}