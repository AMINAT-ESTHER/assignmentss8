package com.library.library.System;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class libraryService {

    private final BookFolder bookFolder;

    public libraryService(@Qualifier("databaseFolder")BookFolder bookFolder){
        this.bookFolder= bookFolder;
    }

    public void getBookDetails(int id){
        System.out.println(bookFolder.findBookById(id));
    }
}
