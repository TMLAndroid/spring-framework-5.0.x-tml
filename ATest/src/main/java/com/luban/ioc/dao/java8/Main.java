package com.luban.ioc.dao.java8;

import java.util.function.Function;

public class Main {
	public static void main(String[] args){


		Function<Integer, Integer>  f1 = o -> o++;
		Function<Integer, Integer> g1 = s -> s * 2;
		System.out.println(f1.compose(g1).apply(1));
	}
}
