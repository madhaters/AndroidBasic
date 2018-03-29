package com.madhatters.androidbasic.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.madhatters.androidbasic.News;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String CREATE_TABLE_NEWS = "CREATE TABLE " + Tables.News.TABLE_NAME + " ( " +
            Tables.News._ID + " TEXT PRIMARY KEY," +
            Tables.News.COLUMN_TITLE + " TEXT," +
            Tables.News.COLUMN_CONTENT + " TEXT )";

    public DatabaseHelper(Context context) {
        super(context, "newsdb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_NEWS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void saveNews(String title, String content) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Tables.News.COLUMN_TITLE, title);
        values.put(Tables.News.COLUMN_CONTENT, content);

        db.insert(Tables.News.TABLE_NAME, null, values);
    }

    public ArrayList<News> getAllNews() {
        ArrayList<News> news = new ArrayList<>();
        SQLiteDatabase db = getWritableDatabase();

        String[] selection = {Tables.News.COLUMN_TITLE, Tables.News.COLUMN_CONTENT};

        Cursor cursor = db.query(Tables.News.TABLE_NAME, selection, null, null, null, null, null);

        while (cursor.moveToNext()) {
            News news1 = new News();
            news1.setTitle(cursor.getString(0));
            news1.setContent(cursor.getString(1));
            news.add(news1);
        }
        cursor.close();
        return news;
    }

    public News getNewsWhereTitle(String title) {
        SQLiteDatabase db = getWritableDatabase();

        String[] columns = {Tables.News.COLUMN_TITLE, Tables.News.COLUMN_CONTENT};
        String selection = Tables.News.COLUMN_TITLE + " =?";
        String[] selectionArgs = {title};

        Cursor cursor = db.query(Tables.News.TABLE_NAME, columns, selection, selectionArgs, null, null, null);
        if (cursor.moveToNext()) {
            News news = new News(cursor.getString(0), cursor.getString(1));
            cursor.close();
            return news;
        }
        return null;
    }

}
