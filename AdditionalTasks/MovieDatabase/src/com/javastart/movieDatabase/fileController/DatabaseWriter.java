package com.javastart.movieDatabase.fileController;
//DatabaseWriter z jedną metodą
//DatabaseReader z jedną metodą Database read()

import com.javastart.movieDatabase.db.ApplicationDatabase;

public interface DatabaseWriter {

    void write(ApplicationDatabase database);
}
