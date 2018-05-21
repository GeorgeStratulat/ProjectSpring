package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.models.*;

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
    @Autowired
    TeethRepository teethRepo;

    @GetMapping("/api/teeths")
    public ResponseEntity<List<Teeth>> getAllTeeths(){
        List<Teeth> teeths = new ArrayList<>();
        for(Teeth teeth : teethRepo.findAll()){
            teeths.add(teeth);
        }
        return ResponseEntity.ok().body(teeths);
    }

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

    @DeleteMapping("/api/patient/{id}/")
    public ResponseEntity<?> deletePatient(@PathVariable("id") int id){
        patientRepo.delete(patientRepo.findById(id).orElse(null));
        return ResponseEntity.ok().body("Patient with id " + id + " has been deleted successfully");
    }

    @GetMapping("/api/patient/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable("id") int id){
        Patient patient = patientRepo.findById(id).orElse(null);
        return ResponseEntity.ok().body(patient);
    }

    @GetMapping("/api/teeth/{id}")
    public ResponseEntity<Teeth> getTeeth(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        return ResponseEntity.ok().body(teeth);
    }

    @GetMapping("/api/teeth/{id}/t12")
    public ResponseEntity<?> getToothT12(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t12 = teeth.getT12();

        return ResponseEntity.ok().body(t12);
    }



    @PostMapping("/api/teeth/{id}/t12")
    public ResponseEntity<?>  updateToothT12(@PathVariable("id") int id, @RequestParam String t12){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT12(t12);
        System.out.println(t12);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t12 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t13")
    public ResponseEntity<?> getToothT13(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t13 = teeth.getT13();

        return ResponseEntity.ok().body(t13);
    }



    @PostMapping("/api/teeth/{id}/t13")
    public ResponseEntity<?>  updateToothT13(@PathVariable("id") int id, @RequestParam String t13){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT13(t13);
        System.out.println(t13);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t13 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t14")
    public ResponseEntity<?> getToothT14(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t14 = teeth.getT14();

        return ResponseEntity.ok().body(t14);
    }



    @PostMapping("/api/teeth/{id}/t14")
    public ResponseEntity<?>  updateToothT14(@PathVariable("id") int id, @RequestParam String t14){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT14(t14);
        System.out.println(t14);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t14 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t15")
    public ResponseEntity<?> getToothT15(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t15 = teeth.getT15();

        return ResponseEntity.ok().body(t15);
    }



    @PostMapping("/api/teeth/{id}/t15")
    public ResponseEntity<?>  updateToothT15(@PathVariable("id") int id, @RequestParam String t15){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT15(t15);
        System.out.println(t15);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t15 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t16")
    public ResponseEntity<?> getToothT16(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t16 = teeth.getT16();

        return ResponseEntity.ok().body(t16);
    }



    @PostMapping("/api/teeth/{id}/t16")
    public ResponseEntity<?>  updateToothT16(@PathVariable("id") int id, @RequestParam String t16){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT16(t16);
        System.out.println(t16);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t16 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t17")
    public ResponseEntity<?> getToothT17(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t17 = teeth.getT17();

        return ResponseEntity.ok().body(t17);
    }



    @PostMapping("/api/teeth/{id}/t17")
    public ResponseEntity<?>  updateToothT17(@PathVariable("id") int id, @RequestParam String t17){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT17(t17);
        System.out.println(t17);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t17 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t18")
    public ResponseEntity<?> getToothT18(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t18 = teeth.getT18();

        return ResponseEntity.ok().body(t18);
    }



    @PostMapping("/api/teeth/{id}/t18")
    public ResponseEntity<?>  updateToothT18(@PathVariable("id") int id, @RequestParam String t18){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT18(t18);
        System.out.println(t18);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t18 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t21")
    public ResponseEntity<?> getToothT21(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t21 = teeth.getT21();

        return ResponseEntity.ok().body(t21);
    }



    @PostMapping("/api/teeth/{id}/t21")
    public ResponseEntity<?>  updateToothT21(@PathVariable("id") int id, @RequestParam String t21){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT21(t21);
        System.out.println(t21);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t21 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t22")
    public ResponseEntity<?> getToothT22(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t22 = teeth.getT22();

        return ResponseEntity.ok().body(t22);
    }



    @PostMapping("/api/teeth/{id}/t22")
    public ResponseEntity<?>  updateToothT22(@PathVariable("id") int id, @RequestParam String t22){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT22(t22);
        System.out.println(t22);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t22 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t23")
    public ResponseEntity<?> getToothT23(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t23 = teeth.getT23();

        return ResponseEntity.ok().body(t23);
    }



    @PostMapping("/api/teeth/{id}/t23")
    public ResponseEntity<?>  updateToothT23(@PathVariable("id") int id, @RequestParam String t23){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT23(t23);
        System.out.println(t23);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t23 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t24")
    public ResponseEntity<?> getToothT24(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t24 = teeth.getT24();

        return ResponseEntity.ok().body(t24);
    }



    @PostMapping("/api/teeth/{id}/t24")
    public ResponseEntity<?>  updateToothT24(@PathVariable("id") int id, @RequestParam String t24){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT24(t24);
        System.out.println(t24);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t24 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t25")
    public ResponseEntity<?> getToothT25(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t25 = teeth.getT25();

        return ResponseEntity.ok().body(t25);
    }



    @PostMapping("/api/teeth/{id}/t25")
    public ResponseEntity<?>  updateToothT25(@PathVariable("id") int id, @RequestParam String t25){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT25(t25);
        System.out.println(t25);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t25 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t26")
    public ResponseEntity<?> getToothT26(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t26 = teeth.getT26();

        return ResponseEntity.ok().body(t26);
    }



    @PostMapping("/api/teeth/{id}/t26")
    public ResponseEntity<?>  updateToothT26(@PathVariable("id") int id, @RequestParam String t26){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT26(t26);
        System.out.println(t26);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t26 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t27")
    public ResponseEntity<?> getToothT27(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t27 = teeth.getT27();

        return ResponseEntity.ok().body(t27);
    }



    @PostMapping("/api/teeth/{id}/t27")
    public ResponseEntity<?>  updateToothT27(@PathVariable("id") int id, @RequestParam String t27){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT27(t27);
        System.out.println(t27);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t27 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t28")
    public ResponseEntity<?> getToothT28(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t28 = teeth.getT28();

        return ResponseEntity.ok().body(t28);
    }



    @PostMapping("/api/teeth/{id}/t28")
    public ResponseEntity<?>  updateToothT28(@PathVariable("id") int id, @RequestParam String t28){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT28(t28);
        System.out.println(t28);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t28 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t31")
    public ResponseEntity<?> getToothT31(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t31 = teeth.getT31();

        return ResponseEntity.ok().body(t31);
    }



    @PostMapping("/api/teeth/{id}/t31")
    public ResponseEntity<?>  updateToothT31(@PathVariable("id") int id, @RequestParam String t31){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT31(t31);
        System.out.println(t31);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t31 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t32")
    public ResponseEntity<?> getToothT32(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t32 = teeth.getT32();

        return ResponseEntity.ok().body(t32);
    }



    @PostMapping("/api/teeth/{id}/t32")
    public ResponseEntity<?>  updateToothT32(@PathVariable("id") int id, @RequestParam String t32){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT32(t32);
        System.out.println(t32);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t32 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t33")
    public ResponseEntity<?> getToothT33(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t33 = teeth.getT33();

        return ResponseEntity.ok().body(t33);
    }



    @PostMapping("/api/teeth/{id}/t33")
    public ResponseEntity<?>  updateToothT33(@PathVariable("id") int id, @RequestParam String t33){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT33(t33);
        System.out.println(t33);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t33 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t34")
    public ResponseEntity<?> getToothT34(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t34 = teeth.getT34();

        return ResponseEntity.ok().body(t34);
    }



    @PostMapping("/api/teeth/{id}/t34")
    public ResponseEntity<?>  updateToothT34(@PathVariable("id") int id, @RequestParam String t34){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT34(t34);
        System.out.println(t34);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t34 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t35")
    public ResponseEntity<?> getToothT35(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t35 = teeth.getT35();

        return ResponseEntity.ok().body(t35);
    }



    @PostMapping("/api/teeth/{id}/t35")
    public ResponseEntity<?>  updateToothT35(@PathVariable("id") int id, @RequestParam String t35){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT35(t35);
        System.out.println(t35);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t35 has been modified");
    }

    @GetMapping("/api/teeth/{id}/t36")
    public ResponseEntity<?> getToothT36(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t36 = teeth.getT36();

        return ResponseEntity.ok().body(t36);
    }



    @PostMapping("/api/teeth/{id}/t36")
    public ResponseEntity<?>  updateToothT36(@PathVariable("id") int id, @RequestParam String t36){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT36(t36);
        System.out.println(t36);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t36 has been modified");
    }
    @GetMapping("/api/teeth/{id}/t37")
    public ResponseEntity<?> getToothT37(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t37 = teeth.getT37();

        return ResponseEntity.ok().body(t37);
    }



    @PostMapping("/api/teeth/{id}/t37")
    public ResponseEntity<?>  updateToothT37(@PathVariable("id") int id, @RequestParam String t37){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT37(t37);
        System.out.println(t37);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t37 has been modified");
    }@GetMapping("/api/teeth/{id}/t38")
    public ResponseEntity<?> getToothT38(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t38 = teeth.getT38();

        return ResponseEntity.ok().body(t38);
    }



    @PostMapping("/api/teeth/{id}/t38")
    public ResponseEntity<?>  updateToothT38(@PathVariable("id") int id, @RequestParam String t38){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT38(t38);
        System.out.println(t38);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t38 has been modified");
    }@GetMapping("/api/teeth/{id}/t41")
    public ResponseEntity<?> getToothT41(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t41 = teeth.getT41();

        return ResponseEntity.ok().body(t41);
    }



    @PostMapping("/api/teeth/{id}/t41")
    public ResponseEntity<?>  updateToothT41(@PathVariable("id") int id, @RequestParam String t41){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT41(t41);
        System.out.println(t41);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t41 has been modified");
    }


    @PostMapping("/api/teeth/{id}/t42")
    public ResponseEntity<?>  updateToothT42(@PathVariable("id") int id, @RequestParam String t42){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT42(t42);
        System.out.println(t42);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t42 has been modified");
    }@GetMapping("/api/teeth/{id}/t42")
    public ResponseEntity<?> getToothT42(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t42 = teeth.getT42();

        return ResponseEntity.ok().body(t42);
    }



    @PostMapping("/api/teeth/{id}/t43")
    public ResponseEntity<?>  updateToothT43(@PathVariable("id") int id, @RequestParam String t43){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT43(t43);
        System.out.println(t43);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t43 has been modified");
    }@GetMapping("/api/teeth/{id}/t43")
    public ResponseEntity<?> getToothT43(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t43 = teeth.getT43();

        return ResponseEntity.ok().body(t43);
    }



    @PostMapping("/api/teeth/{id}/t44")
    public ResponseEntity<?>  updateToothT44(@PathVariable("id") int id, @RequestParam String t44){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT44(t44);
        System.out.println(t44);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t44 has been modified");
    }@GetMapping("/api/teeth/{id}/t44")
    public ResponseEntity<?> getToothT44(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t44 = teeth.getT44();

        return ResponseEntity.ok().body(t44);
    }



    @PostMapping("/api/teeth/{id}/t45")
    public ResponseEntity<?>  updateToothT45(@PathVariable("id") int id, @RequestParam String t45){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT45(t45);
        System.out.println(t45);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t45 has been modified");
    }@GetMapping("/api/teeth/{id}/t45")
    public ResponseEntity<?> getToothT45(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t45 = teeth.getT45();

        return ResponseEntity.ok().body(t45);
    }



    @PostMapping("/api/teeth/{id}/t46")
    public ResponseEntity<?>  updateToothT46(@PathVariable("id") int id, @RequestParam String t46){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT46(t46);
        System.out.println(t46);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t46 has been modified");
    }@GetMapping("/api/teeth/{id}/t46")
    public ResponseEntity<?> getToothT46(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t46 = teeth.getT46();

        return ResponseEntity.ok().body(t46);
    }



    @PostMapping("/api/teeth/{id}/t47")
    public ResponseEntity<?>  updateToothT47(@PathVariable("id") int id, @RequestParam String t47){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT47(t47);
        System.out.println(t47);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t47 has been modified");
    }
    @GetMapping("/api/teeth/{id}/t47")
    public ResponseEntity<?> getToothT47(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t47 = teeth.getT47();

        return ResponseEntity.ok().body(t47);
    }



    @PostMapping("/api/teeth/{id}/t48")
    public ResponseEntity<?>  updateToothT48(@PathVariable("id") int id, @RequestParam String t48){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        teeth.setT48(t48);
        System.out.println(t48);
        teethRepo.save(teeth);
        return ResponseEntity.ok().body("Tooth t48 has been modified");
    }@GetMapping("/api/teeth/{id}/t48")
    public ResponseEntity<?> getToothT48(@PathVariable("id") int id){
        Teeth teeth = teethRepo.findById(id).orElse(null);
        String t48 = teeth.getT48();

        return ResponseEntity.ok().body(t48);
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
