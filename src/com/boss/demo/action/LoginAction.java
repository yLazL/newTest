/**
 * 
 */
package com.boss.demo.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.boss.demo.entity.User;
import com.boss.demo.service.UserService;
import com.opensymphony.xwork2.ActionContext;

/**
 * @author wjx
 *
 */
@Scope("prototype")
@Controller("LoginAction")
public class LoginAction extends BaseAction{
	@Autowired
	private UserService userService;
	private User user;
	private List rows;
	private String result;
	
	public String toLogin(){
		Map<String,Object>  session =  ActionContext.getContext().getSession();
		if(session.containsKey("ACCOUNTNO"))
			session.remove("ACCOUNTNO");
		return "login";
	}
	public String check() throws Exception{
		String pwd=null;
		
		try {
			if(user.getAccountNo()!=null)
				pwd=userService.findPwdByAccountNo(user.getAccountNo());
			if(pwd!=null&&pwd.equals(user.getPassword())){
				String message = "login...";
				result=JSONUtil.serialize(message);
				Map<String,Object>  session =  ActionContext.getContext().getSession();
				session.put("ACCOUNTNO", user.getAccountNo());
			}else{
				throw new Exception("’À∫≈ªÚ√‹¬Î¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î£°");
			}
				
		} catch (Exception e) {
			String message = e.getMessage();
			result=JSONUtil.serialize(message);
			
		}
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
