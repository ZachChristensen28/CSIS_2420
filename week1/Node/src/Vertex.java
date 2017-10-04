public class Vertex {
	private String label;
	private boolean wasVisited;
	// private Record record;

	public Vertex(String label) {
		setLabel(label);
		wasVisited = false;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
