import java.util.ArrayList;

public class Mainpoint{
public static void main(String[] args){

ArrayList<Point> listPoint= new ArrayList<Point>();

listPoint.add(new Point(0,0));
listPoint.add(new Point(2,4));
listPoint.add(new Point(-6,8));

System.out.println(listPoint.get(0).midpoint(listPoint.get(1)));
System.out.println(listPoint.get(0).distance(listPoint.get(2)));
System.out.println(listPoint.get(0).isCollinear(listPoint.get(1),listPoint.get(2)));

}//end main method
}//end class
