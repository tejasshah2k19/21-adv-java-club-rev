package com.stag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SumTag extends SimpleTagSupport {

	int n1;//
	int n2;//

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public void doTag() throws JspException, IOException {

		int ans = n1 + n2;
		// print -->
		getJspContext().getOut().print(ans);
	}

}
