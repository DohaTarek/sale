public class header {
   int invoiceNum;
   private  String data ;
   private String customerName;

   public  header(int num){

      this.invoiceNum=num;
      this.data=data;
      this.customerName=customerName;
   }



   public String getData(){
      return data;
   };
   public void setId(String Data) {
      this.data = Data;
   }


   public String getName(){
      return customerName;
   };
   public void setName(String Name) {
      this.customerName= Name;
   }
   //method to get data from author object
   public String toString() {

      return "header[invoiceNum="+invoiceNum+",num="+invoiceNum+", data="+data+", customername="+customerName+"]";

   }











}
