import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;


public class BubbleSortTest extends TestCase {
		private <T> void helperTest(T[] clubs){
			if (clubs == null) {
				return;
			}
			List<T> actual = (List<T>) Arrays.asList(clubs);
			BubbleSort.sort(actual);
			Arrays.sort(clubs);
			List<T> expected = (List<T>)Arrays.asList(clubs);
			assertEquals(expected, actual);
		}
		public void testBubbleSort(){
			String[] clubs = {"Chelsea","Arsenal","Burnley","West Ham", "Fulham", "Manchester United", "Manchester City"};
			helperTest(clubs);
		}
		
		public void testVide(){
			helperTest(new String[]{});
		}
		
		public void testMajuscules(){
			helperTest(new String[]{"a","A"});
		}
		
		public void testNombres(){
			helperTest(new Integer[]{2,1});
		}
		
		public void testBigDecimal(){
			helperTest(new BigDecimal[]{new BigDecimal(2000),new BigDecimal(1000), new BigDecimal(400), new BigDecimal(4.5)});
		}
		
		public void testNull(){
			helperTest(null);
		}
		
		public void testClubs(){
			Club chelsea = new Club("Chelsea",5);
			Club arsenal = new Club("Arsenal",10);
			Club burnley = new Club("Burnley",1);
			Club[] clubs = {chelsea, arsenal, burnley};
			helperTest(clubs);
		}
		
}
