package com.jspiders.singletonObject;

public class SingltonEager<singletonEager> {
static int objectCount;
SingletonEager  singletonEager = new SingletonEager();

public com.jspiders.singletonObject.SingletonEager getObject() {
System.out.println("Object Created" + objectCount +" ");
return singletonEager;
}
}