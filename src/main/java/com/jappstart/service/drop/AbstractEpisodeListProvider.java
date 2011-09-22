package com.jappstart.service.drop;


import com.jappstart.model.vo.Episode;
import net.sourceforge.filebot.web.EpisodeListProvider;
import net.sourceforge.filebot.web.SearchResult;
import net.sourceforge.filebot.web.SeasonOutOfBoundsException;

import static com.jappstart.service.drop.EpisodeListUtilities.*;

import java.util.List;
import java.util.Locale;


public abstract class AbstractEpisodeListProvider implements EpisodeListProvider
{
	
	@Override
	public boolean hasSingleSeasonSupport() {
		return true;
	}
	

	@Override
	public boolean hasLocaleSupport() {
		return false;
	}
	

	@Override
	public List<SearchResult> search(String query) throws Exception {
		return search(query, Locale.ENGLISH);
	}
	

	@Override
	public List<Episode> getEpisodeList(SearchResult searchResult) throws Exception {
		return getEpisodeList(searchResult, Locale.ENGLISH);
	}
	

	@Override
	public List<Episode> getEpisodeList(SearchResult searchResult, int season) throws Exception {
		return getEpisodeList(searchResult, season, Locale.ENGLISH);
	}
	

	@Override
	public List<Episode> getEpisodeList(SearchResult searchResult, int season, Locale locale) throws Exception {
		List<Episode> all = getEpisodeList(searchResult, locale);
		List<Episode> eps = filterBySeason(all, season);
		
		if (eps.isEmpty()) {
			throw new SeasonOutOfBoundsException(searchResult.getName(), season, getLastSeason(all));
		}
		
		return eps;
	}
	
}
