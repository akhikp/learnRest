package pojoClasses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {
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

	public String getiDNation() {
		return iDNation;
	}

	public void setiDNation(String iDNation) {
		this.iDNation = iDNation;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getiDYear() {
		return iDYear;
	}

	public void setiDYear(int iDYear) {
		this.iDYear = iDYear;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getSlugNation() {
		return slugNation;
	}

	public void setSlugNation(String slugNation) {
		this.slugNation = slugNation;
	}

}
