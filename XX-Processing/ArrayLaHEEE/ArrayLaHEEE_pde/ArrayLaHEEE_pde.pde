int[] box = {0,0,5}; //{x cord, y cord, x speed, y speed}

int directionsX = 1;
int directionY = 0;
int[] randBox = {(int)(Math.random() * 600),(int)(Math.random() * 600)};
void setup(){
  size(600,600);

}//end setup

void draw(){
background(250);
 fill((int)(Math.random() * 254) + 1,(int)(Math.random() * 254) + 1,(int)(Math.random() * 254) + 1);

 rect(box[0] += directionsX,box[1] += directionY,25,25);
 rect(randBox[0], randBox[1],25,25);
 
 if(dist(box[0],box[1],randBox[0],randBox[1]) < 10){
   randBox[0] = (int)(Math.random() * 600);
   randBox[1] = (int)(Math.random() * 600);
   
   
 }//end if
 
 if(box[0] < 0){ 
  
   box[0] = width;
   
 }else if(box[0] >= width){
   
   box[0] = 0;
   
 }//end else if
  
  if(box[1] < 0){

   box[1] = height;
    
  }else if(box[1] >= height - 25){
   
  box[1] = 0;
    
  }//end else if
  
}//end draw

void keyPressed(){
  
  if(key == 'w'){
    
   directionY = -1;
   directionsX = 0;
    
  }//end  if
  
  if(key == 's'){
    
   directionY = 1;
   directionsX = 0;
    
  }//end if
  
  if(key == 'a'){
    
   directionY = 0;
   directionsX = -1;
    
  }//end if
  
   if(key == 'd'){
    
   directionY = 0;
   directionsX = 1;
    
  }//end if
  
  
}//end keyPressed 
