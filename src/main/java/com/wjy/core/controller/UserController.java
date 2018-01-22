package com.wjy.core.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wjy.core.domain.User;
import com.wjy.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/user")
public class UserController {

        @Autowired
        private IUserService userService;

        @RequestMapping("/showUser")
        public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            long userId = Long.parseLong(request.getParameter("id"));
            User user = this.userService.selectUser(userId);
            ObjectMapper mapper = new ObjectMapper();
            response.getWriter().write(mapper.writeValueAsString(user));
            response.getWriter().close();
        }

}



