

//Latitude represents the horizontal (Y axis)
//longtitude represents the vertical (X axis)
String webImgUrl = "https://api.mapbox.com/styles/v1/mapbox/streets-v11/static/-73.9554,40.6368,11.19,0/600x600?access_token=pk.eyJ1IjoibWV0YWlscyIsImEiOiJja3BxdzgxNXowZ2o5Mm5wYW9iZGhtNTViIn0.tLD7IXyyheHHomZdvpb_XQ";
PImage webImg = loadImage(webImgUrl, "png");
float zoomLevel = 11.19;
float xAxis;
float yAxis;
ArrayList<String> latitudes = new ArrayList<String>();
ArrayList<String> longitudes = new ArrayList<String>();
JSONArray dataSet;

//Longtitude = -73.9554, Latitude = 40.6368
float centerLON = -73.9554;
float centerLAT = 40.6368;

//40.6105° N, 73.9477° W
float heLAT = 40.6105;
float heLON = -73.9477;

void setup(){
  size(600,650);
  image(webImg, 0, 0);
  dataSet = loadJSONArray("https://data.cityofnewyork.us/resource/pitm-atqc.json");
 
    
  for(int i = 0; i < dataSet.size(); i++){
    JSONObject restaurant = dataSet.getJSONObject(i);
    
   if(restaurant.getString("borough").equals("Brooklyn")){//if such restaurant is within brooklyn
    if(restaurant.getString("seating_interest_sidewalk").equals("both") && restaurant.getString("latitude") != null || restaurant.getString("longitude") != null){
      
      latitudes.add(restaurant.getString("latitude"));//add latitude to the arraylist
      longitudes.add(restaurant.getString("longitude"));//adding longitude to the arraylist
      
    }//end 2nd if 
   }//end 1st if 
  }//end for loop
}//end setup method


//According to my map box:
//(Longtitude)        (Latitude)
//-73.9554°(Y axis) N, 40.6368°(X axis) W  <--- Coordinates for Brooklyn

void draw(){

 translate(width/2, height/2);
 imageMode(CENTER);
 
xAxis = mercX(heLON) - mercX(centerLON);
yAxis = mercY(heLAT) - mercY(centerLAT);


for(int index = 0; index < longitudes.size(); index++){
  
  xAxis = mercX(Float.parseFloat(longitudes.get(index))) - mercX(centerLON);
  yAxis = mercY(Float.parseFloat(latitudes.get(index))) - mercY(centerLAT);
  
  fill(255, 0, 255, 200);
  ellipse(xAxis,yAxis,10,10);
  
}//end for loop

  
  fill(255, 0, 255, 200);
  ellipse(xAxis,yAxis,10,10);

//System.out.println(xAxis);
//System.out.println(yAxis);

}//end draw method 

float mercX(float longitude){
 longitude = radians(longitude);
 float a = (256 / PI) * pow(2, zoomLevel);
 float b = (longitude + PI);
 return a * b;
 
}//end merX function

float mercY(float latitude){
 latitude = radians(latitude);
 float a = (256 / PI) * pow(2, zoomLevel);
 float b = tan(PI / 4 + latitude/2);
 float c = PI - log(b);
 return a * c;
 
}//end merY function
