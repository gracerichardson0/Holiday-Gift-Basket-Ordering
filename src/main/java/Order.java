public class Order {
   public static final int MAX_NUM_ORDERS = 216;
   
   private static int lastAssignedNumber = 0;
   
   private String instructions;
   private int idNumber;
   private Customer customer;
   
   public Order() {
      lastAssignedNumber++;
      idNumber = lastAssignedNumber;
      this.customer = new Customer();
   }
   
   public Order(String customerName, String phoneNumber, String instructions) {
      this();
      this.customer = new Customer(customerName, phoneNumber);
      this.instructions=instructions;
   }
   
   public Order(String customerName, String phoneNumber, String companyName, String instructions) {
      this();
      this.customer = new Customer(customerName, phoneNumber, companyName);
      this.instructions=instructions;
   }
   
   public String getInstructions() {
      return this.instructions;
   }
   
   public static int getLastAssignedNumber(){
      return lastAssignedNumber;
   }
   
   private int getIdNumber(){
      return this.idNumber;
   }
   
   public Customer getCustomer(){
      return this.customer;
   }
   
   public boolean setInstructions(String instructions){
      if (instructions.equals("")) {
         return false;
      }
      else {
         this.instructions = instructions;
         return true;
      }
   }
   
   public void setCustomer(){ this.customer = new Customer(); }
     
   public void setCustomer(String customerName, String phoneNumber)
   { 
      this.customer = new Customer(customerName, phoneNumber); 
   }

   public void setCustomer(String customerName, String phoneNumber, String companyName)
   { 
      this.customer = new Customer(customerName, phoneNumber, companyName); 
   }
   
   
   public String toString(){
      return "[" + getClass().getName() + "]\n"
           + "\n" + this.customer.toString()
           + "\nInstructions: " + this.getInstructions();
      }
  }
         

   