package cn.com.leader;
import java.io.IOException;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class MyTaglib extends TagSupport {
	@Override
	public int doEndTag() throws JspException {
		JspWriter out = this.pageContext.getOut();
		try {
			out.println("当前的时间是："+new Date());
		} catch (IOException e) {
			throw new JspException(e);
		}
		return EVAL_PAGE;
	}
	
}
