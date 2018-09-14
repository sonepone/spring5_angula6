package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name"   , required = false, defaultValue = "Sone Pone")      String name
                          ,@RequestParam(name = "prezime", required = false, defaultValue = "nema prezimena") String pPrezime
                          , Model model)
    {
        model.addAttribute("name"   , name);
        model.addAttribute("prezime", pPrezime);

        return "greeting";
    }

}
