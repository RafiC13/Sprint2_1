Here I added some examples how html output should look like
It might be a bit different if want

admin panel more or less is done, so not going to comment too much it.

student session info
So... on login page...

If user is admin we need him to redirect to admin panel

If user is student1 we need to redirect him to student session page
Most of user session html code is static, just that "user name"
and session list is dinamic.

For session info we need to replicate this line with new info

<tr>
	<td>1</td><td>PSD3</td><td>2013-11-22 09:00</td>
</tr>

<tr>
	<td>/*** NUMBER ***/</td><td>/*** SESSION NAME ***/</td><td>/*** SESSION TIME ***/</td>
</tr>


To make it simple, we can create something like array with that info
and just using foreach print it (since we assume that that data came from db)


so it going to be somethin like this

<table class="forTable">
	<tr>
		<th></th><th>Session</th><th>Time</th>
	</tr>
	JAVACODE.getStudentTimetable();
</table>