package myfirsttest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myfirsttestclass {

	public static void main(String[] arg) {
		/*String i;
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://google.com");
		i = driver1.getCurrentUrl();
		System.out.println("the site is " +i);
		driver1.close();*/
		
		String str1="Instance 4300043534 Open Product";
//		String Str2=str1.substring(9, (str1.indexOf("O")));
		 String Str3[]=str1.split(" ");
		 int LenStr3=Str3.length;
		 for (int i=0; i<LenStr3;i++){
		System.out.println(Str3[i]);
		
		 }
	}
	
	
	
	
	
}
