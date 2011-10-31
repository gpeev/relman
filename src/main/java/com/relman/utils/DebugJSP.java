package com.relman.utils;

import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class DebugJSP
{


    static String HEADERS = "HEADERS";
    static String ATTRIBUTES = "ATTRIBUTES";
    static String PARAMS = "PARAMS";

    public static void dumpRequest(HttpServletRequest req) throws IOException
    {

        printEnumeration(req, req.getHeaderNames(), HEADERS);
        printEnumeration(req, req.getAttributeNames(), ATTRIBUTES);
        printEnumeration(req, req.getParameterNames(), PARAMS);

        System.out.println("");


        System.out.println("LocalAddr: "+req.getLocalAddr());
        System.out.println("LocalName: "+req.getLocalName());
        System.out.println("RemoteAddr: "+req.getRemoteAddr());
        System.out.println("RemoteHost: "+req.getRemoteHost());
        System.out.println("AuthType: "+req.getAuthType());
        System.out.println("ContentType: "+req.getContentType());
        System.out.println("Method: "+req.getMethod());
        System.out.println("PathTranslated: "+req.getPathTranslated());
        System.out.println("PathInfo: "+req.getPathInfo());
        System.out.println("ServerName: "+req.getServerName());
        System.out.println("ServletPath: "+req.getServletPath());
        System.out.println("RequestURL: "+req.getRequestURL().toString());


        System.out.println("-------------- Java Property ---------------");
        java.util.Properties props = System.getProperties();
        Iterator propIt = props.keySet().iterator();
        while (propIt.hasNext())
        {
            String k = (String) propIt.next();
            String v = props.getProperty(k);
            System.out.println(k + " = " + v);
        }
        System.out.println("----------------------------------------");

        System.out.println("");

        System.out.println("----------------- ENV -----------------");
        Map<String, String> envMap = System.getenv();
        Iterator envIt = envMap.keySet().iterator();
        while (envIt.hasNext())
        {
            String k = (String) envIt.next();
            String v = envMap.get(k);
            System.out.println(k+" = "+v);
        }
        System.out.println("---------------------------------------");



        java.net.InetAddress localhost = java.net.InetAddress.getLocalHost();
        String hostName = localhost.getHostName();

        System.out.println("HOSTNAME: "+hostName);
        





    }

    public static void printEnumeration(HttpServletRequest req, Enumeration en, String title)
    {
        System.out.println("============ " + title + " ============");

        if (!en.hasMoreElements())
        {
            System.out.println("    - none");
        }
        else
        {
            while (en.hasMoreElements())
            {
                String name = (String) en.nextElement();

                Object attr = null;
                if(title.equalsIgnoreCase(HEADERS))
                {
                    attr = req.getHeader(name);
                }
                else if(title.equalsIgnoreCase(PARAMS))
                {
                    attr = req.getParameter(name);
                }
                else if(title.equalsIgnoreCase(ATTRIBUTES))
                {
                    attr = req.getAttribute(name);
                }

                if (attr != null)
                {
                    if (attr instanceof String)
                    {
                        System.out.println(name + " = " + attr);

                    }
                    else
                    {
                        System.out.println(name + " = [" + attr.getClass().getName() + "] " + attr);

                    }
                }
                else
                {
                    System.out.println(name + " = " + attr);
                }
            }
        }
        System.out.println("--------------------------------");
        System.out.println("");

    }


}
