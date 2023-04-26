package busReservation;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;
	private String bus_name;
	private String to;
	private String from;
	
	public int getBusNo() {
		return busNo;
	}
	
	public void setBusNo(int bus_no) {
		this.busNo = bus_no;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getBus_name() {
		return bus_name;
	}

	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	Bus(int no, boolean ac, int cap, busReservation.busDemo.bus_name bus_name, String from, String to)
	{
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
		this.bus_name = bus_name.toString();
		this.from = from;
		this.to = to;
	}
	
	public void displaybusinfo()
	{
		System.out.println("Bus No:"+busNo+"|"+" AC:"+ac+"|"+" Capacity:"+capacity+"|"+" "
				+ " Bus Name:"+bus_name+"|"+" Source:"+from+"|"+" Destination:"+to);
		System.out.println();
	}

}
