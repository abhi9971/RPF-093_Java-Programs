public class TemperatureConversion {

	public static void main(String[] args) {
		Utility u = new Utility();
		boolean in = true;
		System.out.println("Welcome to the Temperature Converter!");
		
		while(in == true) 
		{
				int storage = 0;
				boolean errorCheck = false;
				String Answer = " ";
				
				System.out.println("===============================");
				System.out.println("---Press 1 to convert F to C---");
				System.out.println("---Press 2 to convert C to F---");
				System.out.println("===============================");
				Answer = u.inputString();
				if(Answer.matches("[0-9]+") == false) 
				{
					System.out.println("Please type number!!");
					System.out.println("-------1 or 2-------");
				} 
				if(Answer.matches("[0-9]+") == true) 
				{
					int number = Integer.parseInt(Answer);
					if(number > 2) 
					{
						System.out.println("--- Input is too large ---");
						System.out.println("Please type either 1 or 2.");
					} 
					else 
					{
						storage = number;
						errorCheck = true;
					}
				}
				System.out.println("Enter the Temperature:");
				double Answer2 = u.inputDouble();
				u.temperatureConvertor(Answer2, in, storage, errorCheck);
		}
		System.out.println("Ok, Bye");
	}

}
