public class VariableScope {
    int x = 10;
}

public class VariableScopeDemo {
    public static void main(String[] args[]) {
        VariableScope obj = new VariableScope();
        obj.x = 10;
        System.out.println(obj.x);
    }
}
