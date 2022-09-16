class CitizenOfIndia{

		public static void showTheResponsibility(int age ,char Gender ){
			System.out.println("Invoked showTheResponsibility ");
			int age = 16;
			char Gender='F';
			// AND operators
			// OR operators
			if(age>=10 && age<16){
				System.out.println("Responsibility go to School");
				return;
			}
			
			if(age == 16){
			System.out.println("Responsibility go to College");
				return;	
			}
			if(age > 21){
				System.out.println("Responsibility is to Voting");
				if(Gender='F'){
					
				}
				return;	
			}
			
				
			
			System.out.println("end of showTheResponsibility ");
		}




}