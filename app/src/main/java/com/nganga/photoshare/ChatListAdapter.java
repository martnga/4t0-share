package com.nganga.photoshare;

import android.app.Activity;
import android.app.DownloadManager;

/**
 * Created by nganga on 8/3/15.
 */
public class ChatListAdapter  extends FirebaseListAdapter<Chat> {

    private String mUsername;

    public ChatListAdapter(DownloadManager.Query ref, Activity activity, int layout, String mUsername) {
        super(ref, Chat.class, layout, activity);
        this.mUsername = mUsername;

    }
}
