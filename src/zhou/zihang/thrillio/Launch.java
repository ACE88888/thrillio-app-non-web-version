package zhou.zihang.thrillio;

import java.util.List;

import zhou.zihang.thrillio.bgjobs.WebpageDownloaderTask;
import zhou.zihang.thrillio.entities.Bookmark;
import zhou.zihang.thrillio.entities.User;
import zhou.zihang.thrillio.managers.BookmarkManager;
import zhou.zihang.thrillio.managers.UserManager;

public class Launch {

	private static List<User> users;
	private static List<List<Bookmark>> bookmarks;
	
	private static void LoadData() {
		System.out.println("1. Loading data ...");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		//System.out.println("Print data ...");
		printUserData();
		printBookmarkData();
	}

	private static void printUserData() {
		for (User user: users) {
			System.out.println(user);
		}	
	}
	
	private static void printBookmarkData() {
		for (List<Bookmark> bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	private static void start() {
		//System.out.println("\n2. Bookmarking ...");
		for (User user : users) {
			View.browse(user, bookmarks);
		}
	}
	
	public static void main(String[] args) {
		LoadData();
		start();
		//runDownloaderJob();
	}
	
	private static void runDownloaderJob() {
		WebpageDownloaderTask task = new WebpageDownloaderTask(true);
		(new Thread(task)).start();
	}

}
