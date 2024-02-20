package Core_Java_2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashmapExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice="yes";
		ArrayList<HashMap<String,String>> list= new ArrayList<HashMap<String,String>>();
		while(choice.equalsIgnoreCase("yes")) {
			HashMap<String,String> map=new HashMap<>(); 
			System.out.println("Please enter the name");
			String name=sc.next();
			map.put("name", name);
			System.out.println("Please enter the age");
			String age=sc.next();
			map.put("age", age);
			System.out.println("Please enter the address");
			String addres=sc.next();
			map.put("address", addres);
			System.out.println("Do you want to cont?");
			choice=sc.next();
			list.add(map);
		}
		
		String choice3="yes";
		while(choice3.equalsIgnoreCase("yes")) {
			System.out.println("Please enter 1.name 2.age 3.address 4.All");
			int choice2=sc.nextInt();
			if(choice2==1) {
				list.forEach(i->System.out.println(i.get("name")));
			}else if(choice2==2) {
				list.forEach(i-> System.out.println(i.get("age")));
			}else if(choice2==3) {
				list.forEach(i-> System.out.println(i.get("address")));
			}else if (choice2 == 4) {

	               list.forEach(i -> {

	                   System.out.println(i.get("name"));

	                   System.out.println(i.get("age"));

	                   System.out.println(i.get("address"));

	               });

		}
			 System.out.println("do you want to cont?");

	           choice3 = sc.next();
	}
		
	}

}
