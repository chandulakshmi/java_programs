package java_assignment;

public class Problem {
	public static void main(String[] args) {
String product[]= {"Leather Wallet","Umbrella","Cigrette","Honey"};
String productgsthigh=product[2];
int unitprice[]= {1100,900,200,100};
//gst values
int  per[]= {18,12,28,0};
//quantity values
int  quantityofproduct[]= {1,4,3,2};
int quantityofproductsadded = 0;
int total_amount = 0;
int total_amount_discount = 0;
double  discount;//5% discount for products whose unit price is 500 or more
int final_amount = 0;
int gst_amount = 0;

	
		// TODO Auto-generated method stub
		for(int i=0;i<product.length;i++)
			
		{
			if(product[i]==productgsthigh)
			{
				productgsthigh=product[i];
				//adding the quantity of products
				quantityofproductsadded=quantityofproduct[2];
				//calcuating the total_amount(adding the unit  price of product+adding the quantity of products)
				total_amount=unitprice[2]*quantityofproductsadded;
				//calcuating the total amount with discount(substracting the total amount of product with 5% of 600(200*3)
				total_amount_discount=total_amount-10;//10 is the discount of total_amount
				//calcuating the gst amount of product(28% of 200(56) for 3 products(168)
				gst_amount=56*quantityofproductsadded;
				//calculating the final amount with gst and discount of product
				final_amount=total_amount_discount+gst_amount;
				
				

		
		}
		}
			System.out.println("the product for which we paid maximum gst _amount is:"+productgsthigh);
			System.out.println("the quantity of products added is:"+quantityofproductsadded);
			System.out.println("the total amount paid for product with out gst and discount is:"+total_amount);
			System.out.println("the total amount paid for product with discount with out gst is:"+total_amount_discount);
			System.out.println("the gst amount of product is :"+gst_amount);
			System.out.println("the total amount paid for product with gst and discount  is:"+final_amount);
					
			

	

}
}
