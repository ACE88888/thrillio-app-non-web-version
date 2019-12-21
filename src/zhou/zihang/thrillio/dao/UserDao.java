package zhou.zihang.thrillio.dao;

import java.util.List;

import zhou.zihang.thrillio.DataStore;
import zhou.zihang.thrillio.entities.User;

public class UserDao {
	public List<User> getUsers() {
		return DataStore.getUsers();
	}
}
