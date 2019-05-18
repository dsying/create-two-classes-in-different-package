package com.ghutb.hcsp;

import com.github.hcsp.pkg1.Cat;
import com.github.hcsp.pkg2.Dog;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void homeHasCatAndDog() {
        Home home = new Home();
        home.cat = new Cat();
        home.dog = new Dog();
    }
}
