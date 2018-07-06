package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.controller;

/**
 * Import section
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DescController {

    /**
     * Method responsible to get description template
     * @return template with image containing description of exercise
     */
    @GetMapping("/desc")
    public String descGet(){
        return "desc";
    }

}
