import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {
    public static  void main(String[] args) {
    header number1= new header(1);


        System.out.println(number1.invoiceNum);
        int countineLoop=1;
      LocalDate date = LocalDate.now();
        System.out.println("Today date: "+date);



    Scanner customerName = new Scanner(System.in);
        System.out.print("entre customer name:");
        String name = customerName.nextLine ();

        System.out.println(name);


    Scanner itemName = new Scanner(System.in);

    while (countineLoop==1) {

        System.out.print("entre item name:");
        String name1 = itemName.nextLine();
        System.out.println(name1);

        System.out.print("entre item Price:");
        String price = itemName.nextLine();
        System.out.println(price);

        System.out.print("entre item count:");
        String count = itemName.nextLine();
        System.out.println(count);

        System.out.print("entre 1 to insert new item :");
        countineLoop = Integer.parseInt(itemName.nextLine());
    }
}
    }























