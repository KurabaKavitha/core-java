class TorchLight{

		static String brand;
		static String colour;
		static double price;
		static boolean isConnected;
		static int minLight;
		static int maxLight=8;
		static int currentLight;

public static boolean onoroff(){
	System.out.println("inside onoroff()");
		//false==false
				if(isConnected == false){
						isConnected=true;
				System.out.println("Speaker is turned onn...");
}
		//true==true
			else	if(isConnected == true){
					isConnected=false;
			System.out.println("Speaker is turned off....");

}

	System.out.println("end of onoroff()");
			return isConnected;
}
		}



public static void increaseLight(){
	System.out.println("inside increaseLight()");
//false==true
		if(isConnected == true){
		if(currentLight < maxLight){
			currentLight= currentLight+1;
  System.out.println("The current Light is:" +currentLight);
}

	else{
		System.out.println("Max Volume reached..");
}
}
	else{
System.out.println("please switch on the light");
}
}

				public static void decreaseLight(){
if(isConnected  ==true){
if(currentLight>minLight){
currentLight=currentlight-1;
System.out.println("The current Light is "+currentLight);
}

else{
System.out.println("The Light is Minimum");
}
}
}
}