package pojoClasses;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

public class RootPojo {

	/*
	 * ObjectMapper om = new ObjectMapper(); Root root = om.readValue(myJsonString),
	 * Root.class);
	 */

	public List<Datum> data;
	public List<Source> source;

	public List<Datum> getData() {
		return data;
	}

	public void setData(List<Datum> data) {
		this.data = data;
	}

	public List<Source> getSource() {
		return source;
	}

	public void setSource(List<Source> source) {
		this.source = source;
	}

}
