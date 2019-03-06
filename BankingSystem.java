/* *************************************************/
/* Banking System               */
/* Written by: .....................Li Zhang       */
/* Course :.........................BN104          */
/* Language :.......................English        */
/* Date Started :...................19/11/2015     */
/* Last Update :......................19/11/2015   */
/* Program Description :..Assignment 1             */
/* ....................		          …*/
/* ...................................            …*/
/***************************************************/


import java.util.Scanner;

public class BankingSystem
{
	static double balance=0;
        public static void main( String[] args )
	   {
	    Scanner input = new Scanner( System.in );


	    String name;
        String pass;


	    System.out.print( "Please enter your name: " );
	    name = input.next();

        do {
			System.out.print( "Please enter your password: " );
	        pass = input.next();
		}
		while(!pass.equals("FOP1"));{
			System.out.print("Name:");
     		String name2 = input.next();
			System.out.println("AccountNumber:");
 			String account = input.next();

		}

        showOptionMenu();
        System.out.println("Bye");
	}

       public static void showOptionMenu()
       {
		   Scanner input = new Scanner( System.in );
            int response;

		     while(true)  {
				System.out.println();
				System.out.println("[1] Check Balance");
				System.out.println("[2] Deposit");
				System.out.println("[3] Withdraw");
				System.out.println("[4] Exit");
				System.out.println("Enter choice [1,2,3,4]:");
				response = input.nextInt();

		   switch(response)
		   		  {
		   			  case 1: printBalance();
		   			  break;
		   			  case 2: doubleLodgement();
		   			  break;
		   			  case 3: withDraw();
		   			  break;
		   			  case 4: return;

        			}
				}
			}






    public static void printBalance()
          {
		   System.out.println("Your balance is: " + balance +" Euro.");
          }







    public static void doubleLodgement()
    {
		Scanner input= new Scanner(System.in);
		double moneyLodge;

		System.out.println("Please lodge money:");
		moneyLodge=input.nextDouble();

//		while(balance<200&&moneyLodge!=0){
			if(moneyLodge<=20 || moneyLodge>=0){
				balance+=moneyLodge;
				System.out.println("Your balance is:"+balance+"$");
				return;
		}
			if(moneyLodge + balance >= 200 || moneyLodge >20 || moneyLodge < 0){
				System.out.println("Please Re enter");
				moneyLodge=input.nextDouble();
			}

//		if(balance>=200){
//			System.out.println("Input too high.");
//			balance=200;
//		}
	}




     public static void withDraw()

 {
		Scanner input= new Scanner(System.in);
		double withdraw;

		System.out.println("Please withdraw money:");
		withdraw=input.nextDouble();

//		while(balance<200&&moneyLodge!=0){
			if(withdraw<=20 || withdraw>=0 || withdraw + balance <= 200){
				balance-=withdraw;
				System.out.println("Your balance is:"+balance+"$");
				return;
		}
//			if(){
//				System.out.println("Please lodge");
//				moneyLodge=input.nextDouble();
//			}

//		if(balance>=200){
//			System.out.println("Input too high.");
//			balance=200;
//		}
	}



/*     {
	     Scanner input=new Scanner(System.in);
         double withDraw;

         System.out.println("Your balance is:" +balance);
         System.out.println("Please withdraw");
         withDraw=input.nextDouble();


         while(balance > 0 || withDraw != -1)
         {
		 System.out.println("");
		 if (balance >= withDraw)
     		 {
			 balance -=withDraw;
		     System.out.println("Your balance is " + balance + " Euro.");
		     System.out.println("Please withdraw: ");
             withDraw = input.nextDouble();

               }else if  (withDraw > balance )
                       {
                       System.out.println("Invalid input! ");
                       System.out.println("Please withdraw:");
                       withDraw = input.nextDouble();
                       return;
               }
          }
      }

      */
  }








