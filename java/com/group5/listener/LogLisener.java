package com.group5.listener;

import com.group5.util.SessionContext;

import javax.servlet.http.HttpSessionEvent;

public class LogLisener {
    public static SessionContext sessionContext=SessionContext.getInstance();
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        sessionContext.AddSession(httpSessionEvent.getSession());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        sessionContext.DelSession(httpSessionEvent.getSession());
    }
}


