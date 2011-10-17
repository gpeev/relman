package com.jappstart.servlet;

import com.google.appengine.api.blobstore.*;
import com.google.appengine.api.users.*;

import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import java.util.*;


public class FileUpload extends HttpServlet
{
    private BlobstoreService blobstoreService =
            BlobstoreServiceFactory.getBlobstoreService();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        System.out.println("inside FileUpload - doGet - FUCK");
        doPost(req,resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        System.out.println("inside FileUpload - doPost");

        Map<String, BlobKey> blobs = blobstoreService.getUploadedBlobs(req);
        if (blobs.keySet().isEmpty())
        {
            resp.sendRedirect("/?error=" +
                    URLEncoder.encode("No file uploaded", "UTF-8"));
            return;
        }

        Iterator<String> names = blobs.keySet().iterator();
        String blobName = names.next();
        BlobKey blobKey = blobs.get(blobName);

        /*
        if (user == null)
        {
            blobstoreService.delete(blobKey);
            resp.sendRedirect("/?error=" +
                    URLEncoder.encode("Must be logged in to upload", "UTF-8"));
            return;
        }
        */

        BlobInfoFactory blobInfoFactory = new BlobInfoFactory();
        BlobInfo blobInfo = blobInfoFactory.loadBlobInfo(blobKey);

        String contentType = blobInfo.getContentType();
        long size = blobInfo.getSize();
        Date creation = blobInfo.getCreation();
        String fileName = blobInfo.getFilename();

        String title = req.getParameter("title");
        String description = req.getParameter("description");

        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        String json = "{\"blobKey\":\"" + blobKey.getKeyString() + "\"}";
        System.out.println("JsonResp:  "+json);
        out.print(json);
        //out.write("this is a test resp.");
        out.flush();
        //return;

        /*
        try
        {
            resp.sendRedirect("/");
        }
        catch (Exception e)
        {
            blobstoreService.delete(blobKey);
            resp.sendRedirect("/?error=" +
                    URLEncoder.encode("Object save failed: " + e.getMessage(), "UTF-8"));
        }
        */
    }


}
