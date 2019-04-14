
public class Club implements Comparable{
	private String name;
	private Integer points = 0;
	private Integer loses = 0;
	private Integer wins = 0;
	private Integer draws = 0;
	
	public Club(String name, Integer points){
		this.name = name;
		this.points = points;
	}

	public int compareTo(Object o) {
		Club toCompare = (Club)o;
		int compare = this.points.compareTo(toCompare.points);
		if (compare == 0){
			return this.name.compareTo(toCompare.name);
		}
		return compare;
	}
	
	

	@Override
	public String toString() {
		return this.name+ " points = "+this.points;
	}
	
	
	
	
}
