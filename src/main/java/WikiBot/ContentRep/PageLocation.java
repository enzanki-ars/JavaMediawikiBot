package WikiBot.ContentRep;


public class PageLocation extends PageTitleContainer {

	private String lan;
	
	/**
	 * @param title_ The title of the page.
	 * @param lan_ The language abbreviation for the wiki.
	 */
	public PageLocation(String title_, String lan_) {
		super(title_);
		lan = lan_;
	}
	
	/**
	 * @param pt The Page Title object describing the title of the page.
	 * @param lan_ The language abbreviation for the wiki.
	 */
	public PageLocation(PageTitle pt, String lan_) {
		super(pt);
		lan = lan_;
	}
	
	public String getLanguage() {
		return lan;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass().equals(PageLocation.class)) {
			PageLocation pg = (PageLocation)obj;
			return pg.getTitle().equalsIgnoreCase(titleObject.getTitle()) && lan.equals(pg.getLanguage());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "PageLocation: " + lan + ": " + titleObject.getTitle();
	}
}
