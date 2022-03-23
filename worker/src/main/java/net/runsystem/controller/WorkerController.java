package net.runsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description:
 *
 * @author: GMO_ThanhND
 * @version: 1.0
 * @since 3/23/2022 5:12 PM
 */
@Controller
public class WorkerController {
 @GetMapping("/worker")
 public String workerPage(){
  return "worker-home";
 }
}
