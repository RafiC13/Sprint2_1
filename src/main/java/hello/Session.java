package hello;

public class Session {
	
	private String course;
	private String lecturer;
	private String time;
	private String date;
	private String venue;
	private String duration;
	private int repeat;
	private int max;
	private boolean compulsory;
	
	
	/**
	 * Parameterised constructor
	 * 
	 * @param course
	 * @param lecturer
	 * @param time
	 * @param date
	 * @param venue
	 * @param duration
	 * @param repeat
	 * @param max
	 * @param compulsory
	 */
	public Session (String course,
					String lecturer,
					String time,
					String date,
					String venue,
					String duration,
					int repeat,
					int max,
					boolean compulsory){
		this.setCourse(course);
		this.setLecturer(lecturer);
		this.setTime(time);
		this.setDate(date);
		this.setVenue(venue);
		this.setDuration(duration);
		this.setRepeat(repeat);
		this.setMax(max);
		this.setCompulsory(compulsory);		
	}
	
	// Getters and setters
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getRepeat() {
		return repeat;
	}

	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public boolean isCompulsory() {
		return compulsory;
	}

	public void setCompulsory(boolean compulsory) {
		this.compulsory = compulsory;
	}
	
	
	
	/**
	 * Returns a string representation of the object Session.
	 */
	public String toString(){
		return String.format("%s, %s, %s, %s, %s, %s, %s, %s, %s",
				course, date, time, venue, lecturer, duration, repeat, max, compulsory);
	}
}
