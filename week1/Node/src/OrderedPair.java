
public class OrderedPair implements Comparable<OrderedPair> {
	private String key;
	private Integer value;

	public OrderedPair(String key, Integer value) {
		setKey(key);
		setValue(value);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public int compareTo(OrderedPair op) {
		return (value - op.value);
	}
	
	public String toString() {
		return ("[" + key + ", " + value + "]\n");
	}
}
