import java.util.Date;
import java.io.Console;

public class Console_Controller_Input {
	
	
	
	/*
	 * 	Creates work-out to add
	 */
	public static Workout getWorkoutToAdd() {
		// Get work-out info from user
		String location       	= Console_Controller_Input.getLocation();			// get LOCATION
		String workoutBuddy 	= Console_Controller_Input.getWorkoutBuddy();		// get WORKOUT BUDDY
		Date startTime 			= Console_Controller_Input.getStartTime();			// get START-TIME
		long duration 			= Console_Controller_Input.getDuration(startTime);	// get DURATION
		double milesCovered		= Console_Controller_Input.getMilesCovered();		// get MILES COVERED
		int rating				= Console_Controller_Input.getRating();				// get RATING
		
		// Create the new work-out
		Workout workoutToAdd = new Workout(location, workoutBuddy, startTime, duration, milesCovered, rating);
		
		return workoutToAdd;
	}
	
	
	
	// MARK: Helper input methods to create Work-out
	
	public static String getLocation() {
		
		// Ask for location (tell user it is required)
		TextIO.putln("Please enter the location of your workout (this is required): ");
		
		// Read the location
		String location = TextIO.getln();
		
		// True if location is valid
		boolean validLocation = ( location != null ) && ( location.length() > 0 );
						
		// While the input is invalid keep asking
		while ( !validLocation ) {
			TextIO.putln("Invalid location. Location is required.");
			location = TextIO.getln();
			validLocation = ( location != null ) && ( location.length() > 0 );
		}
		
		return location;
	}
	
	
	public static String getWorkoutBuddy() {
		// ask for friend (tell user it is optional)
		TextIO.putln("Are you working out with a friend? If so, please enter your friends name. (this is optional): ");
		
		// Get name
		String workoutBuddy = TextIO.getln();
		
		// If the user didn't enter anything then set work-out buddy to null
		return workoutBuddy = (workoutBuddy == null || workoutBuddy.length() <= 0) ? "" : workoutBuddy;
	}
	
	
	public static Date getStartTime() {
		// Start work-out
		TextIO.putln("Hit return to start workout: ");
		
		// once return is pressed... create the Date() start time
		boolean startReturnPressed = TextIO.getln().equals("");
		
		// wait for return
		while ( !startReturnPressed ) {
			startReturnPressed = TextIO.getln().equals("");
		}
		
		// Start the "timer"
		Date startTime = new Date();
		
		return startTime;
	}
	
	
	public static long getDuration(Date startTime) {
		// Tell user to hit return to end work-out
		TextIO.putln("Hit return to end workout: ");
		
		// True if return Was pressed
		boolean endReturnPressed = TextIO.getln().equals("");		
		
		// wait for return
		while ( !endReturnPressed ) {
			endReturnPressed = TextIO.getln().equals("");
		}
		
		// once return is pressed...
		Date endTime = new Date();
		
		return ( endTime.getTime() - startTime.getTime() );
	}
	
	
	public static double getMilesCovered() {
		// Ask User to enter mileage
		TextIO.putln("Please enter the mileage you did during your workout: ");
		
		// Read in miles covered
		double milesCovered = TextIO.getDouble();
		
		// True if miles are valid
		boolean validMileage = (milesCovered >= 0.0);
						
		// wait for return
		while ( !validMileage ) {
			// if rating is out of bounds tell user to enter number in bounds
			TextIO.putln("Please Enter a positive mileage.");
			milesCovered = TextIO.getDouble();
			validMileage = (milesCovered >= 0.0);
		}
		return milesCovered;
	}
	
	
	public static int getRating() {
		// ask user for a rating of the work-out (1 - 10)
		TextIO.putln("Provide a rating to workout (1: great; 10 poor): ");
		
		// Read in rating Rating
		int rating = TextIO.getlnInt();
		
		// True if rating is valid
		boolean validRating = (rating >= 1 && rating <= 10);
		
		// Wait for return
		while ( !validRating ) {
			// if rating is out of bounds tell user to enter number in bounds
			TextIO.putln("Rating needs to be from 1 - 10.");
			rating = TextIO.getlnInt();
			validRating = (rating >= 1 && rating <= 10);
		}
		return rating;
	}
	
	
	
