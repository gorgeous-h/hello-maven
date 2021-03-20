package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloMavenTest {
    @Test
    public void testSayHello() {
        HelloMaven helloMaven = new HelloMaven();
        String result = helloMaven.sayHello();
        assertEquals("Hello Maven", result);
    }
}
