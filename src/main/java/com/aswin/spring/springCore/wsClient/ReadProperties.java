package com.aswin.spring.springCore.wsClient;

public class ReadProperties {

	private String url;
	private String userName;
	private String passWord;
	
	ReadProperties(String url,String userName, String passWord ){
		this.url = url;
		this.userName = userName;
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "ReadProperties [url=" + url + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
}
