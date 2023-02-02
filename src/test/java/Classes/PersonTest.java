package Classes;


import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;


class PersonTest {
    Person person;

    @BeforeEach
     void setUp() {
        person = new Person(01, "Santiago casalis", 29, "Rugby player");
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    public void  Get_name_age_equal() {

        assertEquals("Santiago casalis", person.getName());
        assertEquals(29, person.getAge());
    }


}