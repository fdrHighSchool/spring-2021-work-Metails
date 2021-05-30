int xaxis = 50;
int yaxis = 50;


void setup(){
  
  size(640,640);
  
}//end setup method 

void draw(){
 //it's kinda like rotating it vertically in 3d...not really? ok :( wasn't able to pull it off
 background(250);
 rectMode(CENTER);
 rect(290,300, mouseX/2, mouseY/2);
 ellipseMode(CENTER);
 ellipse(mouseX,300,mouseX,mouseY);
  
 }
  
  
  
  

  
