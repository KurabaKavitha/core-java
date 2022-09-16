class TorchLightTester{
		
public static void main(String speaker[]){

		System.out.println("main method is started");
		TorchLight.brand="Pigeon";
		TorchLight.colour="Navyblue";
		TorchLight.price=500;
		//invoking
		TorchLight.onoroff();
		TorchLight.increaseLight();
		TorchLight.increaseLight();
		TorchLight.increaseLight();
		TorchLight.decreaseLight();
		TorchLight.onoroff();
		TorchLight.decreaseLight();
		TorchLight.decreaseLight();
		TorchLight.decreaseLight();
		TorchLight.onoroff();
		TorchLight.increaseLight();
		TorchLight.onoroff();
System.out.println(TorchLight.brand);
System.out.println(TorchLight.color);
System.out.println(TorchLight.price);
System.out.println("main method is ended");
	}
}