import javax.swing.JOptionPane;

public class ProcessOrders { 
   public static void main(String[] args){
      Order[] anOrder = new Order[MAX_NUM_ORDERS];
      Order order;
      
      do{
         order = getOrder();
         addOrder(order);
		   anOrder[Order.getGetLastAssignedNumber() -1 ] = order;

      }while(JOptionPane.showConfirmDialog == JOptionPane.YES_OPTION);
      
      printOrders(anOrder);
      
   }
   
   public static void getOrder() {
      