public class Mouse extends Peripherals{
	private int sale;
	private String Connection;
	private String Technology;
	public Mouse(){
		super();
		Connection = "Wired" ;
		Technology = "Laser" ;
	}
	
	public Mouse(String Connection, String Technology, String modelName, String Manufacturer, int modelYear, int Price){
		super(modelName, Manufacturer, modelYear, Price);
		this.Connection = Connection;
		this.Technology = Technology ;
	}
	
	public String getConnection(){
		return Connection;
	}
	
	public void setConnection(String Connection){
		this.Connection = Connection;
	}
	public String getTechnology(){
		return Technology;
	}
	
	public void setTechnology(String Technology){
		this.Technology = Technology;
	}
	
	public String toString(){
		return("This is an " + getManufacturer() + " " + getmodelName() + " Mouse from " + getmodelYear() +", with " + Connection + " connection and " + Technology + " technology " + ". It's price is " + getPrice() + " Euros.");
	}
	
}

