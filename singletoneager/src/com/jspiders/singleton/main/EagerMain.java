package com.jspiders.singleton.main;

import com.jspiders.singletonObject.SingltonEager;

public class EagerMain {
	public static void main(String[] args) {

		SingltonEager<?> singltonEager = new SingltonEager<Object>();
		singltonEager.getObject();
	}
}
