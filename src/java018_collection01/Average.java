package java018_collection01;

public class Average<T extends Number> {
	
	private T[] list;
	
	public Average() {}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for(T data : list)
			sum += data.doubleValue();
		
		return sum/list.length;
	}
}



