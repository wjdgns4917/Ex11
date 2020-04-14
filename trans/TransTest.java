package com.trans;

public class TransTest {
	
	public static void printPay(Trans trans) {
		System.out.println("==============================");
		System.out.println(trans);
		System.out.println("------------------------------");
		System.out.println(trans.getCharge());
	}
	public static void main(String[] args) {
//		Trans tr=new Train(10, 100, 2000);
//		System.out.println(tr);
		Trans[] tran=new Trans[3];
		
		tran[0]=new Train(10, 100, 1000);
		tran[1]=new Express(5, 100, 500);
		tran[2]=new CityBus(20, 100, 200);
//		printPay(tran[0]);
//		printPay(tran[1]);
//		printPay(tran[2]);
		for (int i = 0; i < tran.length; i++) {
			printPay(tran[i]);
		}
		
 	}
}
