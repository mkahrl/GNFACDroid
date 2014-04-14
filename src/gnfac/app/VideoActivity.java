/**
 * @(#)VideoActivity.java
 *
 *
 * @author 
 * @version 1.00 2013/6/12
 */
package gnfac.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class VideoActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.video_title));
        setContentView(R.layout.web_view);
        WebView wv = (WebView)findViewById(R.id.webview);
       /// wv.loadUrl("http://www.youtube.com/playlist?list=PLXu5151nmAvT7gHqdNajDBGfGY4u5XMSL&feature=view_all");
        wv.loadUrl("http://m.youtube.com/playlist?list=PLXu5151nmAvR37ZzpTrs8293OfFezBjJB");
        finish();
    }
}