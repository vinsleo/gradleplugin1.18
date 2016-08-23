package common;

public class CommonTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> engClz = Class.forName("io.swagger.codegen.languages.JavaClientCodegen");
        System.out.println("Class Found");
    }
}
