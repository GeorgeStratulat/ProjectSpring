package project.models;

import javax.persistence.*;
import java.util.*;

/**
 * Created by George Stratulat on 14/05/2018.
 */

@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="title")
    private String title;
    @Column(name="description")
    private String description;

    @Column(name="start")
    private java.util.Date start;

    @Column(name="end")
    private java.util.Date end;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public java.util.Date getStart() {
        return start;
    }
    public void setStart(java.util.Date start) {
        this.start = start;
    }
    public java.util.Date getEnd() {
        return end;
    }
    public void setEnd(java.util.Date end) {
        this.end = end;
    }
    public Event(Long id, String title, String description, java.util.Date start, java.util.Date end) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
        this.start = start;
        this.end = end;
    }
    public Event() {
        super();
    }
    @Override
    public String toString() {
        return "Event [id=" + id + ", title=" + title + ", description="
                + description + ", start=" + start + ", end=" + end + "]";
    }
}
