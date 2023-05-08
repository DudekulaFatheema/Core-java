package Day6;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String args[]) {
		Map<String ,Integer> nums=new HashMap<> ();
		nums.put("mario",5);
		nums.put("haseena",6);
		nums.put("jakheer",8);
		System.out.println(nums.keySet());
		for(String key:nums.keySet())
		{
			System.out.println(key + ":" +nums.get(key));
		}
		
		

}
}


