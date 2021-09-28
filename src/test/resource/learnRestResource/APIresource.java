package learnRestResource;

//enum ::collection of constants and method
public enum APIresource {

	getuser("/api/users"), postuser("/api/users"), registeruser("/api/register");

	private String resource;

	APIresource(String resource) {
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}

}
