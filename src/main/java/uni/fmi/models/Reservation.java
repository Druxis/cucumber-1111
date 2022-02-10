package uni.fmi.models;

/**
 * 
 */
public class Reservation {

    private int id;
    private String time;
    private double price;
    private int seat;
    private Movie movie;
    private User user;
    /**
     * Default constructor
     */
    public Reservation() {
    }

    /**
     * 
     */


    /**
     * @return
     */
    public int getId() {
        // TODO implement here
        return id;
    }

    /**
     * @return
     */
    public String getTime() {
        // TODO implement here
        return time;
    }

    /**
     * @return
     */
    public double getPrice() {
        // TODO implement here
        return price;
    }

    /**
     * @return
     */
    public int getSeat() {
        // TODO implement here
        return seat;
    }

    /**
     * @param id 
     * @return
     */
    public void setId(int id) {
        this.id=id;
    }

    /**
     * @param time 
     * @return
     */
    public void setTime(String time) {
        this.time=time;
    }

    /**
     * @param price 
     * @return
     */
    public void setPrice(double price) {
        this.price=price;
    }

    /**
     * @param seat 
     * @return
     */
    public void setSeat(int seat) {
        this.seat=seat;
    }

    /**
     * @return
     */
    public User getUsers() {
        // TODO implement here
        return user;
    }

    /**
     * @param users 
     * @return
     */
    public void setUsers(User users) {
        this.user=users;
    }

    /**
     * @return
     */
    public Movie getMovies() {
        // TODO implement here
        return movie;
    }

    /**
     * @param movies 
     * @return
     */
    public void setMovies(Movie movies) {
        this.movie=movies;
    }

}