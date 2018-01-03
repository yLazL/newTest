/**
 * 
 */
package com.boss.demo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @title  BaseAction.java
 * @author 创建人：吴剑雄
 * @date 2014-7-10 下午12:19:28
 * @description TODO
 * @version 版本：V1.0
 */

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport implements java.io.Serializable {
	protected static final String SUCCESS = "success";//成功
	protected static final String ERROR = "error";//失败
	
	protected Message msg;//返回的信息
	
	/**
	 * 
	 * @return
	 */
	public Message getMsg() {
		return msg;
	}

	@JSON(serialize=false)
	public HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}
	
	@JSON(serialize=false)
	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
	
	@JSON(serialize=false)
	public HttpSession getSession() {
		return getRequest().getSession();
	}
	
	/**
	 * <p>函数名称： success</p>
	 * <p>功能说明：返回成功信息
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @param text
	 * @return
	 *
	 * @date   创建时间：2012-3-16
	 * @author 作者：bill
	 */
	protected String success(String text) {
		msg = new Message(text, 1);
		return SUCCESS;
	}
	
	/**
	 * <p>函数名称：success</p>
	 * <p>功能说明：返回成功信息
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @return
	 *
	 * @date   创建时间：2012-3-16
	 * @author 作者：bill
	 */
	protected String success() {
		return success("操作成功");
	}
	
	/**
	 * <p>函数名称： error</p>
	 * <p>功能说明：返回失败信息
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @param text
	 * @return
	 *
	 * @date   创建时间：2012-3-16
	 * @author 作者：bill
	 */
	protected String error(String text) {
		msg = new Message(text, 0);
		return ERROR;
	}
	
	/**
	 * <p>函数名称： error</p>
	 * <p>功能说明：返回失败信息
	 *
	 * </p>
	 *<p>参数说明：</p>
	 * @return
	 *
	 * @date   创建时间：2012-3-16
	 * @author 作者：bill
	 */
	protected String error() {
		return error("操作失败");
	}
	

	/**
	 * 要申明为public才可以
	 * 输出的信息
	 * @author bill
	 */
	public static class Message {
		private String text;
		private int code;
		
		public Message(String text, int code) {
			this.text = text;
			this.code = code;
		}
		
		public Message(String text) {
			this.text = text;
			this.code = 0;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
		
	}
}