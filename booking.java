package busReservation;
	
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

	public class booking {
		String p_name;
		int busNo;
		Date date;
		
		booking()
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the passenger name");
			p_name = scan.next();
			System.out.println("Enter the bus number");
			busNo = scan.nextInt();
			System.out.println("Enter the date of  travel in the format dd-mm-yyyy");
			String date_input = scan.next();
			SimpleDateFormat date_format = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date = date_format.parse(date_input);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public boolean isAvailable(ArrayList<booking> bookings, ArrayList<Bus> buses)
		{
			int capacity = 0;
			for(Bus b:buses)
			{
				if(b.getBusNo() == busNo)
					capacity=b.getCapacity();
			}
			
			int booked=0;
			for(booking b1:bookings)
			{
				if(b1.busNo == busNo && b1.date.equals(date))
				{
					booked++;
				}
			}
			
			return booked<capacity?true:false;
		}
		public boolean isRecordAvailable(ArrayList<booking> bookings)
		{
			int available=0;
			for(booking b1:bookings)
			{
				if(b1.busNo == busNo && b1.p_name.equals(p_name) &&b1.date.equals(date))
				{
					available=1;
				}
			}
			return (available==1)?true:false;
		}
		
		public int index_value(ArrayList<booking> bookings)
		{
			int index=-1;
			for(booking b1:bookings)
			{
				if(b1.busNo == busNo && b1.p_name.equals(p_name) &&b1.date.equals(date))
				{
					index = bookings.indexOf(b1);
				}
			}
			return index;
		}

	}

