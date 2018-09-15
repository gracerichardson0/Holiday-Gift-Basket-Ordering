public class StatusUpdate { 
   public static final int MAX_NUM_STATUS = 17;
   
   private String[] names;
   private String name;
   private String[] statusText;
   private String text;
   private int numStatus;
   
   public StatusUpdate(){
   
   }
   
   public StatusUpdate(String[] names, String[] statusText){
      this.names= new String[MAX_NUM_STATUS];
      this.statusText = new String[MAX_NUM_STATUS];
   }
   
   public int getNumStatus(){
      return this.numStatus;
   }
   
   public boolean setNumStatus(int numStatus) {
      if(numStatus > 0 && numStatus < MAX_NUM_STATUS){
         this.numStatus = numStatus;
         return true;
      }else{
         return false;
      }
   }
   
   
   public boolean setName(String name) {
      boolean valid = true;
      for (int i = 0; i < this.getNumStatus(); i++) {
         if(!name.equals("")){
            this.names[i] = name;
            valid=true;
          }
      }
      
      if(valid){
         return true;
      }else{
         return false;
      }      
    }
    
    public boolean setText(String text) {
      boolean valid = true;
      for (int i = 0; i < this.getNumStatus(); i++) {
         if(!text.equals("")){
            this.statusText[i] = text;
            valid=true;
          }
      }
      
      if(valid){
         return true;
      }else{
         return false;
      }      
    }
    
    public String toString(){
       String listNames = "";
         if (this.getNumStatus() > 0) {
         for (int i = 0; i < this.getNumStatus(); i++) {
            listNames += (i+1) + ") " + this.names[i] + "\n";
         }
      }
      else {
         listNames += "No Names Entered!";
      }
      
      String listStatus = "";
         if (this.getNumStatus() > 0) {
         for (int i = 0; i < this.getNumStatus(); i++) {
            listStatus += (i+1) + ") " + this.statusText[i] + "\n";
         }
      }
      else {
         listStatus += "No Status Text Entered!";
      }
      
      return "\nNumber of Names: "
      + this.getNumStatus()
      + "\nNames: " + listNames
      + "\nStatus Text: " + listStatus;
   }
   
  }
    
   