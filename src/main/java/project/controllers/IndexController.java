package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.models.*;

import javax.jws.WebParam;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by George Stratulat on 16/04/2018.
 */
@Controller
public class IndexController{
        @Autowired
        PatientRepository patientRepo;

        @Autowired
    DateRepository dateRepo;
        @Autowired
    EventRepository eventRepo;
        @Autowired
        TeethRepository teethRepo;

    @GetMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
      mv.getModel().put("patientList", patientRepo.findAll());
        return mv;
    }

    @GetMapping("/patients")
    public ModelAndView getPatients() {
        ModelAndView mv = new ModelAndView("index");
        mv.getModel().put("patientList", patientRepo.findAll());
        return mv;
    }

    @GetMapping("/add_event")
    public ModelAndView doEvent(){
        ModelAndView mv = new ModelAndView("add_event");
        return mv;
    }

    @GetMapping("/khaled")
    public ModelAndView doCalendar() {
        ModelAndView mv = new ModelAndView("calendar");
        mv.getModel().put("dates", dateRepo.findAll());
        return mv;
    }

    @GetMapping(value = "/Add_Patients")
    public ModelAndView addPatients(){
        ModelAndView mv = new ModelAndView("add_patients");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value="/greeting", method = RequestMethod.GET)
    public String Greeting(){
        return "Message From SpringBoot Service - Hello World!";
    }



    @GetMapping(value = "/teeth")
    public ModelAndView getTeeth(){
        ModelAndView mv = new ModelAndView("teeth.html");
        return mv;
    }

    @GetMapping(value = "/Get_Calendar")
    public ModelAndView getCalendar(){
        ModelAndView mv = new ModelAndView("jsoncalendar.html");
        return mv;
    }

    @PostMapping(value= "/Add_Patient")
    public ModelAndView doSave(@RequestParam(name="name") String name, @RequestParam(name="affections") String affections,
                               @RequestParam(name="cpr") String cpr, @RequestParam(name="email") String email,
                               @RequestParam(name="phone_number") String phone_number){
    Patient patient = new Patient(name, affections, cpr, email, phone_number);
    patientRepo.save(patient);
    Teeth teeth = new Teeth();
    teeth.setId(patient.getId());
    teethRepo.save(teeth);
    ModelAndView mv = new ModelAndView("redirect:/");
    return mv;
    }

    @PostMapping(value = "/add_event")
    public ModelAndView add_event(@RequestParam(name = "name") String name, @RequestParam(name = "startTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startTime,
                                  @RequestParam(name = "endTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endTime){
        Date date = new Date(name, startTime, endTime);
        dateRepo.save(date);
        ModelAndView mv = new ModelAndView("add_event");
        return mv;
    }

    @GetMapping(value="/edit")
    public ModelAndView edit(@RequestParam(name="id") int id){
        ModelAndView mv = new ModelAndView("edit");
        mv.getModel().put("patient", patientRepo.findById(id).orElse(null));
        return mv;
    }

    @GetMapping(value="/view")
    public ModelAndView view(@RequestParam(name="id") int id){
        ModelAndView mv = new ModelAndView("view");
        mv.getModel().put("patient", patientRepo.findById(id).orElse(null));
        Patient patient = patientRepo.findById(id).orElse(null);

        List<Event> eventList = new ArrayList<Event>();

            for(Event event : eventRepo.findAll()){
                if(event.getTitle().equals(patient.getName())){
                    eventList.add(event);
                }

        }
        mv.getModel().put("eventList", eventList);
        return mv;
    }

    @GetMapping(value = "/teethtest")
    public ModelAndView getTeethTest(@RequestParam(name="id") int id){
        ModelAndView mv = new ModelAndView("teethtest.html");
        mv.getModel().put("patient", patientRepo.findById(id).orElse(null));
        return mv;
    }


    @RequestMapping(value = "/saveEdit", method = RequestMethod.POST)
    public ModelAndView saveEdit(@RequestParam(name="id") int id, @RequestParam(name="name") String name, @RequestParam(name="affections") String affections,
                                 @RequestParam(name="cpr") String cpr, @RequestParam(name="email") String email,
                                 @RequestParam(name="phone_number") String phone_number){
        ModelAndView mv = new ModelAndView("redirect:/");
        Patient patient = patientRepo.findById(id).orElse(null);
        patient.setAffections(affections);
        patient.setCpr(cpr);
        patient.setEmail(email);
        patient.setName(name);
        patient.setPhone_number(phone_number);
        patientRepo.save(patient);
        return mv;
    }

    @RequestMapping(value="/delete", method = RequestMethod.GET)
    public ModelAndView delete(@RequestParam(name="id") int id){
        patientRepo.delete(patientRepo.findById(id).orElse(null));
        ModelAndView mv = new ModelAndView("redirect:/");
        return mv;
    }

}
