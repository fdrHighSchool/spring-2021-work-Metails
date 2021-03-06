//Kinda wanted to make a small simulation on a crafting system in a game that I played
//Was gonna add abilities and stuff but I wasn't able to even get the progress bar to increase smoothly so I gave up 
int progress = 0;
int progressHQ = 0;
int totalDurability = 45;
int currentDurability = 45;
int cost = 10;
int abilityDuration = 0;
boolean ability3 = false;
boolean inGame = true;
void setup(){
  
  size(1000,800);
  
}//end setup

void draw(){
  //setting up the displaying box
  rectMode(CENTER);
  textSize(15);
  fill(89,102,112);
  rect(25,20,1100,100,10);
  noFill();
  rect(20,10,700,25);
  rect(20,50,700,25);
  
//----------------------------------------------------------------
//Ability display boxes
 rect(100,700,125,150,7);//Box 1
 rect(230,700,125,150,7);//Box 2
 rect(360,700,125,150,7);//Box 3   
 rect(490,700,125,150,7);//Box 4   
 rect(620,700,125,150,7);//Box 5
 rect(750,700,125,150,7);//Box 6
 rect(880,700,125,150,7);//Box 7
 //----------------------------------------------------------------
 //----------------------------------------------------------------

 
 //----------------------------------------------------------------
 //Progress display boxes
  fill(134,249,135);
  rect(0,10,progress,15,7);//progress bar
  noFill();
  text(getPercent(progress) + "%", 385, 18);
  text("Completion", 450, 18);
  noFill();
  
  fill(102,187,252);
  rect(0,50,progressHQ,15,7);//progressHQ bar
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
 //----------------------------------------------------------------
 
 
}//end draw method

String getPercent(int progress){
  
  float result = (progress/730.0 * 100);
  result = round(result);
  return String.valueOf(result);
  
}//end get percent method 

void keyPressed(){
  
  if(inGame){
  //Abilities
 if( key == '1'){
   
   progress += 150;
   
   if(ability3){

   currentDurability -= 5;
   abilityDuration += 1;
   
     if(abilityDuration > 3){
       ability3 = false; 
     }//end if
   }else{
     
     currentDurability -= cost;
     
   }//end else
   
 }//end abilites 1
 
  if(key == '2'){
   
   progressHQ += 50;
   currentDurability -= cost;
   
 }//end abilites 2
 
 if(keyPressed && key == '3'){
   
  ability3 = true;
  abilityDuration = 1;
   
 }//end abilites 3
//------------------------------------------------------------------------------------------


  if(progressHQ >= 730){
    
    progressHQ =730;
    
  }//end if 
 
  if(progress >= 730){
    
    progress = 730;
    currentDurability = 0;
    
    if((int)(Math.random() * 100) + 1 >= progressHQ/730.0 * 100){
      text("You've successfully synthesised a normal quality of this item",280, 400);
      
    }else{
      text("You've successfully synthesized a High quality of this item",280, 400);
      
    }//end else statement
    inGame = false;
  }else{
 
  if(currentDurability <= 0){
    currentDurability = 0;
    text("You've failed to synthesis this item",300, 400);
    inGame = false;
    }//end else
  }//end if statement
   

 }//end in game
  
}
