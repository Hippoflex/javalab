public class Program{
	public static void main(String[] args){
		Cars audi = new Cars();
		//audi.displayInfo();
		CarsAttributes audi_colors = new CarsAttributes();
		audi_colors.mainColor="Red";
		audi_colors.otherColor="Black";
		audi.init("Audi",129000,791,audi_colors);
		audi.displayInfo();
	}
};

class CarsAttributes{

	String mainColor;
	String otherColor;
}

class Cars{

	String brand;
	int price;
	int weight;
	CarsAttributes descr;

	void displayInfo(){
		System.out.printf("Brand: %10s \tPrice: %d \t Weight: %d Main color: %s\t Other color: %s\n", brand, price, weight, descr.mainColor, descr.otherColor);
	}
	void init(String brand, int price, int weight, CarsAttributes descr)
	{
		this.brand=brand;
		this.price=price;
		this.weight=weight;
		this.descr=descr;
	}
}