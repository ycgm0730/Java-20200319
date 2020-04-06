package Day19;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("���");
		list.add("��");
		list.add("������");
		list.add("���ξ���");

		System.out.println(list.size());

		String str = list.get(0);
		System.out.println(str);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.add(2, "����");
		for (String temp : list) {
			System.out.println(temp);
		}
		System.out.println();

		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		list.remove("������");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		list.remove("����");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		System.out.println();

		System.out.println(list.contains("����"));
		System.out.println(list.contains("����"));
		System.out.println(list.isEmpty());
		System.out.println();

		if (!list.isEmpty())
			;
		{
			list.clear();
		}
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println();
		
		int[]arr=new int [] {10,20,30,40,50};
		for(int num:arr) {
			if(num ==30) {
				System.out.println(num==30);
			}
		}
		System.out.println();
		
		List<Integer> arrList =Arrays.asList(10,20,30,40,50);
		System.out.println(arrList.contains(30));
		
//		List<Integer> streamList=Arrays.stream(arr).boxed().collect(Collectors.toList());
//		for(int i=0; i<streamList.size(); i++) {
//			System.out.println(streamList.get(i));
//		}
//		Integer[]ary= arrList.toArray(new Integer[arrList.size()]);
//		System.out.println(ary);
//		arrList.clear();
//		System.out.println(arrList.get(0));
	}

}
