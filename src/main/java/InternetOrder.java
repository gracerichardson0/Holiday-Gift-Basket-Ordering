public class InternetOrder extends Order {
   
   public static final int MIN_NUMERIC_CODE = 0;
   public static final int MAX_NUMERIC_CODE = 47;
   
   private StatusUpdate statusUpdate;
   private String password;
   private String emailAddress;
   private int numericCode;
   
   public InternetOrder(){
      super();
      this.statusUpdate = new StatusUpdate();
   }
   
   public InternetOrder(String customerName, String phoneNumber, String instructions){
      super(customerName, phoneNumber, instructions);
      
      
   }
   
   public InternetOrder(String customerName, String phoneNumber, String companyName, String instructions){
      super(customerName, phoneNumber, companyName, instructions);
      
      
   }
   
   public void setStatusUpdate(){ this.statusUpdate = new StatusUpdate(); }
     
   public void setStatusUpdate(String[] names, String[] statusText)
   { 
      this.statusUpdate = new StatusUpdate(names, statusText); 
   }
   
   public String getPassword(){
      return this.password;
   }
   
   public String getEmailAddress(){
      return this.emailAddress;
   }
   
   public int getNumericCode(){
      return this.numericCode;
   }
   
   public boolean setPassword(String password) {
      String temp = password;
      boolean valid = true;
      final int MAX_NUM_CHARS = 6;
      
      if(temp.length() > MAX_NUM_CHARS){
         valid = false;
      }
      
      for (int i = 0; i < temp.length(); i++) {
         if (!Character.isLetter(temp.charAt(i))) {
            valid = false;
            break;
         }
        
         
         if(Character.isUpperCase(temp.charAt(i))){
            valid = true;
            break;
         }else{
            valid = false;
         }
         
         if(Character.isLowerCase(temp.charAt(i))){
            valid = true;
            break;
         }else{
            valid = false;
         }
      }
      
      if (valid) {
         this.password = password;
         return true;
      }
      else {
         return false;
      }
   }
   
   //Change for safe assign
   public boolean setEmailAddress(String emailAddress) {
      final int MAX_NUM_LETTERS= 4;
      final int MIN_NUM_LETTERS= 2;
      int position = 0;
      int newPosition = 0;
      int period = 0;
      boolean valid = false;
      position = emailAddress.indexOf("@");
     
      /*Checks that the position is not the last character and that the position 
        is greater than zero before continuing with the rest of the validation
      */
      if(position>0 && position < emailAddress.length()-1){
          String emailAddressTwo= emailAddress.substring(position-1, position+1);
          
            newPosition = emailAddressTwo.indexOf("@");
            
          if(Character.isLetterOrDigit(emailAddressTwo.charAt(newPosition-1)) && 
             Character.isLetterOrDigit(emailAddress.charAt(newPosition+1))){
               valid = true;
               
               period = emailAddress.indexOf(".");
               
               String newPeriod = emailAddress.substring(period);
               
               if(newPeriod.length() >= MIN_NUM_LETTERS && newPeriod.length() <= MAX_NUM_LETTERS){
                  valid = true;
               }
              }
             }
               if(valid){
                  this.emailAddress=emailAddress;
                  return true;
               }else{
                  return false;
               }
        }   
   
   
   public boolean setNumericCode(int numericCode) {
      if(numericCode >= MIN_NUMERIC_CODE && numericCode <= MAX_NUMERIC_CODE){
         this.numericCode = numericCode;
         return true;
      }else{
         return false;
      }
   }
   
   
   public String toString(){
   
      return super.toString()
      + "\nPassword: " + this.getPassword()
      + "\nEmail: " + this.getEmailAddress()
      + "\nNumeric Code: " + this.getNumericCode();
   }
  }
   

   