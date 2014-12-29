package foo.bar;

import org.flywaydb.core.Flyway;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Flyway flyway = new Flyway();
        
        flyway.setDataSource("jdbc:mysql://localhost:3306/flyjava2", "root", "root");
        flyway.migrate();
        
        System.out.println( "Hello World!" );
        
    }
}
