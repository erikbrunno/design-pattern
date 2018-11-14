package org.design.pattern.nullobject;

public class Customer extends AbstractCustomer {

    public Customer(String name, int age) {
	super(name, age);
    }

    public Customer() {

    }

    @Override
    public String getName() {
	return name;
    }

    @Override
    public int getAge() {
	return age;
    }

}
