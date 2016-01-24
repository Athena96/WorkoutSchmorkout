
public class Console_Controller_Output {
	
	
	
	// MARK: Constants
	private static final String WELCOME_MSG = "\nWelcome to the Workout Logger!  Select an option below:\n";
	public static final String[] OPTIONS = {
		"add a workout",
		"remove a workout",
		"display all workouts",
		"display all workouts with buddy",
		"display workouts for a certain location",
		"PB: display personal best time for a certain location",
		"quit"
	};

	
	
	// MARK: Output methods
	
	// Present user with options
	public static void displayOptions() {
		// Welcome user with message.
		TextIO.putln(WELCOME_MSG);

		// List all of the options on the array of options
		for (int i = 0; i < OPTIONS.length; i++)
			TextIO.putln((i + 1) + ") " + OPTIONS[i]);
		
		// Ask for input
		TextIO.putln("\nSelect an option above:");
	}
	
	// Display any general message
	public static void display(String message) {
		TextIO.putln( message );
	}
	
	// How this if you find the list of work-outs to be empty
	public static void emptyListAlert() {
		display("You haven't added any workouts.");
	}
	
} // end class
