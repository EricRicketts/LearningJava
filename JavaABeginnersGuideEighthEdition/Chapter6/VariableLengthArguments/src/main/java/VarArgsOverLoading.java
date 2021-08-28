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
/*
    we have a potential case of ambiguity here as listVariables() would produce an error,
    with no arguments Java does not know if the variable list is integer or character
*/
