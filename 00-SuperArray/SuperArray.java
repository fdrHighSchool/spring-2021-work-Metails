public class SuperArray{
//Instance variables
private int arraySize;
private int[] array;



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
this.array[index] = val;
}//end add(int index, int val) method

public void grow(int n){

}//end grow method

public void set(int i, int val){

}//end set method

public boolean isEmpty(){

}//end isEmpty method

public void remove(int index){

}//end remove method

public String toString(){

}//end toString  method

}//end class
