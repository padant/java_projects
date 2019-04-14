import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	public static <T> void sort(List<T> toSort, boolean desc) {
		List<T> result = toSort;
		for (int i=0;i<result.size();i++){
			boolean swap = false;
			for (int j=0;j<result.size();j++){
				
				T current = result.get(j);
				T next = (j + 1) < result.size() ? result.get(j+1) : null;
				if (next != null){
					
					int comp = ((Comparable<T>)next).compareTo(current);
					
					swap = desc ? (comp > 0) : (comp < 0);
					if (swap){
						result.set(j+1, current);
						result.set(j, next);
					}
				}
					
			}
			if (!swap) {
				break;
			}
		}
	}
	
	public static <T> void sort(List<T> toSort){
		sort(toSort, false);
	}
	
	
	public static void main(String[] paul){
		//String[] clubs = {"Chelsea","Arsenal","Burnley","West Ham", "Fulham", "Tottenham", "Leicester City", "Manchester United", "Manchester City"};
		//List<String> clubList = (List<String>) Arrays.asList(clubs);
		
		Club chelsea = new Club("Chelsea",5);
		Club arsenal = new Club("Arsenal",10);
		Club burnley = new Club("Burnley",1);
		Club[] clubs = {chelsea, arsenal, burnley};
		List<Club> clubList = Arrays.asList(clubs);
		boolean desc = true;
		BubbleSort.sort(clubList, desc);
		System.out.println(clubList);
	}
}
