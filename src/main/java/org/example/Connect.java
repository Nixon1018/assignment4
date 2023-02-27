package org.example;

import java.util.logging.Logger;

public class Connect{
    String c;
    String x;
    private static Logger logger = Logger.getLogger("InfoLogging");
    static Connect instance(String x)
    {
        return new Connect(x);
    }
    private Connect(String c)
    {
        this.c=c;

    }
}