package springboot.mvc.moviefinder.movie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "theater")
public class Theater {

    @Id
    @Column(name = "theater_id")
    private int theaterId;

    private String name;
    private String address;
    private int capacity;

    public Theater() {}

    // Getters and Setters
    public int getTheaterId() { return theaterId; }
    public void setTheaterId(int theaterId) { this.theaterId = theaterId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
