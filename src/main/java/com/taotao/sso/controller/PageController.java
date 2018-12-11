package com.taotao.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * Author: zhihu
 * Description:
 * Date: Create in 18:42 2018/2/26
 */
@Controller
@RequestMapping("/page")
public class PageController {

        @RequestMapping("/register")
        public String showRegister() {
                return "register";
        }
        @RequestMapping("/login")
        public String showLogin(String redirect, Model model) {
                model.addAttribute("redirect", redirect);
                return "login";
        }
}
