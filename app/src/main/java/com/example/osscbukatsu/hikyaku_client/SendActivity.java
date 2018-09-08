package com.example.osscbukatsu.hikyaku_client;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SendActivity extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.send_main, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Button okButton = getActivity().findViewById(R.id.ok_button);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit = (EditText)getActivity().findViewById(R.id.editText);
                String receiverID = edit.getText().toString();
                Intent intent = new Intent(getActivity().getApplication(), SendTakePhotoActivity.class);
                intent.putExtra("receiverID", receiverID);
                startActivity(intent);
            }
        });
    }
}
