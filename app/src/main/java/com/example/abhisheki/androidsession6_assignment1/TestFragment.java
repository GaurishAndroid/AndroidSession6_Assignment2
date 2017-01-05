package com.example.abhisheki.androidsession6_assignment1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class TestFragment extends Fragment implements View.OnClickListener{

    OnItemClickedListener mListener;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test,
                container, false);

        mListener = (OnItemClickedListener) this.getContext();

        button1 = (Button) view.findViewById(R.id.btnLayout1);
        button2 = (Button) view.findViewById(R.id.btnLayout2);
        button3 = (Button) view.findViewById(R.id.btnLayout3);
        button4 = (Button) view.findViewById(R.id.btnLayout4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {

        String btntxt="";
        switch (v.getId()) {
            case R.id.btnLayout1:
                btntxt = ((Button)v.findViewById(R.id.btnLayout1)).getText().toString();
                break;
            case R.id.btnLayout2:
                btntxt = ((Button)v.findViewById(R.id.btnLayout2)).getText().toString();
                break;
            case R.id.btnLayout3:
                btntxt = ((Button)v.findViewById(R.id.btnLayout3)).getText().toString();
                break;
            case R.id.btnLayout4:
                btntxt = ((Button)v.findViewById(R.id.btnLayout4)).getText().toString();
                break;
        }
        mListener.OnItemClicked(btntxt);
    }

    public interface OnItemClickedListener {
        public void OnItemClicked(String params);
    }
    private static OnItemClickedListener sDummyCallbacks = new OnItemClickedListener() {
        @Override
        public void OnItemClicked(String params) {
        }
    };



}
