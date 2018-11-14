package org.design.pattern.nullobject;

public class NullCustomer extends Customer {

    public NullCustomer() {
	super();
    }

    @Override
    public String getName() {
	// TODO Auto-generated method stub
	return "Nenhum cliente encontrado";
    }

    @Override
    public int getAge() {
	return 0;
    }

}
