package com.jappstart.controller;

import com.google.appengine.api.blobstore.*;
import com.google.appengine.api.datastore.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;
import java.io.*;
import java.util.*;


@Controller
public class ImageController
{
    private BlobstoreService blobstoreService;

    public final BlobstoreService getBlobstoreService()
    {
        return blobstoreService;
    }

    @Autowired
    public final void setBlobstoreService(final BlobstoreService blobstoreService)
    {
        this.blobstoreService = blobstoreService;
    }

    @RequestMapping(value = "/imgBlob/{key}", method = RequestMethod.GET)
    public final void getImg(@PathVariable String key, HttpServletResponse res)
    {
        BlobKey blobKey = new BlobKey(key);
        try
        {
            blobstoreService.serve(blobKey, res);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    @RequestMapping(value = "/addImg", method = RequestMethod.GET)
    public final void addImg(HttpServletRequest req, HttpServletResponse res)
    {

        BlobInfo info = new BlobInfoFactory().loadBlobInfo(blobstoreService.getUploadedBlobs(req).get("LOLUPLOAD"));

        System.out.println("Img Controller  ---------------------- Start");
        System.out.println("   Info --> " + info.toString());
        Map<String, BlobKey> blobs = blobstoreService.getUploadedBlobs(req);
        Iterator it = blobs.keySet().iterator();
        while (it.hasNext())
        {
            String s = (String) it.next();
            System.out.println(s + " [=] " + blobs.get(s).getKeyString());

        }

        System.out.println("Img Controller  ---------------------- End");
    }


    @RequestMapping(value = "/addImg/path", method = RequestMethod.POST)
    @ResponseBody
    public final Map<String, String> postPath()
    {
        Text text = new Text(blobstoreService.createUploadUrl("/post"));
        String url = text.getValue();

        System.out.println("url:" + url);
        final Map<String, String> response = new HashMap<String, String>();
        response.put("destAction", url);

        return response;
    }


}
