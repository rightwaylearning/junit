package com.tcs.www.sample_project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World This is My first program" );
        
        App app=new App();
        String output = app.getMessage("Sagar");
        System.out.println("outpur: "+output);
    }
    
    public String getMessage(String msg) {
    	if(msg == null) {
    		return null;
    	}
    	return "hello "+msg;
    }
}
