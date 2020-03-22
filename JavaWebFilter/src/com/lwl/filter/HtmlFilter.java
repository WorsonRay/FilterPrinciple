package com.lwl.filter;

public class HtmlFilter implements Filter{
/*
	@Override
	public String doFilter(String msg) {
		
		return msg.replace("<","[")
				.replace(">","]");
	}*/

	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		request.setRequsetStr(request.getRequsetStr().replace("<","[")
				.replace(">","]"));
		
		chain.doFilter(request, response, chain);
		
		response.setResponseStr(response.getResponseStr()+"----HtmlFilter");
		
	}

}
