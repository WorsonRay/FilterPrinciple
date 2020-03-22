package com.lwl.filter;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestMin {

	public static void main(String[] args) {

		String str = "大家好:) 被就业，敏感，阿里斯顿副科级啊岁的<，>";

		Request request = new Request();
		Response response = new Response();

		request.setRequsetStr(str);
		response.setResponseStr("responseText");

		/*
		 * MessageProcessor mp = new MessageProcessor(); mp.setMsg(str);
		 */
		FilterChain fc = new FilterChain();
		fc.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
		fc.doFilter(request, response, fc);

		System.out.print(request.getRequsetStr());
		System.out.print(response.getResponseStr());

	}
}
