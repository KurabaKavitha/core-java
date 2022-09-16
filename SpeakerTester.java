class SpeakerTester{
		
	public static void main(String speaker[]){

		System.out.println("main method started");
		Speaker.brand="Noise";
		Speaker.color="black";
		Speaker.price=3000;
//invoking
		Speaker.onoroff();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.onoroff();
		Speaker.increaseVolume();
		Speaker.onoroff();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.onoroff();
		System.out.println(Speaker.brand);
System.out.println(Speaker.color);
System.out.println(Speaker.price);
System.out.println("main method is ended");
}
}
