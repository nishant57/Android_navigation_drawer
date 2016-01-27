package com.example.nishant.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nishant.navigationdrawer.R;

//import android.support.v4.app.Fragment;

/**
 * Created by Nishant on 27/01/2016.
 */
public class ToolsFragment extends Fragment {

    private static EditText input;
    private static TextView output;
  //  private Button go;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tools, container, false);

        input = (EditText) rootView.findViewById(R.id.editText_input);
        output = (TextView) rootView.findViewById(R.id.textView_Output);
        final Button go = (Button) rootView.findViewById(R.id.button_go);

        go.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        output.setText(input.getText().toString());
                    }
                }
        );

        return rootView;
    }
}
