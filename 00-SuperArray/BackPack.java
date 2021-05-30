
public class BackPack{
//instance variables
private SuperArray backPack;

//-------------------------------------
//Constructor methods
public BackPack(){
  this.backPack = new SuperArray();
}//end constructor methods default

public BackPack(int size){
  this.backPack = new SuperArray(size);
}//end constructor methods case 2

//--------------------------------------

public void insertItems(int position, int amount){
 this.backPack.add(position, amount);
}//end addItems methods

public void addItems(int amount){
  this.backPack.add(amount);
}//end addItems method

public void takesItem(int position, int amount){
  this.backPack.minus(position, amount);
}//end removeItem

public void discardItems(int position){
 this.backPack.remove(position);
}//end discardItems methods

public void giveRandomItems(){
  this.backPack.fillArray();
}//end givenRandomItems method

public String toString(){
  return ("Displaying backpack items: " + backPack.toString());
}//end toString method

}//end class
