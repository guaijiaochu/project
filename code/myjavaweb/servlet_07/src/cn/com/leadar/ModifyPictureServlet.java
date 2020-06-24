package cn.com.leadar;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.sun.image.codec.jpeg.JPEGCodec;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("restriction")
public class ModifyPictureServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("image/jpeg");
		//获得图片的真正地址
		String pic = this.getServletContext().getRealPath("test.jpg");
		//BuffererdImage image= ImageIO.read(new File(pic));
		BufferedImage image= ImageIO.read(new File(pic));
		Graphics2D g = (Graphics2D) image.getGraphics();
		g.setColor(Color.BLACK);
		g.setFont(new Font("宋体",Font.BOLD,25));
		g.drawString("海滩海滩滩", 30, 195);
		
		OutputStream out = response.getOutputStream();
		
		//将图片转换为JPEG类型
		//JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		encoder.encode(image);
		out.flush();
		out.close();

		
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
