package com.schreiber.lombok;

/**
 * Created by Christophe on 19/06/2016.
 */
public class LombokPOCMain {
    public static void main(String[] args) {
        Address address = new Address(177, "avenue Henri Barbusse", 92700, "Colombes", "France");
        Person person = new Person("Christophe", "Schreiber", 34, address);
        System.out.println(person);
    }
}
