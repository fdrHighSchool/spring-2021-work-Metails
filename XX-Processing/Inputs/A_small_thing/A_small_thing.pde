//Kinda wanted to make a small simulation on a crafting system in a game that I played
int progress = 685;
int progressHQ = 230;
int totalDurability = 45;
int currentDurability = 45;
boolean inGame = true;
void setup(){
  
  size(1000,800);
  
}//end setup

void draw(){
  rectMode(CENTER);
  textSize(15);
  fill(89,102,112);
  rect(25,20,1100,100,10);
  noFill();
  rect(20,10,700,25);
  rect(20,50,700,25);
 //----------------------------------------------------------------

  if(inGame){

  fill(134,249,135);
  rect(25,10,progress,15,7);//progress bar
  noFill();
  text(getPercent(progress) + "%", 385, 18);
  text("Completion", 450, 18);
  noFill();
  
  fill(102,187,252);
  rect(25,50,progressHQ,15,7);//progressHQ bar
  text(getPercent(progressHQ) + "%", 385, 55);
  text("High quality rate", 450, 55);
  noFill();
  
  fill(89,102,112);
  rect(5,85,250,30);
  noFill();
  fill(230,217,187);
  text(currentDurability + "/" + totalDurability, 5, 90);
  text(" Durability", 50, 90);
  noFill();
 
  if(progress == 685){
    
    if((int)(Math.random() * 100) + 1 >= progressHQ/685.0 * 100){
      text("You've successfully synthesised a normal quality of this item",280, 400);
      
    }else{
      text("You've successfully synthesised a High quality of this item",280, 400);
      
    }//end else statement
    inGame = false;
  }//end 1st if statement
 
  if(currentDurability == 0){
    
    text("You've failed to synthesised this item",300, 400);
    inGame = false;
    
  }//end if statement
  
  
  
  }//end check if in game statement
  
}//end draw method

String getPercent(int progress){
  
  float result = (progress/685.0 * 100);
  result = round(result);
  return String.valueOf(result);
  
}//end get percent method 
