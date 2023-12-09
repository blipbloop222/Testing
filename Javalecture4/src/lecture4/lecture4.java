package lecture4;

import java.util.Random;
import java.util.Scanner;

public class lecture4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method without return value
		String a = "os.version";
		String name = "user.dix";
		version();
		info("os.name");
		info(a);
		info(name);
}


	public static void version() {
		System.out.println(System.getProperty("java.version"));
	}
	

	public static void info(String name) {
		System.out.println(System.getProperty(name));
	}
}