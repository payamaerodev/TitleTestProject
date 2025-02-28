package com.test.test.requestHandler;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class CountFilter implements Filter {
    public int count = 1;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException, IOException {

        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7");
        count++;
        request.setAttribute("count", count);
        chain.doFilter(request, response);
    }
}

