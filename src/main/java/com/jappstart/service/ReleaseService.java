package com.jappstart.service;

import java.util.List;
import java.util.Locale;

import com.jappstart.form.Add;
import com.jappstart.model.vo.Release;

public interface ReleaseService {

	
	    void addRelease(final Add user, final Locale locale);
	    
	    List<Release> loadReleases();

	
}
