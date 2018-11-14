package org.design.pattern.nullobject;

import org.junit.Assert;
import org.junit.Test;

public class CustomerFactoryTest {

    @Test
    public void testObjectFound() {
	AbstractCustomer customer = CustomerFactory.findCustomerByName("Bob");

	Assert.assertEquals("Bob", customer.getName());
	Assert.assertEquals(40, customer.getAge());
    }

    @Test
    public void testObjectNotFound() {
	AbstractCustomer customer = CustomerFactory.findCustomerByName("Raul");

	Assert.assertEquals("Nenhum cliente encontrado", customer.getName());
	Assert.assertEquals(0, customer.getAge());
    }
}
