package com.secretlabs.secret.camera;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.secretlabs.secret.R;

/**
 * Activity displaying the taken photo and offering to share it with other apps.
 *
 */
public class PhotoActivity extends Activity {
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        uri = getIntent().getData();

        setContentView(R.layout.activity_photo);

        ImageView photoView = (ImageView) findViewById(R.id.photo);
        photoView.setImageURI(uri);
    }
}
