import javax.servlet.*;   
import java.io.IOException;   
  
/**  
* 用于设置 HTTP 请求字符编码的过滤器，通过过滤器参数encoding指明使用何种字符编码,用于处理Html Form请求参数的中文问题  
*/  
public class CharacterEncodingFilter implements Filter   
{   
	public void destroy() {}  
	
    public void doFilter(ServletRequest request, ServletResponse response,  FilterChain chain) throws IOException, ServletException 
    {  
        request.setCharacterEncoding("utf-8");    //设置字符集  
        chain.doFilter(request, response);    //继续执行  
    }  
    
    public void init(FilterConfig config) throws ServletException {}  
}   