package groups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG_parameters {

	@Test(dataProvider="getdata")
	public void testformfill(String username,String password,int age){
		{
			System.out.println(username+" - "+password+" - "+age);
	}
		
	}
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data= new Object[2][3];
		
		data[0][0]="surajraje096@gmail.com";
		data[0][1]="abcd";
		data[0][2]=25;
		
		data[1][0]="096@gmail.com";
		data[1][1]="xyza";
		data[1][2]=26;
		return data;
		
		
	}
}
