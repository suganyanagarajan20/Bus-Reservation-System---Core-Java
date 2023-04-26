package busReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class busDemo {
	
	enum bus_name
	{
		Global_travels,
		XYZ_travels,
		ABC_travels
	}
	
	public static String che = "Chennai";
	public static String tri = "Trichy";
	public static String blr = "Bangalore";
	
	
	public static void main(String args[])
	{
		int userOption = 0, capa=0;
		int busno, index=0;
		Date date1 = null;
		boolean output;
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
	    ArrayList<booking> bookings = new ArrayList<booking>();
	    
	    bus_name b_abc = bus_name.ABC_travels;
	    bus_name b_xyz = bus_name.XYZ_travels;
	    bus_name b_global = bus_name.Global_travels;
		
		buses.add(new Bus(1,true,2,b_global,che,tri));
		buses.add(new Bus(2,false,3,b_abc,che,blr));
		buses.add(new Bus(3, true, 4,b_xyz,tri,blr));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Bus Reservation System");
		System.out.println("==================================");
		
		while(userOption!=4)
		{
			System.out.println();
			System.out.println("Select your option from the menu");
			System.out.println();
			System.out.println("1.Bus Details");
			System.out.println("2.Booking");
			System.out.println("3.Cancellation");
			System.out.println("4.Exit");
			System.out.println();
			
			userOption = scan.nextInt();
			
			switch(userOption)
			{
			case 1:
				System.out.println("Bus details are as follows");
				System.out.println("---------------------------");
				System.out.println();
				for(Bus b:buses)
				{
					b.displaybusinfo();
				}
				break;
			case 2:	
				booking book = new booking();  
				if(book.isAvailable(bookings,buses))
				{
					bookings.add(book);
					System.out.println("Your booking is confirmed");
				}
				else
				{
					System.out.println("Sorry bus is full, try another bus or date");
				}
				break;
			case 3:
				booking delete_book = new booking();
				if(delete_book.isRecordAvailable(bookings))
				{
					index = delete_book.index_value(bookings);
				    bookings.remove(index);
					System.out.println("Your reservation is cancelled successfully");
				}
				else
				{
					System.out.println("Enter the record details correctly!!!");
				}
				break;
			case 4:
				System.out.println("Thanks for visiting us");
				break;
			default:
				System.out.println("You have entered a wrong selection, please select correctly");
				break;
			}
		}
	scan.close();	 
	}
}
	

