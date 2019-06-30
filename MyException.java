package com;

public class MyException extends Exception {
	String b;
	MyException(String a)
	{
		b=a;
	}
	public String toString()
	{
		return ("Policy Number "+b+" is expired");
	}
}
