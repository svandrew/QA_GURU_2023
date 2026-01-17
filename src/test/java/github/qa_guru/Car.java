package github.qa_guru;

import org.junit.jupiter.api.Test;

public class Car extends Vehicle {

    @Test
    public void main1() {
        Vehicle a = new Car();
        boolean result =  a instanceof Vehicle;
        System.out.println( result );
    }
}