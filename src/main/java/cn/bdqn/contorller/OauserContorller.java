package cn.bdqn.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class OauserContorller {
    @RequestMapping("/test")
    public ModelAndView Tests(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    @RequestMapping("/metting")
    public ModelAndView metting(){
        ModelAndView mv = new ModelAndView("metting");
        return mv;
    }
    @RequestMapping("/usingcar")
    public ModelAndView using(){
        ModelAndView mv = new ModelAndView("usingcar");
        return mv;
    }
}
