package zhou.zihang.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import zhou.zihang.thrillio.constants.BookGenre;
import zhou.zihang.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidFriendlyEligible() {
		// Test 1
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[] {"Henry David Thoreau"},	BookGenre.PHILOSOPHY, 4.3);

		boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For Philosophy Genre - isKidFriendlyEligible() must return false");
		
		// Test 2
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications", new String[] {"Henry David Thoreau"},	BookGenre.SELF_HELP, 4.3);

		isKidFriendlyEligible = book.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For Self help Genre - isKidFriendlyEligible() must return false");
		
	}

}
