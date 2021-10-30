import java.util.Random;


class Candy {
  private String name;

  String candyList[] = new String []{
    "M&Ms", "Pink Starburst", "Hersheys Bar" , "Milkyway", "Twix" , "Reeses" , "KitKat"
  };

  Candy(){
    name = "";
  }
  Candy (String aName){
    name = aName;
  }

  void setname (String aName){
    name = aName;
  }
  String getname(){
    return name;
  }
  void print(){
    System.out.println(name);
  }
  String getCandy(){
    Random r = new Random();
  
  int randomCandy = r.nextInt(101);

  if(randomCandy > 1 && randomCandy <=10){
    return(candyList[0]);
  }
  else if(randomCandy > 10 && randomCandy <= 30){
    return (candyList[1]);
  }
  else if(randomCandy > 30 && randomCandy <= 45){
    return (candyList[2]);
  }
  else if(randomCandy > 45 && randomCandy <= 55){
    return (candyList[3]);
  }
  else if(randomCandy > 55 && randomCandy <= 70){
    return (candyList[4]);
  }
  else if(randomCandy > 70 && randomCandy <= 95){
    return (candyList[5]);
  }
  else{
    return(candyList[6]);
  }

  }
}