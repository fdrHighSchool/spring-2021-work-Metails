import java.lang.*;
import java.util.Arrays;
public class SuperArray{
//Instance variables
private int arraySize;
private int spaceIndex;
private int[] array;
private boolean space;
//----------------------------
//Constructor method 1
public SuperArray(int size){
this.arraySize = size;
this.array = new int[arraySize];
}//end constructor method 1
//Constructor method 2
public SuperArray(){
this.arraySize = 10;
this.array = new int[arraySize];
}//end constructor method 2

//---------------------------
//methods
public void add(int val){
//if no space, expand the array, and insert it there
if(isEmpty() == true){
this.array[spaceIndex] = val;
}else{
grow(1);
this.array[arraySize - 1] = val;
}//end else statement


}//end add(int val) method


public void add(int index, int val){
  grow(1);
  int[] temporary = copyArray();

  //for loops of pushing elements in the array forward to make up space for the val
  for(int count = index; count < arraySize - 1; count++){
    this.array[count + 1] = temporary[count];
  }//end for loops
  this.array[index] = val;
  System.out.println("Added value of " + val + " in the index of " + index);
}//end add(int index, int val) method



public int[] copyArray(){
  int[] temporaryArray = new int[arraySize];

  for(int indexCount = 0; indexCount < this.array.length; indexCount++){
  temporaryArray[indexCount] = this.array[indexCount];
  }//end for loops
  return temporaryArray;
}


public void grow(int n){
this.arraySize = this.arraySize + n;
int[] tempArray = new int[this.arraySize];

for(int i = 0; i < this.array.length; i++){
  tempArray[i] = this.array[i];
}//end for loop

this.array = tempArray;
System.out.println("Grew the size of the array from " + (arraySize - n) + " to " + arraySize);

}//end grow method

public void set(int i, int val){
this.array[i] = val;
}//end set method

public boolean isEmpty(){
  this.space = false;
  for(int count = arraySize - 1 ; count >= 0; count--){
    if(this.array[count] == 0){
      this.spaceIndex = count;
      this.space = true;
    }//end if statement
  }//end for loops
  if(space == true){
    System.out.println("There is a space.");
  }else{
    System.out.println("There is no space.");
  }//end else statement

  return this.space;
}//end isEmpty method

public void minus(int index, int amount){
  if(this.array[index] < amount){
    System.out.println("Unable to do so because you don't have enough items to take away");
  }else{
    System.out.println("Took away " + amount + " items in the position of " + index + " in the backpack");
  this.array[index] -= amount;
  }//end else statement
}//end minus method

public void remove(int index){
arraySize -= 1;
int[] tempRemove = new int[arraySize];

//Copying all value in original index to temp array up to the index user wanted to remove
for(int count = 0; count < index; count++){
  tempRemove[count] = this.array[count];
}//end for loop

//Copying all value after the given index
for(int count = index + 1; count < arraySize; count++){
  tempRemove[count - 1] = this.array[count];
}//end for loop

 this.array = tempRemove;
 System.out.println("Removed index " + index);
}//end remove method




public void fillArray(){
  for(int arrayCount = 0; arrayCount < this.array.length; arrayCount++){
    this.array[arrayCount] = (int)(Math.random() * 46 + 55);
  }//end for loop
  this.arraySize = 10;
}//end fillArray method

public String toString(){
  return (Arrays.toString(this.array) + "\n");
}//end toString  method

}//end class
