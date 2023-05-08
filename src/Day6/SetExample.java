package Day6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String args[]) {
		Set<Integer> nums=new TreeSet<Integer> ();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		Iterator<Integer> values=nums.iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}

}
}


