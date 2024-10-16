package com.dp.singleton.lazy01;

import com.dp.singleton.lazy01.Singleton;

public class SingletonLazy01 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("Lazy Loading, 錯誤用法 但多執行緒不安全");
		System.out.println(instance == instance2);
		System.out.println("instance.hasCode= " + instance.hashCode());
		System.out.println("instance2.hasCode= " + instance2.hashCode());
	}
}


class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}