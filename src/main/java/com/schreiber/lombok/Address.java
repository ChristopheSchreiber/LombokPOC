package com.schreiber.lombok;

import lombok.Data;

/**
 * Created by Christophe on 19/06/2016.
 */
@Data
public class Address {
    private final Integer number;
    private final String street;
    private final Integer zipCode;
    private final String city;
    private final String country;
}
