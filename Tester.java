package demo.onlie.shopping.com;
import java.util.Scanner;
public class Tester 
{
	public static void main(String[] args) 
	{
		Product p1=null;
		p1=new Product();
		System.out.println(p1.showdetails());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Details :");
		System.out.println("Enter name of product :");
		String ProductName=sc.next();
		System.out.println("please enter Product Brand:");
		String ProductBrand=sc.next();
		System.out.println("please enter Product id:");
		int ProductId=sc.nextInt();
		System.out.println("please enter Product price:");
		double ProductPrice=sc.nextDouble();
		Product p2=new Product(ProductName,ProductBrand,ProductId,ProductPrice);
		System.out.println(p2.showdetails());
		sc.close();
	}

}
