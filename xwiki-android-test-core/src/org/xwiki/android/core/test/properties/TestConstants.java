package org.xwiki.android.core.test.properties;

public class TestConstants
{
    public static final int SERVER_INDEX;
    public static final String HOST = "10.0.2.2";
    public static final int PORT = 8080; // actual port is port+server_index
    public static final String SCHEME = "http://";
    public static final String SERVER_URL; // SERVER NAME set in static block.
    public static final String USERNAME = "Admin";
    public static final String PASSWORD = "admin";

    // external test fixture.

    public static final String WIKI_NAME = "xwiki";
    public static final String SPACE_NAME = "Blog";
    public static final String PAGE_NAME = "test2";
    public static final String PAGE_VERSION = "1.1";
    public static final String CREATE_PAGE_NAME = "CreatePage"; // used for create method tests. because page needss to
                                                                // be deleted for creation test 01 will create
                                                                // CreatePage-1
    public static final String UPDATE_PAGE_NAME = "UpdatePage";

    public static final String COMMENT_ID = "0";
    public static final String COMMENT_TEXT = "hi";
    public static final String COMMENT_REPLY_ID = "1";
    public static final int COMMENT_REPLY_REPLY_TO = 0;
    public static final String COMMENT_PAGE_HISTORY_VERSION = "5.1";
    public static final String COMMENT_REPLY_TEXT = "huy";

    public static final String LANGUAGE = "fr";
    public static final String TRANSLATION_VERSION = "2.1";

    public static final String OBJECT_CLASS_NAME_1 = "Blog.BlogPostClass";
    public static final String OBJECT_CLASS_NAME_2 = "Blog.BlogCategoryClass";
    public static final int OBJECT_NUMBER = 0;
    public static final String OBJECT_PROPERTY_NAME = "content";
    public static final String OBJECT_PROPERTY_VALUE = "test blog content";

    public static final String SEARCH_KEWORD = "test";

    public static final String TAG_WORD = "testTag";

    public static final String ATTACHMENT_NAME = "a.png";
    public static final String ATTACHMENT_DEL_NAME = "del.png";
    public static final String ATTACHMENT_PATH = "./";
    public static final String ATTACHMENT_VERSION = "1.1";
    public static final String ATTACHMENT_PAGE_HISTORY_VERSION = "9.1";

    static {
        SERVER_INDEX = new Integer(System.getProperty("xwikiExecutionIndex", "0"));
        SERVER_URL = HOST + ":" + (PORT + SERVER_INDEX);
        if (HOST.contains("localhost")) {
            System.err.println("localhost on android means devices interface card!!!");
        }
    }

}
