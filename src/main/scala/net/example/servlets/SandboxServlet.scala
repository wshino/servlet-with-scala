package net.example.servlets

import java.util.logging.Logger
import javax.servlet.http.{HttpServletResponse, HttpServletRequest, HttpServlet}

class SandboxServlet extends HttpServlet {
  override def doGet(request: HttpServletRequest, response: HttpServletResponse) {
    val a = Logger.getLogger("warn")
    a.info("hoge")
    response.setContentType("text/plain")
    response.setCharacterEncoding("UTF-8")
    response.getWriter().write("Hoge")
  }
}