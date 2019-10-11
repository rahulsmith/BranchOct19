package pack2;

import org.testng.Assert;
import org.testng.annotations.Test;

import pack1.basepagae;

import pack1.productpage;

public class poducttest {
	productpage pg;
	basepagae hp;
	
	public poducttest() {
		pg=new productpage();
		hp=new basepagae();
		
	}
@Test
public void verifyprodcount() {
	
	Assert.assertTrue(pg.getproductNumberFromHeader()==pg.getProductCount(),"Failed:Count");
	
}
}
