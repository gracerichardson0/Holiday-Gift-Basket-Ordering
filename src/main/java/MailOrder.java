public class MailOrder extends Order { 

   private static int lastAssignedNumber = 0;
   
   private String instructions;
   private int idNumber;
   private Customer customer;

   
   public MailOrder() {
      super();
      this.customer = new Customer();
   }
   
   
   public MailOrder(String customerName, String phoneNumber, String instructions) {
      super(customerName, phoneNumber, instructions);
      this.customer = new Customer(customerName, phoneNumber);
      
   }
   
   public MailOrder(String customerName, String phoneNumber, String companyName, String instructions) {
      super(customerName, phoneNumber, companyName, instructions);
      this.customer = new Customer(customerName, phoneNumber, companyName);
      this.instructions=instructions;
   }
   

   public String toString(){
      return super.toString();
   }
}

