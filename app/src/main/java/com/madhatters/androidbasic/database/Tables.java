package com.madhatters.androidbasic.database;

import android.provider.BaseColumns;

public class Tables {
    public static class News implements BaseColumns {
        public static final String TABLE_NAME = "news";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_CONTENT = "content";
    }
}
