package org.design.pattern.nullobject;

import java.util.HashMap;
import java.util.Map;

public class CustomerFactory {

    private static Map<String, Integer> customerMap = new HashMap<String, Integer>();

    public static void init() {
	customerMap.put("Pedro", 20);
	customerMap.put("Ana", 35);
	customerMap.put("Maria", 18);
	customerMap.put("Bob", 40);
    }

    public static AbstractCustomer findCustomerByName(String name) {

	// Inicialia a colecao
	init();

	for (String key : customerMap.keySet()) {
	    if (key.equalsIgnoreCase(name)) {
		int age = customerMap.get(key);
		return new Customer(key, age);
	    }
	}

	return new NullCustomer();
    }

}
