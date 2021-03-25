package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active: " + active);
        System.out.println("status: " + status);
        System.out.println("message: " + message);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Error operation = new Error();
        Error operation2 = new Error(true, 1, "ок");
        operation.printInfo();
        operation2.printInfo();

    }
}
