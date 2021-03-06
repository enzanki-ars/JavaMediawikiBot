package WikiBot.APIcommands.Query;

public class QueryCategoryMembers extends QueryList {
	public QueryCategoryMembers(String language, String categoryName, int depth) {
		super(language, "categorymembers");
		keys.add("cmtitle");
		values.add(categoryName);
		keys.add("cmlimit");
		values.add("" + depth);
		unescapeText = true;
		unescapeHTML = false;
	}
	
	/*
	 * Use this for continuing large queries.
	 */
	public QueryCategoryMembers(String language, String categoryName, int depth, String cmcontinue) {
		super(language, "categorymembers");
		keys.add("cmtitle");
		values.add(categoryName);
		keys.add("cmlimit");
		values.add("" + depth);
		keys.add("cmcontinue");
		values.add(cmcontinue);
		unescapeText = true;
		unescapeHTML = false;
	}
	
	/**
	 * This method only fetches at maximum 40 category members.
	 */
	public QueryCategoryMembers(String language, String categoryName) {
		super(language, "categorymembers");
		keys.add("cmtitle");
		values.add(categoryName);
		keys.add("cmlimit");
		values.add("" + 40);
		unescapeText = true;
		unescapeHTML = false;
	}
}
