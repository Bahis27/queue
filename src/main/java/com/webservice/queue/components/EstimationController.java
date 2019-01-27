package com.webservice.queue.components;

import com.webservice.queue.dto.EmployeeEstimationDTO;
import com.webservice.queue.services.EstimationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EstimationController {
    @Autowired
    private EstimationService estimationService;

    @GetMapping("/employee/{id}")
    public EmployeeEstimationDTO getEmployeeEstimationDTO(@PathVariable("id") int id){
        return estimationService.getEmployeeEstimation(id);
    }

    @GetMapping("/employee/{id}/bad")
    public void increaseBadEstimation(@PathVariable("id") int id){
        estimationService.increaseBadEstimation(id);
    }

    @GetMapping("/employee/{id}/middle")
    public void increaseMiddleEstimation(@PathVariable("id") int id){
         estimationService.increaseMiddleEstimation(id);
    }
    /*@RequestMapping(value = "/parts/update", method = RequestMethod.POST)
    public String updatePart(@ModelAttribute("part") Part part) {
        this.partsService.updatePart(part);
        return "redirect:/redirect";
    }*/

    @GetMapping("/employee/{id}/good")
    public void increaseGoodEstimation(@PathVariable("id") int id){
         estimationService.increaseGoodEstimation(id);
    }
}
