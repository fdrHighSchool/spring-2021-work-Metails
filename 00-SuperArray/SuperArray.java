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
  int[] temporary = this.array;

  //start of for loops
  for(int count = index; count < arraySize - 1; count++){
    System.out.println(Arrays.toString(temporary));
    this.array[count + 1] = temporary[count];
  }//end for loops
  this.array[index] = val;
}//end add(int index, int val) method


public void grow(int n){
this.arraySize = this.arraySize + n;
int[] tempArray = new int[this.arraySize];

for(int i = 0; i < this.array.length; i++){
  tempArray[i] = this.array[i];
}//end for loop

this.array = tempArray;

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

public void remove(int index){
 this.arraySize = this.arraySize - 1;
 int[] removeIndex = new int[arraySize];
 if(index == 0){
 System.arraycopy(this.array, 1, removeIndex, 0, this.array.length - 2);
}else{
 System.arraycopy(this.array, index, removeIndex, index - 1, (this.array.length - 1) - index);
 System.arraycopy(this.array, 0, removeIndex, 0, index);
}//end else statement
this.array = removeIndex;
}//end remove method

public void fillArray(){
  for(int arrayCount = 0; arrayCount < this.array.length; arrayCount++){
    this.array[arrayCount] = (int)(Math.random() * 46 + 55);
  }//end for loop
  this.arraySize = 10;
}//end fillArray method

public String toString(){
  return ("Numbers: " + Arrays.toString(this.array));
}//end toString  method

}//end class
