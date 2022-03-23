package net.runsystem.controller;

import net.runsystem.domain.StaffEntity;
import net.runsystem.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description:
 *
 * @author: GMO_ThanhND
 * @version: 1.0
 * @since 3/23/2022 4:52 PM
 */
@Controller
public class PatientController {
 @Autowired
 private StaffRepository staffRepository;

 @GetMapping("/patient")
 public String patientPage(){
  return "patient-home";
 }

 @GetMapping("/patient-list")
 @ResponseBody
 public List<StaffEntity> getAllPatients(){
  return staffRepository.findAll();
 }
}
