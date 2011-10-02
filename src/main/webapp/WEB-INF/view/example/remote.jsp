<%@ page import="com.google.appengine.tools.remoteapi.*" %>
<%@ page import="org.springframework.security.core.userdetails.*" %>
<%@ page import="java.util.*" %>
<%

    RemoteApiInstaller installer = new RemoteApiInstaller();

    try
    {
        //String username = "incrediblep@gmail.com";
        String username = "gpeev";
        RemoteApiOptions options = new RemoteApiOptions()
                .server("localhost", 8080)
                .credentials(username, "2106google");
        System.out.println("1111111111111");

        //System.out.println("Serialized1: " + installer.serializeCredentials());
        System.out.println("22222222222222222");
        //installer.install(options);
        System.out.println("33333333333333333333333");

        // Update the options with reusable credentials so we can skip
        // authentication on subsequent calls.
       // options.reuseCredentials(username, installer.serializeCredentials());

      //  System.out.println("Serialized2: " + installer.serializeCredentials());
// ... all API calls executed remotely


        org.springframework.context.ApplicationContext appContext =
                org.springframework.web.context.support.WebApplicationContextUtils.
                        //getRequiredWebApplicationContext(request.getSession().getServletContext());
                                getWebApplicationContext(request.getSession().getServletContext());
        System.out.println("444444444444444444444444444");
        com.jappstart.service.auth.EnhancedUserDetailsService serv = (com.jappstart.service.auth.EnhancedUserDetailsService) appContext.getBean("userDetailsService");//new UserDetailsServiceImpl();
        System.out.println("55555555555555555555555555555");
        List<UserDetails> users = serv.loadUsers();
        System.out.println("66666666666666666666666666666666");

        System.out.print("UserCnt:" + users.size() + "<br>");
        for (int i = 0; i < users.size(); i++)
        {
            UserDetails details = users.get(i);
            System.out.print(details.getUsername() + "<br>");
        }


        //  installer.uninstall();
        System.out.print("Setup remote");
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    finally
    {
        //installer.uninstall();
    }

%>

