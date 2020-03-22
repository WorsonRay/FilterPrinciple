package com.lwl.filter;

public class SensitiveFilter implements Filter {

	/*@Override
	public String doFilter(String msg) {
		return msg.replace("被就业", "就业").replace("敏感", "");
	}
*/
	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		request.setRequsetStr(request.getRequsetStr().replace("被就业", "就业").replace("敏感", ""));
		chain.doFilter(request, response, chain);
		
		response.setResponseStr(response.getResponseStr()+"----SensitiveFilter");
		
	}
	
}
