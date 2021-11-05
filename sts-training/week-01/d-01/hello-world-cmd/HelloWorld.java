public class HelloWorld{
    public static void main(String[] args){
        println("Hello, World of Revature!");
        println("To run this file in CMD, do the following:");
        println("1. First download your OS-version Java JDK from www.oracle.com");
        println("2. Open command line-prompt, then verify Java Version, by typing: java -version");
        println("3. Next, navigate to the directory where this HelloWorld.java resides");
        println("4. Type: javac HelloWorld.java");
        println("5. Step 4 creates an executable file, named: HelloWorld.class");
        println("6. Now, run the executable file by typing: java HelloWorld ... the dot-class extension is removed");
    }
    
    public static void println(String message){
        System.out.println(message);
    }
}