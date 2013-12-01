package hello;

public class add_session {
	
   // @NotNull
	private String date;
	private String time;
	private String duration;
	private int repeat;
	private String lecturer;
	private int max;
	private boolean compulsory;
	private String venue;
	
	public String toString() {
		return "Session: (" +  date + " " + time + " " + duration + " " + repeat + " " + lecturer + " " + max + " " + compulsory + " " + venue + " )"; 
	}
	
	public void addSession() {
		/* saves data to database */
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
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

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	

}
