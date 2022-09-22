package com.xworkz.block;

public class Wrapper {

	public static void main(String[] args) {
		
		byte a = 3;
		short b = 12;
		int c = 222;
		long d = 343653L;
		double e = 10825.675d;
		float f = 672627.0788f;
		
		//auto boxing  from primitive to  wrapper type;
		Byte a1 = a;
		Short b1 = b;
		Integer c1= c;
		Long d1 = d;
		Double e1 = e;
		Float f1= f;
		
		System.out.println("Byte value is :"+a1);
		System.out.println("short value is :"+b1);
		System.out.println("int value is :"+c1);
		System.out.println("long value is :"+d1);
		System.out.println("double value is :"+e1);
		System.out.println("float value is :"+f1);
		
		//Auto un-boxing from wrapper to primitive type.
		
		Byte a2 = a1.byteValue();
		Short b2 = b1.shortValue();
		Integer c2 = c1.intValue();
		Long d2 = d1.longValue();
		Double e2 = e1.doubleValue();
		Float f2 = f1.floatValue();
		
		System.out.println("Byte value is "+a1.byteValue());
		System.out.println("Short value is "+b1.shortValue());
		System.out.println("Integer value is "+c1.intValue());
		System.out.println("Long value is "+d1.longValue());
		System.out.println("Double value is "+e1.doubleValue());
		System.out.println("Float value is "+f1.floatValue());
		
	}
}
