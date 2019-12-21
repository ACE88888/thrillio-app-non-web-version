package zhou.zihang.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import zhou.zihang.thrillio.constants.MovieGenre;
import zhou.zihang.thrillio.managers.BookmarkManager;

public class MovieTest {

	@Test
	public void testIsKidFriendlyEligible() {
		// Test 1
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,	new String[] {"Orson Welles", "Joseph Cotten"},	new String[] {"Orson Welles"}, MovieGenre.HORROR, 8.5);

		boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For Horror Genre - isKidFriendlyEligible() must return false");

		// Test 2: porn in title -- false
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941, new String[] {"Orson Welles", "Joseph Cotten"},	new String[] {"Orson Welles"}, MovieGenre.THRILLERS, 8.5);

		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For Thrillers Genre - isKidFriendlyEligible() must return false");

	}

}
