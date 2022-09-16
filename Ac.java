class Ac{

		static String brand;
		static String color;
		static double price;
		static boolean isConnected;


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




