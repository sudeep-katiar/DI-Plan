package com.di.controller;

import com.di.funcinterface.FunctionalInterface;

public class FunctionalMain {
	public static void main(String args[]) {
		
		FunctionalInterface fobj = (int x) -> System.out.println(2 * x);

		fobj.abstractFun(5);
	}

}
