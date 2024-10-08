package com.demo.Test;

import com.demo.bean.MyClass;
import com.demo.interfaces.Interface2;

public class TestInterface {

	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.Combination(5, 2);
		MyClass obj1=new MyClass();
		obj1.Permutation(4,2);
		
		Interface2 obj2=new MyClass();
		obj2.m3();
		
		((MyClass)obj2).m2(12);
		
		obj2.hashCode();
		

	}

}
