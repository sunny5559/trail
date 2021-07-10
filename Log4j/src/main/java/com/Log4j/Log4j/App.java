package com.Log4j.Log4j;


import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Logger log = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	
    	Layout l = new  XMLLayout();
    	Appender a = new ConsoleAppender(l);
    	
    	log.addAppender(a);
    	
        log.debug("debug message");
        log.info("info message");
        log.warn("warn message");
        log.error("error message");
        log.fatal("fatal message");
    }
}
