package ComProg2;

import java.util.Scanner;


public class CandyMachine {

  public static void main(String[] args) {
     
     System.out.printlin("---Welcome to Hanna's Candy Shop---");
     
     ProductDispenser Candy = new ProductDispenser(1, 12);
     ProductDispenser Chips = new ProductDispenser(7, 14);
     ProductDispenser Gum = new ProductDispenser(0.75, 16);
     ProductDispenser Cookies = new ProductDispenser(8,10);
     
     // for selection of item
     CashRegister CR = new CashRegister();
     
     int select= 0;
     do{
       select = getInput("\n To select an item, enter \n" + "1 for Candy\n" + "2 for Chips\n" + "3 for Gum\n" + "4 for Cookies\n" + "9 for Exit \n");
       switch (select) {
         case 1:
              purchase(Candy, CR);
              break;
         case 2:
              purchase(Chips, CR);
              break;
         case 3:
              purchase(Gum, CR);
         case 4:
              purchase(Cookies, CR);
              break;
         case 9:
              break;
         default:
              System.out.println("Invalid Selection");
       }
     } while (select = 9);     
  }
  
  public static void purchase(ProductDispenser product, CashRegister cashreg) {
    Scanner input = new Scanner(System.in);
    if (product.getProdQty() > 0);
        double pmt = 0;
        
        do{
          System.out.println("Please insert " + (product.getProdCost() * 100 - pmt) + "pesos.");
 pmt = input.nextDouble();
        } while (pmt < product.getProdCost() * 100);
        product.setProdQty(1);
        cashreg.setCashOnHand(product.getProdCost());
        System.out.print("Collect your item at the bottom and enjoy.");
  }

}
