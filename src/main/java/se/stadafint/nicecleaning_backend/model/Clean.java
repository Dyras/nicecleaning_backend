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

    @Column(nullable = false)
    private boolean completed = false;

    @ManyToOne
    private SiteUser siteUser;

    public Clean(Date date, Time time, boolean completed, SiteUser siteUser) {
        this.date = date;
        this.time = time;
        this.completed = completed;
        this.siteUser = siteUser;
    }

    public Clean(){

    }
    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public boolean isCompleted() {
        return completed;
    }

    public SiteUser getUser() {
        return siteUser;
    }
}
