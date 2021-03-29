class Test {
  public static void main(String[] args) {
        Pet p = new Pet("Sammy","hamster");
        System.out.println(p.getType());
        p.speak();

        Dog d = new Dog("Fido");
        System.out.println(d.getType());
        d.speak();
        Cat c = new Cat("Fluffy");
        System.out.println(c.getType());
        c.speak();
        
    }//end main method
}//end class