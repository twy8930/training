package com.intyt.container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {

	static class User {
		String name;
		Integer age;

		public User(String name, Integer age) {
			this.name = name;
			this.age = age;
		}
	}

	static class ComparatorUser implements Comparator<User> {

		public int compare(User user0, User user1) {
			// 首先比较年龄，如果年龄相同，则比较名字
			int flag = user0.age.compareTo(user1.age);
			if (flag == 0) {
				return user0.name.compareTo(user1.name);
			} else {
				return flag;
			}
		}

	}

	public static void main(String[] args) {
		// 排序
		List<User> userlist = new ArrayList<User>();
		userlist.add(new User("dd", 4));
		userlist.add(new User("aa", 1));
		userlist.add(new User("ee", 5));
		userlist.add(new User("bb", 2));
		userlist.add(new User("ff", 5));
		userlist.add(new User("cc", 3));
		userlist.add(new User("gg", 6));

		ComparatorUser comparator = new ComparatorUser();
		Collections.sort(userlist, comparator);

		for (int i = 0; i < userlist.size(); i++) {
			User user_temp = (User) userlist.get(i);
			System.out.println(user_temp.age + "," + user_temp.name);
		}

	}

}
