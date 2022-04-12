package com.ozz.springcloud.gateway.filter;

import cn.hutool.core.util.StrUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class MyFilter extends ZuulFilter {

  /**
   * 过滤器类型 pre表示在请求之前进行逻辑操作
   * <p>
   * http://c.biancheng.net/view/5417.html
   */
  @Override
  public String filterType() {
    return "pre";
  }

  /**
   * 过滤器执行顺序 当一个请求在同一个阶段存在多个过滤器的时候 过滤器的执行顺序
   */
  @Override
  public int filterOrder() {
    return 0;
  }

  /**
   * 是否开启过滤
   */
  @Override
  public boolean shouldFilter() {
    return true;
  }

  /**
   * 编写过滤器拦截业务逻辑代码
   */
  @Override
  public Object run() {
    RequestContext currentContext = RequestContext.getCurrentContext();
    HttpServletRequest request = currentContext.getRequest();
    String token = request.getHeader("token");
    if (StrUtil.isEmpty(token)) {
      currentContext.setSendZuulResponse(false);
      currentContext.setResponseBody("token in header is null");
      currentContext.setResponseStatusCode(401);
    }
    return null;
  }
}