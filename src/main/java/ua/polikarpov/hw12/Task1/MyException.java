package ua.polikarpov.hw12.Task1;

class MyException {
    public void method() throws Exception {
        throw new Exception("Exception!");
    }

    public static void main(String[] args) {
        MyException myException = new MyException();
        try {
            myException.method();
        } catch (Exception e) {
            System.err.println("Caught it! " + e);
        } finally {
            System.out.println("Message after try/caught.");
        }
    }
}

