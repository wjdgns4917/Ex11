package com.trans;

public abstract class Trans {
	protected int cnt;//�ο�
	protected int dis;//�Ÿ�
	protected int dan;//�ܰ�
	
	public Trans(int cnt,int dis,int dan) {
		this.cnt=cnt;
		this.dis=dis;
		this.dan=dan;
	}
	public abstract int getCharge();
	
	@Override
	public String toString() {
		return "�ο� : "+cnt+" �Ÿ�: "+dis+" �ܰ� : "+dan;
		
	}
}
