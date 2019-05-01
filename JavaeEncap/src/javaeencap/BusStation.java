
package javaeencap;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lahiru
 */
public class BusStation {
    



	List<Bus> buses;

	{
		buses = new ArrayList<>();
	}

	public BusStation(String color, int nob) {
		for (int i = 0; i < nob; i++) {
			buses.add(new Bus(color));
		}
	}
	public BusStation() {
		
	}
	public void addBus(Bus bus) {
		buses.add(bus);
	}
	public void getBuses() {
		
		/*class BusValidator{
			public void validate(String color) {
				if("RED".equalsIgnoreCase(color)) {
					System.out.println("Valid color");
				}else {
					System.out.println("not a valid color");
				}
			}
		}*/
		new Object(){
			public void validate(String color) {
				if("RED".equalsIgnoreCase(color)) {
					System.out.println("Valid color");
				}else {
					System.out.println("not a valid color");
				}
			}
		}.validate("Green");
		
		
		for(Bus bus:buses) {
			System.out.println(bus.toString());
		}
		//new BusValidator().validate("Green");
	}

	class Bus {
		String color;

		public Bus(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return color + " bus ";
		}

	}

  
   
    
}
