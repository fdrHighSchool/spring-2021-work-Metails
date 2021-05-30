public class Driver{
  public static void main(String[] args) {
    SuperArray superarray1 = new SuperArray();
    BackPack player1 = new BackPack();

    player1.giveRandomItems();
    System.out.println(player1);
    player1.insertItems(2,5);
    System.out.println(player1);
    player1.addItems(68);
    System.out.println(player1);
    player1.discardItems(3);
    System.out.println(player1);
    player1.takesItem(4, 20);
    System.out.println(player1);
    player1.takesItem(2,10);
    System.out.println(player1);

    //superarray1.add(46);
    //System.out.println("After using the add method: " + superarray1);

    //superarray1.add(100);
    //System.out.println("After using the add method: " + superarray1);
  }//end main class
}//end class
