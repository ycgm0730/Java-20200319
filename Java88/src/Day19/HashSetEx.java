package Day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("���");
		list.add("��");
		list.add("����");
		list.add("���");
		list.add("���");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println();
		
		
		
		Set<String> set = new HashSet<>();
		set.add("���");
		set.add("��");
		set.add("����");
		set.add("���");
		set.add("���");
		for(String str:set) {
			System.out.println(str);
		}
		System.out.println(set.contains("���"));
		System.out.println(set.isEmpty());
		if(!set.isEmpty()) {
			set.clear();
		}
		System.out.println(set.size());
		
		Iterator<String> iterator=list.iterator();	//�÷��� ���� �޼���
		while(iterator.hasNext()) {
			String str= iterator.next();
			System.out.println(str);
		}
		System.out.println();
		
	}
}
