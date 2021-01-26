public class Driver{
  public static void main(String[] args) {
    SuperArray superarray1 = new SuperArray();

    superarray1.fillArray();
    System.out.println(superarray1);
    superarray1.grow(1);
    System.out.println(superarray1);
    superarray1.add(0,2);
    System.out.println(superarray1);


  }//end main class
}//end class
