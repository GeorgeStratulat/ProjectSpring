package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.models.Event;
import project.models.EventRepository;
import project.models.Patient;
import project.models.PatientRepository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by George Stratulat on 16/05/2018.
 */

@RestController
public class RESTfulController {
    @Autowired
    EventRepository eventRepo;
    @Autowired
    PatientRepository patientRepo;

    @GetMapping("/api/patients")
    public ResponseEntity<List<Patient>> getAllPatients(){
        List<Patient> patients = new ArrayList<>();
        for(Patient patient : patientRepo.findAll()){
            patients.add(patient);
        }
        return ResponseEntity.ok().body(patients);
    }

    @PostMapping("/api/patient")
    public ResponseEntity<?> savePatient(@RequestBody Patient patient){
        patientRepo.save(patient);
        return ResponseEntity.ok().body("New patient has been added with ID: " + patient.getId());
    }

    @DeleteMapping("/api/patient/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable("id") int id){
        patientRepo.delete(patientRepo.findById(id).orElse(null));
        return ResponseEntity.ok().body("Patient with id " + id + " has been deleted successfully");
    }

    @GetMapping("/api/patient/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable("id") int id){
        Patient patient = patientRepo.findById(id).orElse(null);
        return ResponseEntity.ok().body(patient);
    }

    @PutMapping("/api/patient/{id}")
    public ResponseEntity<?> updatePatient(@PathVariable("id") int id, @RequestBody Patient patient2){
        Patient patient = patientRepo.findById(id).orElse(null);
        patient.setAffections(patient2.getAffections());
        patient.setCpr(patient2.getCpr());
        patient.setEmail(patient2.getEmail());
        patient.setName(patient2.getName());
        patient.setPhone_number(patient2.getPhone_number());
        patientRepo.save(patient);
        return ResponseEntity.ok().body("Patient with id " + id + " has been updated successfully");
    }

    @PutMapping("/api/event/{id}")
    public ResponseEntity<?> updateEvent(@PathVariable("id") long id, @RequestBody Event event2){
        Event event = eventRepo.findById(id).orElse(null);
        event.setTitle(event2.getTitle());
        event.setDescription(event2.getDescription());
        event.setStart(event2.getStart());
        event.setEnd(event2.getEnd());
        eventRepo.save(event);
        return ResponseEntity.ok().body("Event with id " + id + " has been updated successfully");
    }

    @GetMapping("/api/events")
    public ResponseEntity<List<Event>> getAllEvents(){
        List<Event> events = new ArrayList<>();
        for(Event event : eventRepo.findAll()){
            events.add(event);
        }
        return ResponseEntity.ok().body(events);
    }

    @PostMapping("/api/event")
    public ResponseEntity<?> saveEvent(@RequestBody Event event){
        eventRepo.save(event);
        return ResponseEntity.ok().body("New event has been added with ID: " + event.getId());
    }

    @DeleteMapping("/api/event/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable("id") long id){
        eventRepo.delete(eventRepo.findById(id).orElse(null));
        return ResponseEntity.ok().body("Event with id " + id + " has been deleted successfully");
    }

    @GetMapping("/api/event/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable("id") long id){
        Event event = eventRepo.findById(id).orElse(null);
        return ResponseEntity.ok().body(event);
    }


}
