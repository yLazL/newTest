
package com.boss.demo.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.boss.demo.entity.User;
import com.boss.demo.service.UserService;
import com.opensymphony.xwork2.ActionContext;

/**
 * @title  UserAction.java
 * @author �����ˣ��⽣��
 * @date 2014-7-10 ����02:37:08
 * @description TODO
 * @version �汾��V1.0
 */
@Scope("prototype")
@Controller("UserAction")
public class UserAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private UserService userService;
	private User user;
	private List rows;
	private Long total;
	private String result;
	
	/**
	 * 
	 * ������ƣ�toMainPage
	 * ����˵������תmain.jsp
	 * ����˵����
	 * @return String
	 */
	public String toMainPage(){
		System.out.println("sss");
		String accNo=null;
		Map<String,Object>  session =  ActionContext.getContext().getSession();
		if(session.containsKey("ACCOUNTNO"))
			accNo = (String)session.get("ACCOUNTNO");
		if(accNo==null)
			return "back";
		return "main";
	}
	public String saveUser()throws Exception{
		try {
			if(user==null)
				throw new Exception("添加用户失败！请重试");
			else
				userService.saveUser(user);
			String messege="添加用户成功！";
			result=JSONUtil.serialize(messege);
			System.out.println(result);
		} catch (Exception e) {
			result=JSONUtil.serialize(e.getMessage());
			System.out.println("ErrorRes:"+result);
		}		
		return SUCCESS;
	}
	public String removeUser() throws Exception{
		try {
			if(user.getUserID()==null)
				throw new Exception("请选择删除对象！");
			else
				userService.removeUser(user.getUserID());
			String messege="删除用户成功！";
			result=JSONUtil.serialize(messege);
			System.out.println(result);
		} catch (Exception e) {
			result=JSONUtil.serialize(e.getMessage());
			System.out.println("ErrorRes:"+result);
		}
		return SUCCESS;
	}
	
	public String checkAccountNo() throws Exception{
		try {
			String messege="可用";
			if(user.getAccountNo()!=null){				
				user=userService.findByAccountNo(user.getAccountNo());
				if(user!=null)
					messege="账号已存在，请更改！";
				result=JSONUtil.serialize(messege);	
				
			}
		} catch (Exception e) {
			result=JSONUtil.serialize(e.getMessage());
		}
		return SUCCESS;
	}
	
	public String modifyUser() throws Exception{
		try {
			if(user.getUserID()==null)
				throw new Exception("请选择修改对象！");
			else
				userService.modifyUser(user);
			
			String messege="修改用户成功！";
			result=JSONUtil.serialize(messege);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return SUCCESS;
	}

	public String showUsers() throws Exception{
		//user=new User();
		Integer totalRows=userService.loadUserCount(user);
		HttpServletRequest t = this.getRequest();
		String p=t.getParameter("page");
		String r=t.getParameter("rows");
		System.out.println(p+"--"+r);
		int start = (Integer.parseInt(p)-1)*Integer.parseInt(r);
		int end =Integer.parseInt(r); 
		System.out.println(start+"-"+end);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", start);
		map.put("end", end);
		if(user!=null){
			map.put("accountNo", user.getAccountNo());
			map.put("name", user.getName());
		}
		
		List<User> user_list=null;
		try{
			user_list=userService.showUsers(map);

			if(user_list==null)
				throw new Exception("execute exception");
			else{				

				total=totalRows.longValue();
				rows=user_list;

			}
			
		}catch (Exception e) {
			e.getStackTrace();
		}
		return SUCCESS;
	}
	
	public String jiexiExcel(String filepath, String data){
		HttpServletRequest t = this.getRequest();
		String lujing = t.getParameter("lujing");
		System.out.println(lujing);
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
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
