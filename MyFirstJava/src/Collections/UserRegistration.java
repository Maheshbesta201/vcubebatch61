package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> username=new ArrayList<>();
		
		while(true) {
			System.out.println("Enter Your Username!! or type exit to quit");
			String name=sc.next();
			if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting registration system...");
                break;
            }
			boolean status=false;
			for(String user:username) {
				if(user.equalsIgnoreCase(name)) {
					status=true;
					break;
				}
			}
			if(status){
				System.out.println("Username alraedy taken.Please Choose a Different one");
			}else {
				username.add(name);
				System.out.println("username Registered succesfully");
			}
		}
	sc.close();	
	}

}
