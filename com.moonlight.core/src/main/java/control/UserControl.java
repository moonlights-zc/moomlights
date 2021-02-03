package control;



import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

//@WebServlet("/login")
@Controller("userControl")
//@RequestMapping("*User.do")
public class UserControl
//        原生Control类的继承方式
//        extends HttpServlet
{

//
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired()
    UserService userService;


//    @RequestMapping("/loginUser.do")
//    public void login(ServletRequest request, ServletResponse response) {
//
//        response.setCharacterEncoding("GBK");
//        if (!(request.getParameter("account").equals("")&&request.getParameter("password").equals(""))) {
//            System.out.println(request.getParameter("account")!=null&&request.getParameter("password")!=null);
//                Integer account = Integer.valueOf(request.getParameter("account"));
//                String password = request.getParameter("password");
//                try {
//                    if (com.login(new User(account, password))) {
//                        request.getRequestDispatcher("Page/UserExhibition.jsp").forward(request,response);
//                    } else {
//                        response.getWriter().println("失败");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            catch (ServletException e) {
//                e.printStackTrace();
//            }
//        }else{
//
//        }
//    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "forward:index.jsp";
    }
    @RequestMapping("/loginUser.do")
    public String login(User user) {
        if(userService.login(user)) {
            return "UserExhibition.jsp";
        }else{
            return "index.jsp";
        }
    }
}
