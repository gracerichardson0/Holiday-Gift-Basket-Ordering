public class PhoneOrder extends Order {
   public static final String[] CALL_BACK_VALUES = {"Morning", "Afternoon", "Evening"};
   
   private String callBackNumber;
   private String callBackValue;
   
   public PhoneOrder(){
      super();
   }
   
   public PhoneOrder(String customerName, String phoneNumber, String instructions){
      super(customerName, phoneNumber, instructions);
      
      
   }
   
   public PhoneOrder(String customerName, String phoneNumber, String companyName, String instructions){
      super(customerName, phoneNumber, companyName, instructions);
      
      
   }
      
   public String getCallBackNumber(){
      return this.callBackNumber;
   }
   
   public String getCallBackValue(){
      return this.callBackValue;
   }
   
   //Change for safe assign 
   public boolean setCallBackNumber(String callBackNumber){
     final int MIN_NUM_DIGITS=10;
     final int MAX_NUM_DIGITS=13;
     boolean valid = true;
     String temp = callBackNumber;
     
     
     temp= callBackNumber.replace("-", "");
     temp= callBackNumber.replace(")", "");
     temp= callBackNumber.replace("(", "");
     
     if(temp.length()== MAX_NUM_DIGITS || temp.length() == MIN_NUM_DIGITS){
      for(int i = 0; i<temp.length(); i++){
         if(!Character.isDigit(temp.charAt(i))){
            valid=false;
            break;
         }
      }
     }
       if(valid){
         this.callBackNumber=callBackNumber;
         return true;
      }else{
         return false;
      }
    }
    
    public boolean setCallBackValue(String callBackValue){
      boolean valid = true;
      
      for(int i = 0; i < CALL_BACK_VALUES.length; i++){
         if(callBackValue.equals(CALL_BACK_VALUES[i])){
            valid = true;
         }else{
            valid = false;
         }
      }
      if(valid){
         this.callBackValue=callBackValue;
         return true;
      }else{
         return false;
      }
    }
      
    public String toString(){
    
      return super.toString()
      + "\nCallBack Number: " + this.getCallBackNumber()
      + "\nBest Time to Call Back: " + this.getCallBackValue();
    
    }
    
   }

