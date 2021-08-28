public class VarArgsLast {
    Object[] listVariables(String msg, int ...v) {
        Object[] variables = new Object[v.length + 1];
        variables[0] = msg;
        for (int i = 1; i < v.length + 1; i += 1) {
            variables[i] = v[i - 1];
        }
        return variables;
    }
}
