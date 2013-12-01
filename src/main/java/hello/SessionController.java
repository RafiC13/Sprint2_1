package hello;

import java.util.ArrayList;

public class SessionController {

	ArrayList<Session> sessions = new ArrayList<Session>();

	/**
	 * Parameterised constructor
	 * @param session
	 */
	public SessionController (String course,
			String lecturer,
			String time,
			String date,
			String venue,
			String duration,
			int repeat,
			int max,
			boolean compulsory){
		sessions.add(new Session(course,
				lecturer,
				time,
				date,
				venue,
				duration,
				repeat,
				max,
				compulsory));
	}



	// Getter
	public ArrayList<Session> getSessions(){
		return sessions;
	}
}
