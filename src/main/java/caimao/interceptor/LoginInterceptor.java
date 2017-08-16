package caimao.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 */
@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        //需要登录
        final String token = request.getParameter("token");

        response.setContentType("text/html;charset=UTF-8"); //设置头文件编码是UTF-8，浏览器用utf-8解码
        if (token == null) {
            String string = "未找到对应用户";
            response.getOutputStream().write(string.getBytes());
            return false;
        }

        if (!token.equals("****")) {
            String string = "登录超时";
            response.getOutputStream().write(string.getBytes());
            return false;
        }
        return true;
    }
}
