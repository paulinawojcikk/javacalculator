package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.controller;

/**
 * Import section
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models.CalculatorAverage;
import pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models.CalculatorSimple;
import pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models.OperationModel;

/**
 * Control main page containing descriptions and calculator exercise
 */
@Controller
public class CalculatorController {

    /**
     * Declarations
     */
    @Autowired CalculatorSimple calculatorSimple;
    @Autowired CalculatorAverage calculatorAverage;
    OperationModel operationModel = new OperationModel();

    /**
     * Method geting main page, provide user inputs as operation model
     * @param model to add user inputs
     * @return filled user inputs
     */
    @GetMapping("/")
    public String indexGet(Model model){
        model.addAttribute("operationModel", operationModel);
        return "index";
    }

    /**
     * Method responsible for adding predefined user inputs
     * @param operationModel holding user inputs
     * @param model holding calculations
     * @return calculated result
     */
    @RequestMapping(params = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.add(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    /**
     * Method responsible for subtract predefined user inputs
     * @param operationModel holding user inputs
     * @param model holding calculations
     * @return calculated result
     */
    @RequestMapping(params = "sub", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.subtract(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    /**
     * Method responsible for multiply predefined user inputs
     * @param operationModel holding user inputs
     * @param model holding calculations
     * @return calculated result
     */
    @RequestMapping(params = "mul", method = RequestMethod.POST)
    public String multiplication(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.multiplication(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    /**
     * Method responsible for divide predefined user inputs
     * @param operationModel holding user inputs
     * @param model holding calculations
     * @return calculated result
     */
    @RequestMapping(params = "div", method = RequestMethod.POST)
    public String division(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.division(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    /**
     * Method responsible for to square predefined user input
     * @param operationModel holding user inputs
     * @param model holding calculations
     * @return calculated result
     */
    @RequestMapping(params = "sqr", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorAverage.squareOf(operationModel.getA()));
        return "index";
    }

    /**
     * Method responsible for element of predefined user input
     * @param operationModel holding user inputs
     * @param model holding calculations
     * @return calculated result
     */
    @RequestMapping(params = "ele", method = RequestMethod.POST)
    public String elementOf(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorAverage.elementOf(operationModel.getA()));
        return "index";
    }

    /**
     * Method responsible for check is predefined user input is prime number
     * @param operationModel holding user inputs
     * @param model holding calculations
     * @return calculated result
     */
    @RequestMapping(params = "prm", method = RequestMethod.POST)
    public String prime(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorAverage.isPrimeNumber(operationModel.getA()));
        return "index";
    }

    /**
     * Method responsible for factorial of predefined user input
     * @param operationModel holding user inputs
     * @param model holding calculations
     * @return calculated result
     */
    @RequestMapping(params = "fac", method = RequestMethod.POST)
    public String factorial(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorAverage.factorial(operationModel.getA()));
        return "index";
    }
}
