package com.syntax.class15;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer strBuffer=new StringBuffer("Hallo ");//is a mutable object=changeable
		strBuffer.append("friend");//when we perform operation it happens on same Object and NO Object get ceated
		System.out.println(strBuffer);//Hello friends
		
		
		String str2="Hello";//String is Immutable object=not changeable
		str2.concat("frieands");//new Object get created that will have "Hello friends"-->no one takes it
		System.out.println(str2);//Hello

	}

}
