import java.util.Date;

public class Workout {
	
	
	
	// MARK: Instance Variables
	
	private String location; 
	private String workoutBuddy; 
	private Date startTime; 
	private long duration; 
	private Double milesCovered; 
	private int rating; 
	
	
	
	// MARK: Constructor(s)
	
	public Workout(String location, String workoutBuddy, Date startTime,
			long duration, Double milesCovered, int rating) {
		this.location = location;
		this.workoutBuddy = workoutBuddy;
		this.startTime = startTime;
		this.duration = duration;
		this.milesCovered = milesCovered;
		this.rating = rating;
	}
	
	
	// Copy Constructor
	public Workout (Workout other) {
		this.location = other.location;
		this.workoutBuddy = other.workoutBuddy;
		this.startTime = other.startTime;
		this.duration = other.duration;
		this.milesCovered = other.milesCovered;
		this.rating = other.rating;
	}
	
	
	
	// MARK: Getter(s)
	
	public String getWorkoutBuddyName() { return this.workoutBuddy; }
	
	
	public double getMilesCovered() { return this.milesCovered; }
	
	
	public long getDuration() { return this.duration; }
	
	
	public String getLocation() { return this.location; }
	
	
	public int getRating() { return this.rating; }
	
	
	
	// MARK: Setter(s)
	
	
	
	// MARK: Instance Methods
	
	// To String
	public String toString() {
		return "\tLocation:\t\t" 				+ this.location + 
				"\n\tWorkout Buddy:\t\t"		+ this.workoutBuddy + 
				"\n\tStart Time:\t\t" 	 		+ this.startTime.toString() + 
				"\n\tDuration (sec):\t\t" 	 	+ ( this.duration / 1000.0 ) + 
				"\n\tDist.Covered (mi.):\t" 	+ this.milesCovered + 
				"\n\tRating:\t\t\t" 			+ this.rating + "\n\n";
	}

	
	
} // End Class
