import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashAndTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//TreeMap<Integer,String>tree=new TreeMap<Integer,String>();
//tree.put(1, "政治");
//tree.put(5, "历史");
//tree.put(4, "地理");
//tree.put(3, "生物");
//tree.put(2, "物理");
//tree.put(6, "化学");
//tree.put(8, "数学");
//tree.put(9, "语文");
//tree.put(7, "英语");
//tree.put(10, "自然");
//for(Entry<Integer, String> entry:tree.entrySet())
//{
//	System.out.println(entry.getKey()+" "+entry.getValue());
//}
//	}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("语文", 6);
		map.put("数学", 2);
		map.put("英语", 3);
		map.put("历史", 4);
		map.put("政治", 5);
		map.put("地理", 6);
		map.put("生物", 7);
		map.put("化学", 9);map.put("化学", 7);
		for(Entry<String, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
