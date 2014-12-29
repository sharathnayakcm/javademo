package foo.bar;

import org.flywaydb.core.Flyway;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Flyway flyway = new Flyway();
        System.out.println( "Hello World!" );
        flyway.setDataSource("jdbc:mysql://localhost:3306/flyjava2", "root", "root");
        flyway.migrate();
    }
}
