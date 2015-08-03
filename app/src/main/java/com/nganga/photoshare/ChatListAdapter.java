package com.nganga.photoshare;

import android.app.Activity;
import android.app.DownloadManager;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nganga on 8/3/15.
 */
public class ChatListAdapter  extends FirebaseListAdapter<Chat> {

    private String mUsername;

    public ChatListAdapter(DownloadManager.Query ref, Activity activity, int layout, String mUsername) {
        super(ref, Chat.class, layout, activity);
        this.mUsername = mUsername;

    }

    @Override
    protected void populateView(View view, Chat chat) {
        // Map a Chat object to an entry in our listview
        String author = chat.getAuthor();
        TextView authorText = (TextView) view.findViewById(R.id.author);
        authorText.setText(author + ": ");
}
