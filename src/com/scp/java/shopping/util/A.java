package com.scp.java.shopping.util;




interface I1
{
	public void m1();
}
interface I2
{
	void m1();
}
public class A implements I1,I2 {

	public static void main(String[] args) {
		
		//System.out.println(6/2*(2+1));
		
	}
@Override
public void m1() {
	System.out.println("Inside A");
}

}
