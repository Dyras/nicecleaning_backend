package se.stadafint.nicecleaning_backend.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "siteUser", cascade = CascadeType.ALL)
    private List<Clean> cleans;

    public SiteUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public SiteUser() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

}