package sem01_cts;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Zoo zoo = new Zoo();
		Zookeper keeper = new Zookeper();
		keeper.setName("Marcel");
		zoo.setKeeper(keeper);
		Zebra zebra1 = new Zebra("Zebra1");
		Zebra zebra2 = new Zebra("Zebra2");
		zoo.add(zebra1);
		zoo.add(zebra2);
		zoo.feedAll();
		Girafa girafa1 = new Girafa("Girafa1");
		Girafa girafa2 = new Girafa("Girafa2");
		zoo.add(girafa1);
		zoo.add(girafa2);
		zoo.feedAll();
	}

} // zebrele vor fi hranite de 2 ori
