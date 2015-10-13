package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.*;
import java.io.*;

public class Jen {
	
	public FirefoxDriver driver;
 

@Test
	
public class DownloadFile {

	  public void main(String[] args) throws IOException {
			 
			 String fileName = "file.txt"; //The file that will be saved on your computer
			 URL link = new URL("https://dl.dropboxusercontent.com/u/98396761/NewTxt.txt"); //The file that you want to download
			
	     //Code to download
			 InputStream in = new BufferedInputStream(link.openStream());
			 ByteArrayOutputStream out = new ByteArrayOutputStream();
			 byte[] buf = new byte[1024];
			 int n = 0;
			 while (-1!=(n=in.read(buf)))
			 {
			    out.write(buf, 0, n);
			 }
			 out.close();
			 in.close();
			 byte[] response = out.toByteArray();
	 
			 FileOutputStream fos = new FileOutputStream(fileName);
			 fos.write(response);
			 fos.close();
	     //End download code
			 
			 System.out.println("Finished");

		}

	}
	 

  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
			  
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  driver.get("http://pn.com.ua/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	 driver.quit();
  }
  
 

}
