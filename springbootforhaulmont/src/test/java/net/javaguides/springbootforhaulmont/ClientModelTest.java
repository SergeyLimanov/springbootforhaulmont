package net.javaguides.springbootforhaulmont;

import net.javaguides.springbootforhaulmont.model.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientModelTest {
    @Test
    public void firstNameShouldBeNull() {
        Client clientOne = new Client();

        Assertions.assertEquals(null, clientOne.getFirstName());

    }
}
