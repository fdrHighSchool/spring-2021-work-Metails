public class Customer {
  
    private String name;
    private String address;

    public Customer(String n, String a)
    {
       this.name = n;
       this.address = a;
    }

    public String toString()
    {
       return "Name: " + name + "\nAddress: " + address;
    }
}//end class 

