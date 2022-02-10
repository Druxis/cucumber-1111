package uni.fmi.models;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestCinema {
  
  @Test
  public void testSetWithStrings() {
    final Set<String> testInstance = new HashSet<String>();
    String value1 = "value";
    testInstance.add(value1);
    String value2 = "value";
    testInstance.add(value2);
    String value3 = "value";
    testInstance.add(value3);
    assertEquals(1, testInstance.size());
  }
  
  @Test
  public void testSetWithMovies() {
    final Set<Movie> testInstance = new HashSet<Movie>();
    Movie value1 = new Movie();
    value1.setTitle("Ba");
    value1.setDuration(1);
    value1.setGenre("Comedy");
    testInstance.add(value1);
    Movie value2 = new Movie();
    value2.setTitle("Ab");
    value2.setDuration(2);
    value2.setGenre("Horror");
    testInstance.add(value2);
    assertEquals(2, testInstance.size());
  }
  
  @Test
  public void testSetWithUser() {
    final Set<User> testInstance = new HashSet<User>();
    User value1 = new User();
    value1.setName("Ben");
    value1.setSurname("Park");
    value1.setEmail("park@gmail.com");
    testInstance.add(value1);
    User value2 = new User();
    value2.setName("Bob");
    value2.setSurname("Tom");
    value2.setEmail("asaf@gmail.com");
    testInstance.add(value2);
    assertEquals(2, testInstance.size());
  }
  
  @Test
  public void testSetWithUser1() {
    final Set<User> testInstance = new HashSet<User>();
    User value1 = new User();
    value1.setName("Bill");
    value1.setSurname("Karp");
    value1.setEmail("jan@gmail.com");
    testInstance.add(value1);
    User value2 = new User();
    value2.setName("Rin");
    value2.setSurname("Adas");
    value2.setEmail("tawf@gmail.com");
    testInstance.add(value2);
    assertEquals(2, testInstance.size());
  }
  
  @Test
  public void testSetWithReservation() {
	    final Set<Reservation> testInstance = new HashSet<Reservation>();
	    Reservation value1 = new Reservation();
	    value1.setId(1);
	    value1.setTime("16:00");
	    value1.setPrice(2.0);
	    value1.setSeat(1);
	    testInstance.add(value1);
	    Reservation value2 = new Reservation();
	    value2.setId(2);
	    value2.setTime("17:00");
	    value2.setPrice(3.0);
	    value2.setSeat(2);
	    testInstance.add(value2);
	    assertEquals(2, testInstance.size());
  }
}