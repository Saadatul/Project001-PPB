package id.sch.smktelkom_mlg.project.xirpl605142332.wayangku;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Created by -asus- on 11/17/2016.
 */

public class VideoWayang extends Fragment {

    RelativeLayout view;
    TextView isi;
    TextView judul;
    private VideoView videoView;
    private int position = 0;
    private MediaController mediaController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.video_wayang, container, false);

        videoView = (VideoView) view.findViewById(R.id.videoView);
        isi = (TextView) view.findViewById(R.id.textView2);
        judul = (TextView) view.findViewById(R.id.textView3);
// Set the media controller buttons
        if (mediaController == null) {
            mediaController = new MediaController(getActivity());
// Set the videoView that acts as the anchor for the MediaController.
            mediaController.setAnchorView(videoView);
// Set MediaController for VideoView
            videoView.setMediaController(mediaController);
        }
        try {
// ID of video file.
            int id = this.getRawResIdByName("animasi");
            videoView.setVideoURI(Uri.parse("android.resource://" +
                    getActivity().getPackageName() + "/" + id));
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        videoView.requestFocus();
// When the video file ready for playback.
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                videoView.seekTo(position);
                if (position == 0) {
                    videoView.start();
                }
// When video Screen change size.
                mediaPlayer.setOnVideoSizeChangedListener(new
                                                                  MediaPlayer.OnVideoSizeChangedListener() {
                                                                      @Override
                                                                      public void onVideoSizeChanged(MediaPlayer mp, int
                                                                              width, int height) {
// Re-Set the videoView that acts as the anchor for the MediaController
                                                                          mediaController.setAnchorView(videoView);
                                                                      }
                                                                  });
            }
        });

        return view;

    }


    // Find ID corresponding to the name of the resource (in the directory raw).
    public int getRawResIdByName(String resName) {
        String pkgName = getActivity().getPackageName();
// Return 0 if not found.
        int resID = this.getResources().getIdentifier(resName, "raw",
                pkgName);
        Log.i("AndroidVideoView", "Res Name: " + resName + "==> Res ID = " +
                resID);
        return resID;
    }

    // When you change direction of phone, this method will be called.
// It store the state of video (Current position)
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
// Store current position.
        savedInstanceState.putInt("CurrentPosition",
                videoView.getCurrentPosition());
        videoView.pause();
    }

}


