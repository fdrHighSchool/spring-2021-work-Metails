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

}//end add(int val) method

public void add(int index, int val){
  this.arraySize = this.arraySize + 1;
  int[] pushArray = new int[arraySize];
  System.arraycopy(this.array, (index), pushArray, (index + 1), (this.array.length - 1) - index);
  System.arraycopy(this.array, 0, pushArray, 0, index);
  pushArray[index] = val;

  this.array = pushArray;
}//end add(int index, int val) method

public void grow(int n){
this.arraySize = this.arraySize + n;
int[] tempArray = new int[this.arraySize];

System.arraycopy(this.array, 0, tempArray, 0, this.array.length);

this.array = tempArray;

}//end grow method

public void set(int i, int val){
this.array[i] = val;
}//end set method

public boolean isEmpty(){
  for(int count = 0; count < this.array.length; count++){
    this.space = false;
    if(this.array[count] == 0){
      this.space = true;
    }//end if statement
  }//end for loops
  return space;
}//end isEmpty method

public void remove(int index){
 this.array[index] = 0;
}//end remove method

public void fillArray(){
  for(int arrayCount = 0; arrayCount < this.array.length; arrayCount++){
    this.array[arrayCount] = (int)(Math.random() * 46 + 55);
  }//end for loop
}//end fillArray method

public String toString(){
  return ("Numbers: " + Arrays.toString(this.array));
}//end toString  method

}//end class