	// MARK: Other user input (non Work-out)
	
	public static int getSelectedOption() {
		// Read in Selection
		int selection = TextIO.getlnInt();
		
		// True if valid selection
		boolean validSelection = ( selection >= 1 ) && ( selection <= Console_Controller_Output.OPTIONS.length );
		
		// Make sure you get valid selection
		while ( !validSelection ) {
			TextIO.putln("Invalid selection. Select an option from 1 to " + Console_Controller_Output.OPTIONS.length);
			selection = TextIO.getlnInt();
			validSelection = ( selection >= 1 ) && ( selection <= Console_Controller_Output.OPTIONS.length );
		}
		
		return selection;
	}
	
	
	public static int getIndexToDelete(int size) {
		// tell user to select one to delete
		TextIO.putln("Select a workout to delete (enter the number): ");
		
		// Read int index to delete
		int indexToDelete = TextIO.getlnInt();
		
		// True if valid selection
		boolean validIndex = (indexToDelete >= 0 && indexToDelete < size);
		
		// Make sure input is correct
		while(!validIndex) {
			TextIO.putln("Index needs to be from 0 to " + (size - 1));
			indexToDelete = TextIO.getlnInt();
			validIndex = (indexToDelete >= 0 && indexToDelete <= size);
		}
		return indexToDelete;
	}

	
	public static String askForWorkoutBuddyName() {
		// Ask for work-out buddy's name to search for
		TextIO.putln("Enter of the name of the buddy you want to search for past workouts with.");
		
		// Get the name
		String buddyName = TextIO.getln();
		
		// if the name is valid
		boolean validName = (buddyName != null && buddyName.length() > 0);
		
		// Make sure input is correct
		while (!validName) {
			// if rating is out of bounds tell user to enter number in bounds
			TextIO.putln("Please enter a valid buddy name: ");
			buddyName = TextIO.getln();
			validName = (buddyName != null && buddyName.length() > 0);
		}
		return buddyName;
	}

	
	public static String askForLocation() {
		// Ask for location to search for 
		TextIO.putln("Please enter of the name of the location workout you want to search.");
		
		// Read in location
		String location = TextIO.getln();
		
		// True if location is valid
		boolean validLocation = (location != null && location.length() > 0);
		
		// Make sure input is correct 
		while ( !validLocation ) {
			// if rating is out of bounds tell user to enter number in bounds
			TextIO.putln("Please enter a valid location: ");
			location = TextIO.getln();
			validLocation = (location != null && location.length() > 0);
		}
		return location;
	}
	
	
	public static double askForMileage() {
		// ask user to enter mileage
		TextIO.putln("Please enter the mileage you want to search for.");
		
		// Read in Mileage
		double mileage = TextIO.getlnDouble();
		
		// Make sure the mileage is valid
		boolean validMileage = (mileage >= 0);
		
		// Ask user to enter buddy name
		while ( !validMileage ) {
			// if rating is out of bounds tell user to enter number in bounds
			TextIO.putln("Please enter a valid mileage ( >=0 ): ");
			mileage = TextIO.getlnDouble();
			validMileage = mileage >= 0;
		}
		return mileage;
	}
	
	
	public static boolean askIfUserWantsToQuit() {
		TextIO.putln("Are you sure you want to quit? - all your data will be lost.");
		TextIO.putln("Type: 'n' (followed by 'enter') to continue.");
		TextIO.putln("Type: any character (followed by 'enter') to quit.");
		
		boolean validSelection = false;
		
		char quit = TextIO.getlnChar();
		
		if (quit == 'n' || quit == 'N') {
			validSelection = true;
		} else {
			TextIO.putln("Thanks for using this Workout App");
			validSelection = false;
		}
		return validSelection;
	}
	
	
} // end class
