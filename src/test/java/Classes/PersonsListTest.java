package Classes;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class PersonsListTest {
   public PersonsList persons;

   @BeforeEach
   void setUp() {
      persons = new PersonsList(List.of(
              new Person(01, "Santiago Casalis", 29, "Rugby"),
              new Person(02, "Tomas Ojeda", 32, "doctor")
      ));


   }

   @AfterEach
   void tearDown() {
   }

   @Test
   public void findByName_Equals() {
      //findByName:
      assertEquals("Santiago Casalis", persons.findByName("Santiago Casalis"));



   }
}