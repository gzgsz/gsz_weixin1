package org.gsz.course.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gsz.course.service.CoreService;
import org.gsz.course.util.SignUtil;

/**
 * Servlet implementation class CoreServlet
 */
public class CoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @ 确认请求来自微信服务器
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//微信加密签名
		String signature = request.getParameter("signature");
		//验证时间戳
		String timestamp = request.getParameter("timestamp");
		//验证随机数
		String nonce = request.getParameter("nonce");
		//验证随机字符串
		String echostr = request.getParameter("echostr");
		
		PrintWriter out = response.getWriter();
		
		//通过检验signature 对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
		
		if(SignUtil.checkSignature(signature, timestamp, nonce)){
			out.print(echostr);
		}
		out.close();
		
		out = null;
		
	}

	/**
	 * @ 处理微信服务器发来的请求 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 将请求、响应的编码均设置为UTF-8，防止中文乱码
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//调用核心业务类，请求信息、处理信息
		String respMessage = CoreService.processRequest(request);
		
		//响应信息
		PrintWriter out = response.getWriter();
		out.print(respMessage);
		out.close();
		
	}

}
