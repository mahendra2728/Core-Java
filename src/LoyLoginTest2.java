class vehicle
{
	public void showMessage()
	{
		System.out.println("In vehicle");
	}
}

class Car extends vehicle
{
	public void showMessage()
	{
		System.out.println("In Car");
	}
}
class Bike extends vehicle
{
	public void showMessage()
	{
		System.out.println("In Car");
	}
}

public class LoyLoginTest2 {

	public static void main(String[] args) {
		
		vehicle v=new Car();
		Bike b=(Bike)v;
		
		v.showMessage();
		b.showMessage();
	}

}
