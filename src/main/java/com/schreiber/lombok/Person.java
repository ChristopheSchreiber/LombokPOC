package com.schreiber.lombok;

import lombok.Data;

/**
 * Created by Christophe on 19/06/2016.
 */
@Data
public class Person {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Address address;


}
