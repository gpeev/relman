package com.jappstart.servlet;

import com.google.appengine.api.blobstore.*;

import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import java.util.*;


public class FileUpload extends HttpServlet
{
    private BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        System.out.println("inside FileUpload.doGet() - THIS IS INCORRECT.");
    }


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
    {
        try
        {
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
            resp.setContentType("application/json");
            PrintWriter out = resp.getWriter();
            String json = "{\"blobKey\":\"" + blobKey.getKeyString() + "\"}";
            System.out.println("JsonResp:  " + json);
            out.print(json);
        }
        catch (Exception e)
        {
            System.out.println("There was an error in the FileUpload /post\n" + e.getMessage());
        }
    }
}
