package project.models;

import javax.persistence.*;/**
 * Created by George Stratulat on 16/04/2018.
 */
@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Name")
    private String name;
    @Column(name = "Affections")
    private String affections;
    @Column(name = "CPR")
    private String cpr;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone_number")
    private String phone_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAffections() {
        return affections;
    }

    public void setAffections(String affections) {
        this.affections = affections;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Patient(){

    }

    public Patient(String name, String affections, String cpr, String email, String phone_number) {
        this.name = name;
        this.affections = affections;
        this.cpr = cpr;
        this.email = email;
        this.phone_number = phone_number;
    }
}

