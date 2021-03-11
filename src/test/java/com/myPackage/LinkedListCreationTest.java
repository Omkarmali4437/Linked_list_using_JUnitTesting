package com.myPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListCreationTest {
    LinkedListCreation list;

    @Before
    public void setup()
    {
        list=new LinkedListCreation();
    }

    @Test
    public void  creating_a_simple_linked_list()
    {
        list.addValue(56);
        list.addValue(30);
        list.addValue(70);
        list.display();
    }
}
