package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.controller;

/**
 * Import section
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models.Person;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

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

    //@ResponseBody
    @GetMapping("/random")
    public String getRandom(ModelMap map){
        Set<Integer> lotto = new TreeSet<>();
        Random random = new Random();

        while (lotto.size() != 6) {
            lotto.add(random.nextInt(49)+1);
        }

        map.put("lotto", lotto);  //dorzuca nazwę klucza i wartość




        return "random"; //bez responsebody szuka pliku random.htm, który musi znajdować się w kataogu templates
    }

    @GetMapping ("/form")
    public String getForm() {
        return "form";
    }

    @GetMapping ("/result")
    public String result(@RequestParam      //adnotacja
                         String firstName,
                         @RequestParam String lastName,
                         ModelMap modelMap) {
        Person person = new Person(firstName,lastName);
        modelMap.put("person",person);

        return "person"; //jaki plok html ma być wyświetlony

    }





}
