package hackathonjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class müşteriinfo {
	public static void main (String[] args) {
		int limit=0;
		while (limit<=5) {
			System.out.println("you can create just 5 account  limit: " + limit);
			limit++;
		    List<String> customerinfo= new ArrayList<>();
		    List<String> addressinfo= new ArrayList<>();
		    List<String> allinfo= new ArrayList<>();
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Please enter your email");
	        String email = scanner.nextLine();


	        System.out.print("Please enter your password");
	        String password = scanner.nextLine();
	        
	        System.out.print("Please enter your addressname");
	        String addressname = scanner.nextLine();
	        
	        System.out.print("Please enter your address");
	        String address = scanner.nextLine();
	        
	    	System.out.print("Please enter your city");
	        String city = scanner.nextLine();
	        
	        System.out.print("Please enter your district");
	        String district = scanner.nextLine(); 
	    
	        customerinfo.add(email);
			customerinfo.add(password);
			customerinfo.add(address);
			System.out.print("your customerinfo is = ");
			System.out.println(customerinfo);
		    System.out.println("Your email is : " +" "+ customerinfo.get(0)  +" "+ "Your password is : "  + customerinfo.get(1)  +" "+ "Your address is : "  +" "+ customerinfo.get(2));
		
	        addressinfo.add(city);
	        addressinfo.add(district);
	        addressinfo.add(addressname);
	        System.out.print("your addressinfo is = ");
	        System.out.println(addressinfo);
	        System.out.println("Your addressname is : " +" "+ addressinfo.get(2) +" "+ "Your city is : " +" "+ addressinfo.get(0) +" "+ "Your district is : " + addressinfo.get(1));
			
	        allinfo.addAll(customerinfo);
	        allinfo.addAll(addressinfo);
	        System.out.print("your allinfo is = ");
	        System.out.println(allinfo);
	        
	        
	        
	       
	   
	        
	        
	        
	       
		}
	        
	}
	}


