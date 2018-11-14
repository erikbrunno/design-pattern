package org.design.pattern.nullobject;

public abstract class AbstractCustomer {

    protected String name;

    protected int age;

    public abstract String getName();

    public abstract int getAge();

    public AbstractCustomer(String name, int age) {
	this.name = name;
	this.age = age;
    }

    public AbstractCustomer() {

    }

}
