import java.lang.reflect.Array;

public class VarArgs {
    int[] listVariables(int ...v) {
        int[] variables = new int[v.length];
        for (int i = 0; i < v.length; i += 1) {
            Array.setInt(variables, i, v[i]);
        }
        return variables;
    }
}
