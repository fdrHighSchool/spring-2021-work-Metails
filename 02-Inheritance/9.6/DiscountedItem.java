class DiscountedItem extends Item {
      // add an instance variable for the discount
      private double discount;

      // Add constructors that call the super constructor
      public DiscountedItem(String items, double price, double offPirce){
        super(items, price);
        this.discount = offPirce;
      }//end constructor method

      // Add get/set methods for discount
      public double getDiscount() {
        return this.discount; // return discount here instead of 0
      }//end getDiscount method

      public void setDiscount(double discountOff){
        this.discount = discountOff;
      }//end setDiscount method

      // Add a toString() method that returns a call to the super toString
      // and then the discount in parentheses using the super.valueToString() method
      public String toString(){
       return (super.toString());
      }//end toString method

}//end class
  