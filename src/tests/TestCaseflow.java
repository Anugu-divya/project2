package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pageElements.Addtocart;
import pageElements.Addtocartitem;
import pageElements.Brandproducts;
import pageElements.Contactinfo;
import pageElements.Invaliddetails;
import pageElements.LoginPage;
import pageElements.Logout;
import pageElements.Placeoder;
import pageElements.Placeoderbeforecheckout;
import pageElements.Placeorderwhile;
import pageElements.Productquantity;
import pageElements.Productscategory;
import pageElements.Registerwithexstingmail;
import pageElements.Removeproductfromcart;
import pageElements.Reviewofproduct;
import pageElements.Scrolingbyarrow;
import pageElements.Scrollingfunctionality;
import pageElements.Searchproduct;
import pageElements.Signinpage;
import pageElements.SubScrpitionclass;
import pageElements.Testcasepage;
import pageElements.Verfiyproductpage;
import utilities.Basetest;
import utilities.ExcelUtility1;

public class TestCaseflow extends Basetest{
	

	public  Signinpage Sp;
public 	LoginPage lp;
public Invaliddetails Id ;
public Logout lo;
public Registerwithexstingmail re;
public Contactinfo cu;
public Testcasepage tp;
public Verfiyproductpage vp;
public Searchproduct sp;
public SubScrpitionclass sc;

public Addtocart ac;
public Productquantity pq;
public  Placeorderwhile pw;
public  Placeoderbeforecheckout pc;
public Placeoder po;

public  Reviewofproduct rp;
public  Productscategory ps;
public   Brandproducts bp;
public  Addtocartitem acs;
public  Removeproductfromcart rc;
public Scrolingbyarrow sl;
public Scrollingfunctionality sf;





	@Test
	public void Signinmethod() throws Throwable {
			Thread.sleep(3000);
			Sp = LaunchApplication();
			ExcelUtility1 xs = new ExcelUtility1();
			String name= xs.Get_name(1, 0).toString();
			String mail = xs.Get_mail(1, 1).toString();
			String pass= xs.Get_pass(1, 2).toString();
			Sp.entersignindetails(name, mail , pass);
			// login
	}
	@Test(priority = 0)
		public void login () throws IOException {
			
		
		ExcelUtility1 xs =  new ExcelUtility1() ;
		String email= xs.Get_email(1, 0).toString();
		String password = xs.Get_password(1, 1).toString();
		lp.enterdetails(email , password);
	}	
		@Test(priority = 1)
		public void  incorrect () {
			Invaliddetails Id = new Invaliddetails (driver);
			Id.validation();
		}
		
		@Test(priority = 2 )
		public void log () {
			Logout lo = new Logout (driver);
			lo.login();
	}
		@Test(priority = 3 )
		public void register() {
		Registerwithexstingmail re = new Registerwithexstingmail (driver);
		re.register();
		}
		@Test(priority = 4 )
		public void contact() {
		Contactinfo cu = new Contactinfo (driver);
		cu.contactinformation();
}
@Test(priority = 5 )
public void  test() {
	Testcasepage tp=  new Testcasepage (driver);
	tp.testcases();
	
}
@Test(priority = 6 )
public void  product() {
	Verfiyproductpage vp = new Verfiyproductpage (driver);
	vp.productpage();
}

@Test(priority = 7 )
public void search () {
	Searchproduct sp = new Searchproduct (driver);
	sp.product ();
}
@Test(priority = 8 )
public void subscribe  () {
	SubScrpitionclass sc = new SubScrpitionclass (driver);
	sc.subscriber();
}
@Test(priority = 9 )
public void cart  () {
	 Addtocart ac= new  Addtocart (driver);
	 ac.items();
}
@Test(priority = 10 )
public void qunatity  () {
	Productquantity pq = new Productquantity (driver);
	pq.product();
}
@Test(priority = 11 )
public void orderplace   () {
	 Placeorderwhile pw	= new   Placeorderwhile(driver);
	 pw.placinoder();
}
@Test(priority = 12 )
public void Brand  () {
	 Brandproducts bp =new  Brandproducts (driver);
	 bp.brandproduct();
	
}
@Test(priority = 13 )
public void orderplaced () {
	 Placeoderbeforecheckout pc	= new Placeoderbeforecheckout(driver);
	 pc.checkout();
}
@Test(priority = 14 )
public void orderplace3  () {
	Placeoder po = new Placeoder (driver);
	po.placeorder();
}
@Test(priority = 15)
public void review  () {
	Reviewofproduct rp = new Reviewofproduct (driver);
	rp.reviewproduct();
}
@Test(priority = 16 )
public void   items () {
	Addtocartitem acs = new Addtocartitem (driver);
	acs.addtocart();
}

@Test(priority = 17 )
public void  productremove  () {
	 Removeproductfromcart rc = new  Removeproductfromcart (driver);
	 rc.removeproduct();
}
@Test(priority = 18 )
public void actions () {
	 Scrolingbyarrow sl = new  Scrolingbyarrow (driver) ;
	 sl.scroll();
}
@Test(priority = 19 )
public void action  () {
	 Scrollingfunctionality sf = new  Scrollingfunctionality (driver)	;
	 sf.scrollfunction();
}
}