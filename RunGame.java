import java.util.Scanner;
public class RunGame{

	private static final String USER_FILE = "users.txt";
	private static final String LOG_FILE = "game.log";

	public static void main(String[]args) throws Exception{
	//read the users file 

	/** these are just a variable to the options menu and the scanner */
	Scanner input = new Scanner(System.in);
	String option;
	/**menu*/
	do{
	System.out.println("Welcome to the dungeon");
	System.out.print("Choose an option:\n");
	System.out.print("\nregister\nlogin\nnew game\nexit\n\n> ");
	option = input.nextLine();
	//the switch for picking an option
	switch(option){
		case"register":
			System.out.print("please enter your first name\n>");
			String FN = input.nextLine();
			System.out.print("please enter your last name\n>");
			String LN = input.nextLine();
			System.out.print("please enter your username\n>");
			String username = input.nextLine();
			System.out.print("please enter a password for your account\n>" );
			String pass = input.nextLine();
			System.out.print("please enter you date of birth\n>");
			String dob = input.nextLine();
			System.out.print("please enter the state\n>");
			String state = input.nextLine();
			System.out.print("please enter the city\n>");
			String city = input.nextLine();
			System.out.print("please enter the zip code\n>");
			String ZIP = input.nextLine();
			//method to register user
			user newUser = new user(username,pass, FN, LN, dob, state);
			Utility.writeUserFile(USER_FILE, newUser);

			break;
		case"login":
			System.out.print("please enter your username:\n>");
			String userName = input.nextLine();
			System.out.print("please enter your password:\n>");
			String password = input.nextLine();

			User user = Utility.readUserFile(USER_FILE);
        	if (user == null || !user.getPassword().equals(password)) {
            System.out.println("Invalid username or password");
        	}
        	User currentUser = user;

			break;
		case"new game":
			System.out.println("creating new game...");
			break;
	}
	if(option.equals("exit")){
		System.exit(0);
	}
	}while(!(option.equals("login")||option.equals("new game")));
	
	

	/*
	 *Here the game should be implemented
	 * */

}


}
