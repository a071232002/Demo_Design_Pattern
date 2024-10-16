package com.dp.singleton.lazy03;

import com.dp.singleton.lazy03.Singleton;

public class SingletonLazy03 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		System.out.println("Lazy Loading, 雙重檢查");
		System.out.println(instance == instance2);
		System.out.println("instance.hasCode= " + instance.hashCode());
		System.out.println("instance2.hasCode= " + instance2.hashCode());
	}
}

class Singleton {
	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}