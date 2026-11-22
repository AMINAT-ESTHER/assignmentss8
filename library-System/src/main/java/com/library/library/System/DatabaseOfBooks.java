package com.library.library.System;

import org.springframework.stereotype.Service;

@Service("databaseFolder")
public class DatabaseOfBooks implements BookFolder {
    @Override
    public String findBookById(int id) {
        return "BookID" + "fetched from DATABASE.";
    }
}
