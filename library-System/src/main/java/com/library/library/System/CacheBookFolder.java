package com.library.library.System;

import org.springframework.stereotype.Service;

@Service ("cacheFolder")
public class CacheBookFolder implements BookFolder {

    @Override
    public String findBookById(int id) {
        return "BookID" + "fetched from cache.";
    }
}
