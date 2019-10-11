package pack2;

import org.testng.Assert;
import org.testng.annotations.Test;

import pack1.basepagae;
import pack1.homepagae;

public class hometest {
	homepagae hp;
	basepagae bp;

	public hometest() {
		hp=new homepagae();
		bp=new basepagae();
		
	}
	@Test
	public void verifyWomen() {
		Assert.assertTrue(bp.elementFound(hp.Women()));
	}
	@Test
	public void verifyDresses() {
		Assert.assertTrue(bp.elementFound(hp.Dresses()));
	}
	@Test
	public void verifyTshirts() {
		Assert.assertTrue(bp.elementFound(hp.Tshirts()));
	}

	
	

}
