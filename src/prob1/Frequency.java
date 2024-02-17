package prob1;
import java.util.*;
public class Frequency {
	/**
	 * Returns a frequencyTable for the input list. Implementation must 
	 * be based on recursion.
	 */
	/*public HashMap<Integer, Integer> recurFreqTable(LinkedList<Integer> list,HashMap<Integer, Integer> tempList, int i) {
		//implement
		int count = 0;
		if(i > list.size() || i == list.size()) {
			
			return tempList;
		}
		
		
		 int num = list.get(i);
		 for(int j=i; j< list.size(); j++) {
			 if(list.get(j) == num) {
				 count++;
			 }
		 }
		 
		 if(!tempList.containsKey(num)) {
			 tempList.put(num, count);
		 }
		 
		 i = i+1;
		 recurFreqTable(list,tempList,i);

		return tempList;
		
	
	}
	
	//expected output:
	//{3=3, 4=1, 8=4, 9=1}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(8);
		list.add(3);
		list.add(9);
		list.add(3);
		list.add(8);
		list.add(8);
		FrequencySol m = new FrequencySol();
		HashMap<Integer, Integer> t = new HashMap<Integer, Integer>();
		//HashMap<Integer, Integer> h = m.recurFreqTable(list, t, 0);
		//System.out.println(h);
		

	}
	*/

}
