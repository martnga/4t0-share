package com.nganga.photoshare;

import com.firebase.client.Firebase;

/**
 * Created by nganga on 8/3/15.
 */
public class ChatApplication extends android.app.Application {
      @Override
       public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        }
}
