package com.jhsystems.colosseum.service;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by LeeJangHyeop on 2017. 7. 18..
 */

@Component
public class ColosseumAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response, AuthenticationException authException)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        System.out.println("!!");
        //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "�α����� �ʿ��մϴ�.");
    }
}