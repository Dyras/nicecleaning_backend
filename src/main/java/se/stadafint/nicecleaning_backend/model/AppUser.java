package se.stadafint.nicecleaning_backend.model;

import se.stadafint.nicecleaning_backend.dto.AppUserResponseDTO;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "appUser", cascade = CascadeType.ALL)
    private List<Clean> cleans;

    public AppUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AppUser() {

    }

    public AppUserResponseDTO toResponseDTO(){
        return new AppUserResponseDTO(id, email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

}