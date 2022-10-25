package se.stadafint.nicecleaning_backend.entities;

import se.stadafint.nicecleaning_backend.dto.CleanResponseDTO;

import javax.persistence.*;


@Entity
public class Clean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Varje städning får sitt egna unika ID
    private int id;

    @Column(nullable = false)
    // Städtidens bokade datum. Planen är att göra om denna till en LocalDate sen
    private String date;

    @Column(nullable = false)
    //Städtidens bokade tid. Planen är att göra om denna till en LocalTime sen
    private String time;

    @Column(nullable = false)
    // Visar vilken status som städningen har.
    // 0 är aktiv, ännu ej klar. 1 är avklarad, 2 är inställd, 3 är godkänd, 4 är underkänd.
    private int status = 0;

    @Column
    // Ett id per städare. 0 betyder att ingen accepterat ditt pass
    private int cleanerId = 0;

    @Column
    private String optionalMessage;

    @ManyToOne
    private AppUser appUser;

    public Clean(String date, String time, String optionalMessage, int cleanerId, int status, AppUser appUser) {
        this.date = date;
        this.time = time;
        this.optionalMessage = optionalMessage;
        this.status = status;
        this.cleanerId = cleanerId;
        this.appUser = appUser;
    }

    public Clean(){

    }

    public CleanResponseDTO toResponseDTO() {
        return new CleanResponseDTO(id, date, time, optionalMessage, status, appUser.getId());
    }
    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int whatIsStatus() {
        return status;
    }

    public AppUser getUser() {
        return appUser;
    }


}
