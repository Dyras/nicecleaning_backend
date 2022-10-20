package se.stadafint.nicecleaning_backend.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Clean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Time time;

    @Column(nullable = true)
    private String optionalDescription;

    @Column(nullable = false)
    private boolean completed;

    @ManyToOne
    private User user;

    public Clean(int id, Date date, Time time, String optionalDescription, boolean completed, User user) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.optionalDescription = optionalDescription;
        this.completed = completed;
        this.user = user;
    }

    public Clean(){

    }




}
