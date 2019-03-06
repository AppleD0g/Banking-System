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

public class Banking
{

	//Account Detail
	String name;
	String number;
	double balance;
	static int totalAccount=0;
	static double totalBalance=0;

	BankAccount(String name)
	{
	totalAccount++;
	this.name=name;
	this.number=Integer.toString(totalAccount+1234);
	this.balance=0;
	}

	void deposit(double x)
	{
	System.out.println("Name: "+this.name);
	System.out.println("Save: "+x+" euro");
	this.balance+=x;
	totalBalance+=x;
	System.out.println("balance:  "+this.balance+" euro.");
	System.out.println();
	}
	//Withdraw
	void withdraw(double x)
	{
	System.out.println(this.name);
	if (this.balance<x)
	{
	System.out.println("Name: "+this.name);
	System.out.println("Not enough balance,please try again.");
	System.out.println();
	}
	else
	{
	System.out.println("Name: "+this.name);
	System.out.println("Withdraw: "+x+" euro.");
	this.balance-=x;
	totalBalance-=x;
	System.out.println("Balance: "+this.balance+" euro.");
	System.out.println();
	}
	}
	//Accounr Summary
	void printSummary()
	{
	System.out.println("Name: "+this.name);
	System.out.println("?Card Number: "+this.number);
	System.out.println("Balance: "+this.balance);
	System.out.println();
	}


	String getNumber()
	{
	return this.number;
	}
	}

	public class BankManagement
	{
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String cmd,number;
	BankAccount user[]=new BankAccount[10000];
	int count=-1;
	int userID;
	outHeadInformation();
	while (true)
	{
	cmd=br.readLine();
	if (cmd.equals("over")) //??????
	break;
	else if (cmd.equals("new")) //??????
	{
	System.out.println("???????");
	count++;
	user[count]=new BankAccount(br.readLine());
	user[count].printSummary();
	}
	else if (cmd.equals("deposit")) //??
	{
	userID=findID(br,user,count);
	if (userID==-1)
	{
	System.out.println("????");
	System.out.println();
	}
	else
	{
	System.out.println("???????");
	user[userID].deposit(Double.parseDouble(br.readLine()));
	}
	}
	else if (cmd.equals("withdraw")) //??
	{
	userID=findID(br,user,count);
	if (userID==-1)
	{
	System.out.println("????");
	System.out.println();
	}
	else
	{
	System.out.println("???????");
	user[userID].withdraw(Double.parseDouble(br.readLine()));
	}
	}
	else if (cmd.equals("detail"))
	{
	userID=findID(br,user,count);
	if (userID==-1)
	{
	System.out.println("????");
	System.out.println();
	}
	else
	user[userID].printSummary();
	}
	else if (cmd.equals("root"))
	BankAccount.printBankInformation();
	else
	{
	System.out.println("??????,?????");
	System.out.println();
	}
	System.out.println("**********************************************************");
	System.out.println();
	}
	System.exit(0);
	}
	static int findID(BufferedReader br,BankAccount user[],int count) throws IOException
	{
	System.out.println("?????");
	String number=br.readLine();
	int userID=-1;
	for (int i=0;i<=count;i++)
	if (number.equals(user[i].getNumber()))
	{
	userID=i;
	break;
	}
	return userID;
	}
	static void outHeadInformation()
	{
	System.out.println("**********************************************************");
	System.out.println();
	System.out.println("                  ??????????                     ");
	System.out.println("                  ??????????                     ");
	System.out.println();
	System.out.println("**********************************************************");
	System.out.println();
	}
}