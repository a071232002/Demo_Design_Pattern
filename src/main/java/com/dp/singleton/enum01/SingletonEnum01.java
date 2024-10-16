package com.dp.singleton.enum01;

import com.dp.singleton.enum01.Singleton;

public class SingletonEnum01 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;

		System.out.println("enum推薦使用 執行緒安全");

		System.out.println(instance == instance2);
		System.out.println("instance.hasCode= " + instance.hashCode());
		System.out.println("instance2.hasCode= " + instance2.hashCode());
	}
}

enum Singleton {
	INSTANCE;
	public void method() {
		// 
	}
}
