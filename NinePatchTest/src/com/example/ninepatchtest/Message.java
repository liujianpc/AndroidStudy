package com.example.ninepatchtest;


public class Message {
	public static final int TYPE_RECEIVED = 0;
	public static final int TYPE_SENDED = 1;
	private String messageContent;
	private int type;

	public Message(String messageContent, int type) {
		//super();
		this.messageContent = messageContent;
		this.type = type;
	}



	public String getMessageContent() {
		return messageContent;
	}

	

	public int getType() {
		return type;
	}


}
