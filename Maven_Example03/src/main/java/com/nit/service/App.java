package com.nit.service;

public class App 
{
    public static void main( String[] args )
    {
       int i=20;
       int j=30;
    }
    
    public static int add(int i,int j) {
    	return i+j;
    }
    public static int sub(int i,int j) {
    	return i-j;
    }
    public int mul(int i,int j) {
    	System.out.println(i*j+"  "+Math.multiplyExact(i, j));
    	return Math.multiplyExact(i, j);
    }
    
}
