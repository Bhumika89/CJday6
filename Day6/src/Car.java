import java.io.Serializable;

public class Car implements Serializable  
{
	private String registrationNo;
	private String carMake;
	private String engine;
	public Car(String registrationNo, String carMake, String engine) {
		super();
		this.registrationNo = registrationNo;
		this.carMake = carMake;
		this.engine = engine;
	}
	/*public String getRegistrationNo() {
		return registrationNo;
	}*/
	public String getCarMake() {
		return carMake;
	}
	public String getEngine() {
		return engine;
	}
	@Override
	public String toString() {
		return "Car [registrationNo=" + registrationNo + ", carMake=" + carMake + ", engine=" + engine + "]";
	}
	
	

}
