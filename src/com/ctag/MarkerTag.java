package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class MarkerTag extends BodyTagSupport {

	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_BUFFERED;// bodyContent
	}

	@Override
	public int doAfterBody() throws JspException {

		String bodyData = getBodyContent().getString();

		JspWriter out = getBodyContent().getEnclosingWriter();//

		try {
			out.print("<font color=" + color + ">" + bodyData + "</font>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}

}
