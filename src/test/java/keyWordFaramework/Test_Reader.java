package keyWordFaramework;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Test_Reader {
	
Properties pro;

public Test_Reader() {
	pro = new Properties();
	String FilePath= "src/test/resources/Test.Properties";
	try {
		FileInputStream fis= new FileInputStream(FilePath);
		pro.load(fis);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
public String readBrowser() {
	return pro.getProperty("Browser");
}


public String readUrl() {
	return pro.getProperty("url");
}

public String readUserName() {
	return pro.getProperty("Username");
}

public String readPass() {
	return pro.getProperty("Password");
}
}
