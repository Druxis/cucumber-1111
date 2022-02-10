package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Movie {

    private String title;
    private int duration;
    private String genre;
    private Set<Reservation> reservation;

    /**
     * Default constructor
     */
    public Movie() {
    }
    

    /**
     * @return
     */
    public String getTitle() {
        // TODO implement here
        return title;
    }

    /**
     * @return
     */
    public int getDuration() {
        // TODO implement here
        return duration;
    }

    /**
     * @return
     */
    public String getGenre() {
        // TODO implement here
        return genre;
    }

    /**
     * @param title 
     * @return
     */
    public void setTitle(String title) {
        this.title=title;
    }

    /**
     * @param duration 
     * @return
     */
    public void setDuration(int duration) {
        this.duration=duration;
    }

    /**
     * @param genre 
     * @return
     */
    public void setGenre(String genre) {
        this.genre=genre;
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