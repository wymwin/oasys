package cn.bdqn.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class OauserContorller {
    //首页
    @RequestMapping("/test")
    public ModelAndView Tests(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    //我的桌面
    @RequestMapping("/mydesk")
    public ModelAndView Tmydesk(){
        ModelAndView mv = new ModelAndView("mydesk");
        return mv;
    }
    //会议室管理
    @RequestMapping("/meeting")
    public ModelAndView Tmeeting(){
        ModelAndView mv = new ModelAndView("meeting");
        return mv;
    }
    //用车管理
    @RequestMapping("/usingcar")
    public ModelAndView Tusingcar(){
        ModelAndView mv = new ModelAndView("usingcar");
        return mv;
    }

    //通告管理
    @RequestMapping("/tongao")
    public ModelAndView Tannouncement(){
        ModelAndView mv = new ModelAndView("ancement");
        return mv;
    }
    //文档列表
    @RequestMapping("/notice")
    public ModelAndView Tnotic(){
        ModelAndView mv = new ModelAndView("notice");
        return mv;
    }

    //文档回收站
    @RequestMapping("/noticegc")
    public ModelAndView Tnotocgc(){
        ModelAndView mv = new ModelAndView("noticegc");
        return mv;
    }

    //用章管理
    @RequestMapping("/usingzhang")
    public ModelAndView Tusingzhang(){
        ModelAndView mv = new ModelAndView("usingzhang");
        return mv;
    }

    //图书借阅
    @RequestMapping("/booklook")
    public ModelAndView Tbooklook(){
        ModelAndView mv = new ModelAndView("booklook");
        return mv;
    }

    //用章管理
    @RequestMapping("/usercard")
    public ModelAndView Tusercard(){
        ModelAndView mv = new ModelAndView("usercard");
        return mv;
    }
    //用章管理
    @RequestMapping("/srzm")
    public ModelAndView Tsrzm(){
        ModelAndView mv = new ModelAndView("srzm");
        return mv;
    }
    //请假申请
    @RequestMapping("/holiday")
    public ModelAndView Tholiday(){
        ModelAndView mv = new ModelAndView("holiday");
        return mv;
    }
    //出差申请
    @RequestMapping("/chucai")
    public ModelAndView Tchucai(){
        ModelAndView mv = new ModelAndView("chucai");
        return mv;
    }
}
