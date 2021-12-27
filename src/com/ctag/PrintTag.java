package com.ctag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

//Tag interface 
//TagSupport class 
public class PrintTag extends TagSupport {

	String name;
	int count;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int doStartTag() throws JspException {

		JspWriter out = pageContext.getOut();

		for (int i = 1; i <= count; i++) {
			try {
				out.print(name + "<br>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return EVAL_BODY_INCLUDE;

		// SKIP_BODY#
		// EVAL_BODY_INCLUDE
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_PAGE;
		// SKIP_PAGE
		// EVAL_PAGE#
	}
}
