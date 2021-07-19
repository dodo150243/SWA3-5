package com.journaldev.composition;

public class TestPerson {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        Person person = new Person();
		long salary = person.getSalary();
    }

}
