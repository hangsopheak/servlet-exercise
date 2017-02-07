package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserList {

	public static Collection<User> getUsers() throws ParseException{
		List<User> users = new ArrayList<User>();
		users.add(new User("sopheak@gmail.com", "sopheak", "2016-09-01 12:14:01"));
		users.add(new User("sophea@gmail.com", "sophea", "2016-09-02 08:14:01"));
		users.add(new User("vichet@gmail.com", "vichet", "2016-09-02 09:09:01"));
		users.add(new User("dara@gmail.com", "dara", "2016-09-03 11:14:31"));
		users.add(new User("sok@gmail.com", "sok", "2016-09-03 12:15:01"));
		users.add(new User("sao@gmail.com", "sao", "2016-09-04 16:01:31"));
		users.add(new User("manith@gmail.com", "manith", "2016-09-05 22:14:01"));
		users.add(new User("vitou@gmail.com", "vitou", "2016-09-06 08:02:01"));
		users.add(new User("veasna@gmail.com", "veasna", "2016-09-07 19:33:40"));
		users.add(new User("sophal@gmail.com", "sophal", "2016-09-08 10:14:01"));
		return users;
	}

}
