package com.hjl.common.exception;


import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/**
 * 处理异常处理类
 */
public class LogicExceptionResolver extends SimpleMappingExceptionResolver {

    private static Logger logger = LoggerFactory.getLogger(LogicExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {

        logger.error(ex.getMessage(), ex);

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        // Expose ModelAndView for chosen error view.
        String viewName = determineViewName(ex, request);

        if (viewName != null) {

            Object obj = method.getAnnotation(ResponseBody.class);
            if (obj != null) {
                try {
                    String result = "";
                    if (ex instanceof AuthorizationException) {
                       result = "unAuth";
                    } else {
                        result = "system error";
                    }
                    //设置返回类型为json
                    response.setContentType("application/json;charset=UTF-8");
                    response.setHeader("Cache-Control", "no-cache");
                    PrintWriter out = response.getWriter();
                    out.print(result);
                    out.flush();
                } catch (IOException e) {
                    logger.error(e.getMessage(), e);
                }

                return null;
            } else {
                Integer statusCode = determineStatusCode(request, viewName);
                if (statusCode != null) {
                    applyStatusCodeIfPossible(request, response, statusCode);
                }

                logger.error(ex.getMessage(), ex);
                return getModelAndView(viewName, ex, request);
            }
        } else {
            return null;
        }
    }
}
