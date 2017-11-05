package com.shibuyaxpress.ihear;

import me.toptas.rssconverter.RssFeed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by paulf on 02-Nov-17.
 */

public interface RssService {
    /**
     * No baseUrl defined. Each RSS Feed will be consumed by it's Url
     * @param url RSS Feed Url
     * @return Retrofit Call
     */
    @GET
    Call<RssFeed>getRss(@Url String url);
}
