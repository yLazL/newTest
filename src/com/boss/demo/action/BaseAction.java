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
 * @author �����ˣ��⽣��
 * @date 2014-7-10 ����12:19:28
 * @description TODO
 * @version �汾��V1.0
 */

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport implements java.io.Serializable {
	protected static final String SUCCESS = "success";//�ɹ�
	protected static final String ERROR = "error";//ʧ��
	
	protected Message msg;//���ص���Ϣ
	
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
	 * <p>�������ƣ� success</p>
	 * <p>����˵�������سɹ���Ϣ
	 *
	 * </p>
	 *<p>����˵����</p>
	 * @param text
	 * @return
	 *
	 * @date   ����ʱ�䣺2012-3-16
	 * @author ���ߣ�bill
	 */
	protected String success(String text) {
		msg = new Message(text, 1);
		return SUCCESS;
	}
	
	/**
	 * <p>�������ƣ�success</p>
	 * <p>����˵�������سɹ���Ϣ
	 *
	 * </p>
	 *<p>����˵����</p>
	 * @return
	 *
	 * @date   ����ʱ�䣺2012-3-16
	 * @author ���ߣ�bill
	 */
	protected String success() {
		return success("�����ɹ�");
	}
	
	/**
	 * <p>�������ƣ� error</p>
	 * <p>����˵��������ʧ����Ϣ
	 *
	 * </p>
	 *<p>����˵����</p>
	 * @param text
	 * @return
	 *
	 * @date   ����ʱ�䣺2012-3-16
	 * @author ���ߣ�bill
	 */
	protected String error(String text) {
		msg = new Message(text, 0);
		return ERROR;
	}
	
	/**
	 * <p>�������ƣ� error</p>
	 * <p>����˵��������ʧ����Ϣ
	 *
	 * </p>
	 *<p>����˵����</p>
	 * @return
	 *
	 * @date   ����ʱ�䣺2012-3-16
	 * @author ���ߣ�bill
	 */
	protected String error() {
		return error("����ʧ��");
	}
	

	/**
	 * Ҫ����Ϊpublic�ſ���
	 * �������Ϣ
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