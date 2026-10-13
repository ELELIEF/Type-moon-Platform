package elelief.typemoon.utils;

public class CurrentHolder {
    private static final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void setCurrent(Integer userid) {
        threadLocal.set(userid);
    }

    public static Integer getCurrent() {
        return threadLocal.get();
    }

    public static void removeCurrent() {
        threadLocal.remove();
    }
}
