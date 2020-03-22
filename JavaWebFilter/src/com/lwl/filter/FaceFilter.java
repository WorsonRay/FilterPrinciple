package com.lwl.filter;

public class FaceFilter implements Filter {

/*	@Override
	public String doFilter(String msg) {
		return msg.replace(":)", "^_^");
	}
*/
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequsetStr(request.getRequsetStr().replace(":)", "^_^"));
		chain.doFilter(request, response, chain);
		
		response.setResponseStr(response.getResponseStr()+"----FaceFilter");
		
	}

	
}
