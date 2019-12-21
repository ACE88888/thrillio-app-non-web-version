package zhou.zihang.thrillio.constants;

public enum MovieGenre {	
	 CLASSICS("Classics"),
	 DRAMA("Drama"),
	 SCIFI_AND_FANTASY("Scifi & Fantasy"),
	 COMEDY("Comedy"),
	 CHILDREN_AND_FAMILY("Children & Family"),
	 ACTION_AND_MUSICALS("Action & Musicals"),
	 TELEVISION("Television"),
	 HORROR("Horror"),
	 SPECIAL_INTEREST("Special Interest"),
	 INDEPENDENT("Independent"),
	 SPORTS_AND_FITNESS("Sports & Fitness"),
	 ANIME_AND_ANIMATION("Anime & Animation"),
	 GAY_AND_LESBIAN("Gay & Lesbian"),
	 CLASSIC_MOVIE_MUSICALS("Classic Movie Musicals"),
	 FAITH_AND_SPIRITUALITY("Faith & Spirituality"),
	 FOREIGN_DRAMAS("Foreign Dramas"),
	 FOREIGN_ACTION_AND_ADVENTURE("Foreign Action & Adventure"),
	 FOREIGN_THRILLERS("Foreign Thrillers"),
	 TV_SHOWS("TV Shows"),
	 THRILLERS("Thrillers"),
	 ROMANTIC_MOVIES("Romantic Movies"),
	 COMEDIES("Comedies"),
	 DOCUMENTARIES("Documentaries"),
	 FOREIGN_MOVIES("Foreign Movies"),
	 OTHERS_1("Others 1"),
	 OTHERS_2("Others 2");

	
	private MovieGenre(String name) {
		this.name = name;
	}

	private String name;
	public String getName() {
		return name;
	}
}
