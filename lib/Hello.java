public class Hello
{
    public static void main( String argv[] )
    {
	//Author: Jeongryul Kim (jek128@ucsd.edu)
	//Default is "World"
        String name = "World";
        if ( argv.length != 0 )
        {
            name = argv[0];
        }

	Greeter greeter = new Greeter(name);
        System.out.println( "Hello, " + name + "!" );
    }
}

