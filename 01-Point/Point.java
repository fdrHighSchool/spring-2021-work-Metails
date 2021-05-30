import java.util.*;
  //Note: Pixel Sky's code helped me understand how to operate with these objects by a TONS
    public class Point {
    //instance variables
    private int x;
    private int y;

//------------------------------------------------------------------
//Constructor methods

    // constructs a new point at the origin, (0, 0)
    public Point() {
        this(0, 0); // calls Point(int, int) constructor
    }

    // constructs a new point with the given (x, y) location
    public Point(int x, int y) {
        setLocation(x, y);
    }

//----------------------------------------------------------------

    // sets this point's (x, y) location to the given values
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // returns the x-coordinate of this point
    public int getX() {
        return this.x;
    }

    // returns the y-coordinate of this point
    public int getY() {
        return this.y;
    }//end getY method

    public double distanceFromOrigin() {
       return Math.sqrt(this.x * this.x + this.y * this.y);
   }//end distanceFromOrigin method

   // shifts this point's location by the given amount
   public void translate(int dx, int dy) {
       setLocation(this.x + dx, this.y + dy);
   }//end translate method

   public double distance(Point point2){

     return Math.sqrt(Math.pow(point2.getX() - this.x, 2) + Math.pow(point2.getY() - this.y, 2));

   }//end distance methods

   public Point midpoint(Point point2){

     int midx = (this.x + point2.getX())/2;
     int midy = (this.y + point2.getY())/2;
     return new Point(midx,midy);

   }//end midpoint method

   public double slope(Point point2){

     return (point2.getY() - this.y) / (point2.getX() - this.x);

   }//end slope methods

   public boolean isCollinear(Point point2, Point point3){

    return (slope(point2) == slope(point3));

   }//end isCollinear method

   public String toString(){

     return ("(" + this.x + ", " + this.y + ")");

   }//end toString methods

 }//end class
