package Test;

public class Location {
	private String city;
	private double latitude;
	private double longitude;
	public Location(String city, double lati, double longi) {
		this.city  = city;
		this.latitude = lati;
		this.longitude = longi;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return latitude + " " +longitude;
	}
	
}
