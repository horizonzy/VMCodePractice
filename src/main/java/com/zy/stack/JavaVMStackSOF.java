package com.zy.stack;

public class JavaVMStackSOF {

    private int stackLength;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("stack length:" + oom.stackLength);
        }
    }

}
