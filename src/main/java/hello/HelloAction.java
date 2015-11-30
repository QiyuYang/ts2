package hello;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Yang on 14-3-27.
 */
public class HelloAction extends ActionSupport{
    public String pn =null;
    HttpServletRequest request = ServletActionContext.getRequest();

    public java.lang.String hello() {
        request.setAttribute("hello", "hello world!");
        System.out.print(pn);
        return "success";
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }
}