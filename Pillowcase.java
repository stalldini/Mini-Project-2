import java.util.ArrayList;

class Pillowcase {
  
  ArrayList<Object> candyList = new ArrayList<Object>();

  double pillowCaseSize = 1000.0;
  
  int i;


  void baggedCandy(){
    Candy theCandy = new Candy();
    
    System.out.print("Trick or Treat!");

    String candyPicked = theCandy.getCandy();

    System.out.println("We got a " + candyPicked + "!");

    candyList.add(candyPicked);
  }
  void NumCandies(){
    int candyNames[] = new int[7];
    Candy theCandy = new Candy();
  
  for (i=0; i < candyList.size(); i++){
    String candyNames = candyList.get(i).toString();
  }

  if(candyNames.equals(theCandy.candyList[0])){
    candyNames[0]++;
  }

  else if(candyNames.equals(theCandy.candyList[1])){
    candyNames[1]++;
  }
  else if(candyNames.equals(theCandy.candyList[1])){
    candyNames[2]++;
  }

  else if(candyNames.equals(theCandy.candyList[1])){
    candyNames[3]++;
  }

  else if(candyNames.equals(theCandy.candyList[1])){
    candyNames[4]++;
  }
  else if(candyNames.equals(theCandy.candyList[1])){
    candyNames[5]++;
  }
  else if(candyNames.equals(theCandy.candyList[1])){
    candyNames[6]++;
  }
  for(i=0; i < theCandy.candyList.length; i++){
    System.out.println("We got " + candyNames[i] + " pieces of" + theCandy.candyList[i] + ".");
  }
  
  }
  double getPercentage(){
    double percentage = candyList.size()/pillowCaseSize * 100;
    return percentage;

  }

}
