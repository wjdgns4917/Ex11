package com.one;

public class forEachEx {
	enum Week {��,ȭ,��,��,��,��,��}//������ Ÿ��
	public static void main(String[] args) {
		int[]n= {1,2,3,4,5};
		String names[]= {"���","��","�ٳ���","ü��","����","����"};
		
		int sum=0;
		
		for (int k : n) {
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("���� "+sum);
		
		for (String s : names) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//foreach������ ������ Ÿ�����
		for (Week day : Week.values()) {
			System.out.print(day+"���� ");
		}
		System.out.println();
	}
}
