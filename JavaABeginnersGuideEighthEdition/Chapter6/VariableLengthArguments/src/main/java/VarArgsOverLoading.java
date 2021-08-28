public class VarArgsOverLoading {
    int[] listVariables(int ...v) {
        int[] variables = new int[v.length];
        for (int i = 0; i < v.length; i += 1) {
            variables[i] = v[i];
        }
        return variables;
    }

    char[] listVariables(char ...v) {
        char[] variables = new char[v.length];
        for (int i = 0; i < v.length; i += 1) {
            variables[i] = v[i];
        }
        return variables;
    }
}
