package ask;

    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import services.AskService;
import ask.models.Ask;

    @Controller
    public class IndexController {

    	@Autowired
        private AskService askService;
    	
    	
        @RequestMapping("/")
        public String index(Model model) {
        	model.addAttribute("posts", askService.getRecentAsk());
            return "index";
        }
        @RequestMapping("/Register")
        public String register() {
        	
            return "Register";
        }
       
       /* @RequestMapping("/Register")
        public String formRegister() {
        	//TODO
            return "Register";
        }*/
    }