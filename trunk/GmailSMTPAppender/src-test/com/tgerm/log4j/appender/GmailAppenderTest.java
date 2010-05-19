package com.tgerm.log4j.appender;

import org.apache.log4j.Logger;

public class GmailAppenderTest {
	private static Logger log = Logger.getLogger(GmailAppenderTest.class);

	public static void main(String[] args) {
		
		log.debug("Message");
		
		log.error("Failed to do foo bar at blah blah blah !");
	}
}
