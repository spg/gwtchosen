package com.watopi.chosen.client;

public class Console {
    public static native void log(String message)/*-{
        $wnd.console.log(message);
    }-*/;
}
