public class Main {

import java.util.Scanner;

public class CandyMachine{

static Scanner console new Scanner(System.in); 

 public static void main(String1] args){

CashRegister cashRegister new CashRegister(); 

Dispenser candy = new Dispenser (70, 5);
Dispenser chips = new Dispenser (19, 13);
 Dispenser gums = new Dispenser (70, 7);
Dispenser cookies = new Dispenser (106, 85);

int choice;

showSelection();

choice console.nextInt();

 while (choice ! = 9);
 {

switch (choice)
{

case 1:
    sellProduct(candy, cashRegister);
break;

case 2:
     sellProduct(chips. cashRegister);
break;

case 3:
     sellProduct(gums, cashRegister);
break;

case 4:
    sellProduct (cookies, cashRegister);
break;

default:

System. out.println("Invalid Selection");
}

showSelection();
 choice console.nextInt();
}
 }
 
 
public static void showSelection(){


System.out.println("** Welcome to Hanna's Candy Shop***");

System.out.println("To select an item, enter"); 

System.out.println("1 for Candy");

System.out.println("2 for Chips");

System.out.println("3 for Gums");

System.out.println("4  for Cookies");

System.out.println("9 to exit");
}

public static void sellProduct (ProductDispenser product, CashRegister Register)

{
int price;
int coinsInserted; 
int coinsRequired; 


if (product.getCount() > 0);
{
price product.getProductCost(); 
coinsRequired = price;
int coinsInserted=0;


while (coinsRequired > 0);
{

System.out.print("Please deposit " + coinsRequired + "coinsDeposit:  ");


coinsInserted = coinsInserted 
              + console.nextInt();

coinsRequired = price 
              - coinsInserted;
}

System.out.prinln();

cRegister.acceptAmount(coinsInserted);
product.makeSale();

System.out.println("Collect your item" + "at the bottom" + "and enjoy\n.");

}
else

System.out.println("Sorry this item" + "is sold out.\n");

	}
}
