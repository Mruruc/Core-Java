package com.mruruc;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        Customer c1=
                new Customer(1,"John","Doe");

        ObjectMapper mapper=new ObjectMapper();

        //Object to JSON :
        String json=mapper.writeValueAsString(c1);
        System.out.println(json);

        //JASON to Object:

        Customer c2 =
                mapper.readValue("{\"id\":2,\"f_name\":\"Jane\",\"l_name\":\"Doe\"}", Customer.class);

        System.out.println(c2);

        Customer c3 =
                mapper.readValue("{\"id\":3,\"f_name\":\"Bob\",\"l_name\":\"Thkny\"}", Customer.class);

        System.out.println(c3);
        System.out.println(mapper.writeValueAsString(c3));
    }
}

