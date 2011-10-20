package com.jappstart.service;

import java.util.List;
import java.util.Locale;

import com.google.appengine.api.datastore.Key;
import com.jappstart.form.Add;
import com.jappstart.model.vo.RelType;
import com.jappstart.model.vo.Release;

public interface ReleaseService {

	
	    void addRelease(final Add release, final Locale locale);
	    
	    List<Release> loadReleases(RelType type);
	    
	    Release viewReleaseDetails(String key);
}
