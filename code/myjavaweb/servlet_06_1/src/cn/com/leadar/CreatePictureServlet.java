package cn.com.leadar;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.sun.image.codec.jpeg.JPEGCodec;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreatePictureServlet extends HttpServlet {
	public void destroy() {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		String name = request.getParameter("name");
		//����һ��ͼƬ
		BufferedImage image = new BufferedImage(300,200,BufferedImage.TYPE_INT_RGB);
		Graphics2D g = image.createGraphics();
		g.drawRect(0, 0, 200, 100);
		g.drawString(name, 100, 100);
		
		OutputStream out = response.getOutputStream();
		//��ͼƬת��ΪJPEG����
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		encoder.encode(image);
		out.flush();
		out.close();
	}
	public void init() throws ServletException {
	}

}
