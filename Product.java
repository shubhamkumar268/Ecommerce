package demo.onlie.shopping.com;
public class Product
{
		private String ProductName;
		private String ProductBrand;
		private int ProductId;
		private double ProductPrice;
		public String getProductName() 
		{
			return ProductName;
		}
		public void setProductName(String productName)
		{
			this.ProductName = productName;
		}
		public String getProductBrand() 
		{
			return ProductBrand;
		}
		public void setProductBrand(String productBrand) 
		{
			this.ProductBrand = productBrand;
		}
		public int getProductId() 
		{
			return ProductId;
		}
		public void setProductId(int productId)
		{
			this.ProductId = productId;
		}
		public double getProductPrice()
		{
			return ProductPrice;
		}
		public void setProductPrice(double productPrice)
		{
			this.ProductPrice = productPrice;
		}
		public String showdetails()
		{
			return " Product :["+ProductName+ ","+ProductBrand+","+ProductId+","+ProductPrice+"]";
		}
		Product()
		{
			ProductName="Shoes";
			ProductBrand="Woodland";
			ProductId=123;
			ProductPrice=2000.00;
		}
		Product(String ProductName,String ProductBrand,int ProductId,double ProductPrice)
		{
			System.out.println("Parametrized constructor ");
			this.ProductName=ProductName;
			this.ProductBrand=ProductBrand;
			this.ProductId=ProductId;
			this.ProductPrice=ProductPrice;

			
		}
	
}
