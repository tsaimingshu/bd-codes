package com.bdsoft.y2012.m10;

/**
 * 新浪搜索结果页面解析-js内容是json
 * 
 * @author bdceo
 * 
 */
public class SinaFeedJson {
	private String pid;
	// private String js;
	// private String css;
	private String html;

	public SinaFeedJson() {
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	//
	// public String getJs() {
	// return js;
	// }
	//
	// public void setJs(String js) {
	// this.js = js;
	// }
	//
	// public String getCss() {
	// return css;
	// }
	//
	// public void setCss(String css) {
	// this.css = css;
	// }

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}
}
