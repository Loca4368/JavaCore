package mapAndSet;

import java.util.*;
import java.util.Map.Entry;

public class Test {
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
		
		
		//Two methods to put customized class
		
		//Method 1: Implements Comparable in Student Class
		Set<Student> studentSet = new TreeSet<Student>();
		
		studentSet.add(new Student("Ming",28));
		studentSet.add(new Student("Loca",29));
		studentSet.add(new Student("Alex",26));
		studentSet.add(new Student("Jason",22));
		studentSet.add(new Student("John",20));
		
		for(Student student : studentSet)
		{
			System.out.println(student);
		}
		
		//Method 2: Pass Comparator as a second argument 
		
		List<Teacher> teacherList = new ArrayList<Teacher>();
		
		teacherList.add(new Teacher("Dr Recep", 40));
		teacherList.add(new Teacher("Dr Qiu", 35));
		teacherList.add(new Teacher("Robin", 43));
		teacherList.add(new Teacher("Ron", 44));
		teacherList.add(new Teacher("Emma", 37));
		
		//
		Collections.sort(teacherList, new Comparator<Teacher>()
		{

			public int compare(Teacher o1, Teacher o2) {
				
				return o1.getAge() - o2.getAge();
			}
				
				
		});
		
		for(Teacher teacher : teacherList)
		{
			System.out.println(teacher);
		}
	}
	

}

