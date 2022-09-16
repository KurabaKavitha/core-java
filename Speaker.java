class Speaker{
		 
		static String brand;
		static String color;
		static double price;
		static boolean isConnected;
		static int minVolume;
		static int maxVolume=8;
		static int currentvolume;

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

			public static void increaseVolume(){
	System.out.println("inside increaseVolume()");
//false==true
		if(isConnected == true){
		if(currentvolume < maxVolume){
			currentvolume= currentvolume+1;
  System.out.println("The current Volume is:" +currentvolume);
}

	else{
		System.out.println("Max Volume reached..");
}
}
	else{
System.out.println("Gube...First speaker on madu..");
}
}

				public static void decreaseVolume(){
if(isConnected  ==true){
if(currentvolume>minVolume){
currentvolume=currentvolume-1;
System.out.println("The current Volume is "+currentvolume);
}

else{
System.out.println("The Volume is Minimum");
}
}
}
}