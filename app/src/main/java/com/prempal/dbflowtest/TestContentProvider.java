package com.prempal.dbflowtest;

import com.raizlabs.android.dbflow.annotation.provider.ContentProvider;

@ContentProvider(authority = TestContentProvider.AUTHORITY,
        database = TestDatabase.class,
        baseContentUri = TestContentProvider.BASE_CONTENT_URI)
public class TestContentProvider {
    public static final String AUTHORITY = "com.raizlabs.android.dbflow.test.provider";

    public static final String BASE_CONTENT_URI = "content://";
}
