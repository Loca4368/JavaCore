package map;

import java.util.*;
import java.util.Map.Entry;

public class MapTraversal {
	public static void main(String[] args) {
		
		//HashMap 
		Map map=new HashMap();
		map.put("m1gg", "m11");
		map.put("m2", "m22");
		map.put("m3", "m33");
		map.put("m4", "m44");
		Iterator iter=map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry=(Entry) iter.next();
			String key=entry.getKey().toString();
			String value=entry.getValue().toString();
			System.out.println(key+"*"+value);
		}
		
		//TreeMap 
		Map treemap=new TreeMap();
		treemap.put("e1", "t11");
		treemap.put("d2", "t22");
		treemap.put("c3", "t33");
		treemap.put("b4", "t44");
		treemap.put("a5", "t55");
		
		Iterator titer=treemap.entrySet().iterator();
		while(titer.hasNext()){
			Map.Entry ent=(Map.Entry )titer.next();
			String keyt=ent.getKey().toString();
			String valuet=ent.getValue().toString();
			System.out.println(keyt+"*"+valuet);
		}
		
	}
	

}

