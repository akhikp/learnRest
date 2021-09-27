package pojoClasses;

import java.util.List;

public class Source {
	public List<String> measures;
	public Annotations annotations;
	public String name;
	public List<Object> substitutions;

	public List<String> getMeasures() {
		return measures;
	}

	public void setMeasures(List<String> measures) {
		this.measures = measures;
	}

	public Annotations getAnnotations() {
		return annotations;
	}

	public void setAnnotations(Annotations annotations) {
		this.annotations = annotations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Object> getSubstitutions() {
		return substitutions;
	}

	public void setSubstitutions(List<Object> substitutions) {
		this.substitutions = substitutions;
	}

}
