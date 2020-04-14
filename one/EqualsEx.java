package com.one;

class PointEq{
	int x,y;
	public PointEq(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj) {
		PointEq p=(PointEq)obj;//강제 형변환
		if (x==p.x && y==p.y) {
			return true;
		}else {
			return false;
		}
	}
}
public class EqualsEx {

	public static void main(String[] args) {
		PointEq a=new PointEq(2, 3);
		PointEq b=new PointEq(2, 3);
		PointEq c=new PointEq(2, 3);
//		a=b;
//		System.out.println(a);
//		System.out.println(b);
		if (a==b) 
			System.out.println("a==b");
		if (a.equals(b)) 
			System.out.println("a is equal to b");
		if (a.equals(c)) 
			System.out.println("a is equal to c");
	}

}
