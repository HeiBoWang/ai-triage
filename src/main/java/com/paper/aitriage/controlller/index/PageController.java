package com.paper.aitriage.controlller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统首页相关接口
 *
 * @author wangyongpeng11
 * @date 2020-04-01 21:44
 */
@RequestMapping("/page")
@Controller
public class PageController {
    /**
     * 首页的导航页
     * @return
     */
    @RequestMapping("/indexPage")
    public ModelAndView indexPage(){
        Map map = new HashMap();
        map.put("successFlag","欢迎来到智能导诊系统");
        return new ModelAndView("/index/index",map);
    }

    /**
     * 问诊页的导航页
     * @return
     */
    @RequestMapping("/diagPage")
    public ModelAndView diagPage(){
        Map map = new HashMap();
        map.put("successFlag","欢迎问诊");
        return new ModelAndView("/diag/index",map);
    }

}
