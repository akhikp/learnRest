package pojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum{
	 @JsonProperty("ID Nation") 
	 public String iDNation;
	 @JsonProperty("Nation") 
	 public String nation;
	 @JsonProperty("ID Year") 
	 public int iDYear;
	 @JsonProperty("Year") 
	 public String year;
	 @JsonProperty("Population") 
	 public int population;
	 @JsonProperty("Slug Nation") 
	 public String slugNation;
	}
