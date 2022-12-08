package enums;

public enum codex {
	soPI("3,14"),
	sortByPointAsc("maAsc"),
	sortByNameAsc("tenAsc");
	
	private String code;
	codex(String code) { this.code = code;};
	public String getCode() { return this.code;}
}
