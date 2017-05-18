import javax.servlet.*;   
import java.io.IOException;   
  
/**  
* �������� HTTP �����ַ�����Ĺ�������ͨ������������encodingָ��ʹ�ú����ַ�����,���ڴ���Html Form�����������������  
*/  
public class CharacterEncodingFilter implements Filter   
{   
	public void destroy() {}  
	
    public void doFilter(ServletRequest request, ServletResponse response,  FilterChain chain) throws IOException, ServletException 
    {  
        request.setCharacterEncoding("utf-8");    //�����ַ���  
        chain.doFilter(request, response);    //����ִ��  
    }  
    
    public void init(FilterConfig config) throws ServletException {}  
}   