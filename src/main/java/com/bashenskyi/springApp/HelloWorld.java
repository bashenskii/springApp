package com.bashenskyi.springApp;

/**
 * Created by Ruslan on 28.04.2017.
 */
public class HelloWorld {
    private  String message;
    private int min;
    private int max;

    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
