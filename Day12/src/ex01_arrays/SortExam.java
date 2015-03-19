package ex01_arrays;

import java.util.Arrays;

class Member implements Comparable<Member> {
	String name;
	
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Member other) {
		int result = name.compareTo(other.name);
		System.out.println("Member(" + this.name
				+ ") ��ü�� Member(" + other.name + ") ��ü�� ��: " + result);
		return result;
	}
}

public class SortExam {
	
	public static void main(String[] args) {
		
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		
		System.out.println("--------------");
		
		String[] names = {"ȫ�浿", "�̸���", "�����"};
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		
		System.out.println("--------------");
		
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�̸���");
		Member m3 = new Member("�����");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name = " + members[i].name);
		}
	}
	
}

























