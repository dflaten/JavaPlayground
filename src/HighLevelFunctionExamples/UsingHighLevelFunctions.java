package HighLevelFunctionExamples;

public class UsingHighLevelFunctions {

    public static void execute() {
        FunctionToRetry function = new ImplementedFunction();
        retry(function);
    }
    private static void retry(FunctionToRetry function) {
        Integer retry = 1;
        Integer MAX_RETRIES = 3;
        while (true) {
            try {
                function.apply(retry);
                System.out.println("Succeeded!");
                return;
            } catch (Exception e) {
                System.out.println("Log metric");
                if (retry.equals(MAX_RETRIES)) {
                    System.out.println("Max Retries have been reached. Exception: " + e.getStackTrace().toString());
                    throw e;
                }
                retry++;
            }
        }

    }
}
