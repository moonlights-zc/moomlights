package fileter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/*")
public class generalFilter implements Filter {
    /**
     * 此类为的是适配请求传参数的字符集和格式问题
     * 所有的请求都要经过适配
     * */
    @Override

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException, ServletException {
        //处理字符集，全工程默认字符集为UTF-8
        servletRequest.setCharacterEncoding("UTF-8");



        filterChain.doFilter(servletRequest,servletResponse);

    }





}
