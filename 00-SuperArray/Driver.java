public class Driver{
  public static void main(String[] args) {
    SuperArray superarray1 = new SuperArray();

    superarray1.fillArray();
    System.out.println(superarray1);

    superarray1.grow(1);
    System.out.println(superarray1);

    superarray1.add(6,85);
    System.out.println(superarray1);

    superarray1.remove(2);
    System.out.println(superarray1);

    superarray1.remove(0);
    System.out.println(superarray1);

    superarray1.remove(6);
    System.out.println(superarray1);

    superarray1.isEmpty();



    //superarray1.add(46);
    //System.out.println("After using the add method: " + superarray1);

    //superarray1.add(100);
    //System.out.println("After using the add method: " + superarray1);
  }//end main class
}//end class
