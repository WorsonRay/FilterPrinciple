package com.lwl.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<>();
	int index = 0;
	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}
	 
	@Override
	public void doFilter(Request request, Response response,FilterChain chain) {
		if(index == filters.size())return;
		Filter f = filters.get(index);
		index++;
		f.doFilter(request, response, chain);
	}
	
	
}
