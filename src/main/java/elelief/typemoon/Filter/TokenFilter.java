package elelief.typemoon.Filter;

import elelief.typemoon.utils.CurrentHolder;
import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import static elelief.typemoon.utils.Jwtutil.parseToken;

@WebFilter(urlPatterns = "/*")
public class TokenFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String requestURI = request.getRequestURI();
        if (requestURI.contains("/login") || requestURI.contains("/logout") || requestURI.contains("/register") || requestURI.contains("/res")) {
            filterChain.doFilter(request, response);
            return;
        }

        String token = request.getHeader("token");

        if (token == null || token.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

        try {
            Claims claims = parseToken(token);
            Integer id = Integer.valueOf(claims.get("id").toString());
            CurrentHolder.setCurrent(id);
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }
      try {
          filterChain.doFilter(request, response);
      }
     finally {
            CurrentHolder.removeCurrent();
        }
    }
}
