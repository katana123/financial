package com.wuhan.strongwell.Controller;

import com.wuhan.strongwell.Entity.fusers;
import com.wuhan.strongwell.Service.fusersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class fusersController {
    @Resource
    private fusersService fusersService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        fusers fusers = this.fusersService.selectByPrimaryKey(userId);
        model.addAttribute("user", fusers);
        return "showUser";
    }
}
