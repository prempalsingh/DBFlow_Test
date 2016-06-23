package com.prempal.dbflowtest;

import android.net.Uri;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.provider.ContentUri;
import com.raizlabs.android.dbflow.annotation.provider.TableEndpoint;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.raizlabs.android.dbflow.structure.provider.ContentUtils;

@Table(database = TestDatabase.class, name = Currency.NAME)
@TableEndpoint(name = Currency.NAME, contentProvider = TestContentProvider.class)
public class Currency extends BaseModel {

    public static final String NAME = "Currency";

    @ContentUri(path = NAME, type = ContentUri.ContentType.VND_MULTIPLE + NAME)
    public static final Uri CONTENT_URI = ContentUtils.buildUriWithAuthority(TestContentProvider.AUTHORITY);

    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String name;
}
