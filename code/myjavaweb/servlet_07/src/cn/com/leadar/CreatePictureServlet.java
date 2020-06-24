package cn.com.leadar;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class CreatePictureServlet extends HttpServlet {
	public void destroy() {
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		String name = request.getParameter("name");
		//创建一张图片
		BufferedImage image = new BufferedImage(300,200,BufferedImage.TYPE_INT_RGB);
		Graphics2D g = image.createGraphics();
		g.drawRect(0, 0, 200, 100);
		g.drawString(name, 100, 100);
		
		OutputStream out = response.getOutputStream();
		//将图片转换为JPEG类型
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		encoder.encode(image);
		out.flush();
		out.close();
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}

}
