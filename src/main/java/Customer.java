public class Customer {
   private String customerName;
   private String phoneNumber;
   private String companyName;
   
   
   public Customer(){
   
   }
   
   public Customer(String customerName , String phoneNumber){
      this.customerName = customerName;
      this.phoneNumber = phoneNumber;
   }
   
   public Customer(String customerName, String phoneNumber, String companyName){
      this.customerName = customerName;
      this.phoneNumber = phoneNumber;
      this.companyName= companyName;
   }
   
   public String getCustomerName() { return this.customerName; }
   public String getPhoneNumber() { return this.phoneNumber; }
   public String getCompanyName() { return this.companyName; }
   
   public boolean setCustomerName(String customerName) {
      if (customerName.equals("")) {
         return false;
      }
      else {
         this.customerName = customerName;
         return true;
      }
   }
   
   //Change this to avoid safeassign
   public boolean setPhoneNumber(String phoneNumber) {
     final int MIN_NUM_DIGITS=10;
     final int MAX_NUM_DIGITS=13;
     boolean valid = true;
     String temp = phoneNumber;
     
     
     temp= phoneNumber.replace("-", "");
     temp= phoneNumber.replace(")", "");
     temp= phoneNumber.replace("(", "");
     
     if(temp.length()== MAX_NUM_DIGITS || temp.length() == MIN_NUM_DIGITS){
      for(int i = 0; i<temp.length(); i++){
         if(!Character.isDigit(temp.charAt(i))){
            valid=false;
            break;
         }
      }
     }
       if(valid){
         this.phoneNumber=temp;
         return true;
      }else{
         return false;
      }
    }
   
    public boolean setCompanyName(String companyName) {
      if (companyName.equals("")) {
         return false;
      }
      else {
         this.companyName = companyName;
         return true;
      }
   }
   
   
   
   public String toString() {
      return "[" + getClass().getName() + "]\n"
         + "\nCustomer Name: " + this.getCustomerName()
         + "\nPhone Number: " + this.getPhoneNumber()
         + "\nCompany Name: " + this.getCompanyName();  
      }
   }
   
   