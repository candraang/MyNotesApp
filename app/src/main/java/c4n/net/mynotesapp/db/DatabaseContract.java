package c4n.net.mynotesapp.db;

import android.provider.BaseColumns;

/**
 * Created by c4n on 29/11/2017.
 */

public class DatabaseContract {

    static String TABLE_NOTE = "note";

    static final class NoteColumns implements BaseColumns{

        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";

        static String DATE = "date";
    }
}
