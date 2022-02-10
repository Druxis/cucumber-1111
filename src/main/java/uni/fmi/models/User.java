package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class User {

    private String name;
    private String surname;
    private String email;
    private Set<Reservation> reservation;
    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */


    /**
     * 
     */
    public void Operation1() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return name;
    }

    /**
     * @return
     */
    public String getSurname() {
        // TODO implement here
        return surname;
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * @param surname 
     * @return
     */
    public void setSurname(String surname) {
        this.surname=surname;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email=email;
    }

    /**
     * @return
     */
    public Set<Reservation> getReservations() {
        // TODO implement here
        return reservation;
    }

    /**
     * @param reservations 
     * @return
     */
    public void setReservations(Set<Reservation> reservations) {
        this.reservation=reservations;
    }

}