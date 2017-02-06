package viren.user.com.playyoutubevideo;

import android.content.ClipData;
import android.os.RecoverySystem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    private static final String API_KEY = "AIzaSyDNmH66nfI-va2vr5yJzdqXJXx81QVEorA";
    private static final String VIDEO_ID = "UwuL4FSKu44";
    private YouTubePlayerView player;

    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = (YouTubePlayerView) findViewById(R.id.youtubevido);
        player.initialize(API_KEY, this);
    }




    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean complete) {

        player.setPlayerStateChangeListener(playerstatechangelistener);
        player.setPlaybackEventListener(playbackEventListener);
        if (!complete) {
            player.cueVideo(VIDEO_ID);

        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(MainActivity.this, youTubeInitializationResult.toString(), Toast.LENGTH_LONG).show();
    }

    YouTubePlayer.PlaybackEventListener playbackEventListener=new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {


        }
    };

private YouTubePlayer.PlayerStateChangeListener playerstatechangelistener =new YouTubePlayer.PlayerStateChangeListener() {
    @Override
    public void onLoading() {

    }

    @Override
    public void onLoaded(String s) {

    }

    @Override
    public void onAdStarted() {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onVideoEnded() {

    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {

    }
};

}
