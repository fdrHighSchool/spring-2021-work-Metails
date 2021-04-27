public class StepTracker{

private int active;
private int minimum;
private int steps;
private int days;

public StepTracker(int minimum){
this.minimum = minimum;
this.steps = 0;
this.days = 0;
this.active = 0;
}//end constructor method

public int activeDays(){
return active;
}//end activeDays method

public void addDailySteps(int steps){
this.steps += steps;
if(steps > minimum){
  active++;
  }//end if statement
}//end addDailySteps

public int averageSteps(){
return ((double)(this.steps) / days);
}//end averageSteps

}//end StepTracker class