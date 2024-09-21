package springcourse.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private int year_of_production;

    @ManyToOne
    @JoinColumn(name = "director_id", referencedColumnName = "id")
    private Director owner;

    public Movie() {}

    public Movie(String name, int year_of_production, Director owner) {
        this.name = name;
        this.year_of_production = year_of_production;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public Director getOwner() {
        return owner;
    }

    public void setOwner(Director owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return name;
    }
}
