import java.util.Scanner;
class mehfil
{
	static Scanner sc = new Scanner(System.in);
	double chickenbiriyani(int a)
	{
	System.out.println("total number of Quantity is :"+a);
	return a*150;	
	}
	double muttonbiriyani(int b)
	{
	System.out.println("total number of Quantity is :"+b);
	return b*200;
	}
	double vegetablebiriyani(int c)
	{
	System.out.println("total number of quantity is :"+c);
	return c*130;
	}
}
class zomato extends mehfil
{ 	
	double bill =0;
	 void menu()
	{
	System.out.println("1.Chicken biriyani mrp= 150\n2.Mutton biriyani mrp = 200\n3.Vegetable biriyani mrp =130");
	}
	void order()
	{
	menu();
	System.out.println("Select the order");
	int d = sc.nextInt();
	if(d>=1&&d<=3)
	{
	if(d==1)
	{
	System.out.println("Enter the Quantity");
	bill = bill+chickenbiriyani(sc.nextInt());
	//billing(bill);
	}
	else if(d==2)
	{
	System.out.println("Enter the Quantity");
	bill = bill+muttonbiriyani(sc.nextInt());
	//billing(bill);
	}
	else 
	{
	System.out.print("Enter the Quantity");
	bill = bill+vegetablebiriyani(sc.nextInt());
	//billing(bill);
	}
	System.out.println("Do you want to repeat the order sir 1.yes 2.nos");
	int e = sc.nextInt();
	if(e==1)
	{
	order();
	}
	else
	{
	billing(bill);
	System.out.print("Your order will be delivered with in five minutes");
	}
	}
	}
	void billing(double bill)
	{
	if(bill>1000)
	{
	System.out.println("You have recieved a discout of 20%");
	double discount=(bill*20)/100;
	bill = bill-discount;
	}
	System.out.println("your  bill is"+bill);
	System.out.println("your delivery Charges are 30 Rupees");
	int x=30;
	double gst=(bill*0.15);
	System.out.println("your gst is"+gst);
	double total=gst+bill+x;
	System.out.println("your total payable amount is ="+total);
	System.out.println("Select the payment method 1.online transaction 2.cash on delivery");
	int f = sc.nextInt();
	if(f==1)
	{
	System.out.println("phone pe or paytm or g pay send money to 7330633060");
	}
	else
	{
	System.out.print("give money to our agent");
	}
	}
}
class swiggy extends mehfil
{
	double bill =0;
	 void menu()
	{
	System.out.println("1. Chicken biriyani mrp= 150\n2.Mutton biriyani mrp = 200\n3.Vegetable biriyani mrp =130");
	}
	void order()
	{
	menu();
	System.out.println("Select the order");
	int d = sc.nextInt();
	if(d>=1&&d<=3)
	{
	if(d==1)
	{
	System.out.println("Enter the Quantity");
	bill = bill+chickenbiriyani(sc.nextInt());
	//billing(bill);
	}
	else if(d==2)
	{
	System.out.println("Enter the Quantity");
	bill = bill+muttonbiriyani(sc.nextInt());
	//billing(bill);
	}
	else 
	{
	System.out.print("Enter the Quantity");
	bill = bill+vegetablebiriyani(sc.nextInt());
	//billing(bill);
	}
	System.out.println("Do you want to repeat the order sir 1.yes 2.no-");
	int e = sc.nextInt();
	if(e==1)
	{
	order();
	}
	else
	{
	billing(bill);
	System.out.print("Your order will be delivered with in five minutes");
	}
	}	
	} 
	void billing(double bill)
	{
	if(bill>1000)
	{
	System.out.println("You have recieved a discout of 20%");
	double discount=(bill*20)/100;
	bill = bill-discount;
	}
	System.out.println("your  bill is"+bill);
	System.out.println("your delivery Charges are 30 Rupees");
	int x =30;
	double gst=(bill*0.15);
	System.out.println("your gst is"+gst);
	double total=gst+bill+x;
	System.out.println("your total payable amount is ="+total);
	System.out.println("Select the payment method 1.online transaction 2.cash on delivery");
	int f = sc.nextInt();
	if(f==1)
	{
	System.out.println("phone pe or paytm or g pay send money to 7330633060");
	}
	else
	{
	System.out.print("give money to our agent");
	}
	}
}
class user 
{
	public static void main(String[]args)
	{
	 Scanner sc = new Scanner(System.in);
	System.out.print("do you want to order from 1.Zomato 2.Swiggy");
	zomato z = new zomato();
	swiggy s = new swiggy();
	int t= sc.nextInt();
	if(t==1)
	{
	z.order();	
	}
	else
	{
	s.order();	
	}
	}
}
	
	