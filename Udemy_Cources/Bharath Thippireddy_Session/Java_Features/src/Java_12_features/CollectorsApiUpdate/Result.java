package Java_12_features.CollectorsApiUpdate;

import java.util.List;

public class Result {

	private long count;
	List<Integer> filtered;
		
	public Result(long count, List<Integer> filtered) {
		super();
		this.count = count;
		this.filtered = filtered;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public List<Integer> getFiltered() {
		return filtered;
	}
	public void setFiltered(List<Integer> filtered) {
		this.filtered = filtered;
	}
	
	
}
