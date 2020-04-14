package com.one;
class Point{
	private int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("이곳이 출력");
		return super.toString();
	}
}
public class ObjectEx {
	
	public static void main(String[] args) {
		Point p=new Point(2, 3);
		print(p);
	}

	private static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
		
	}
}
