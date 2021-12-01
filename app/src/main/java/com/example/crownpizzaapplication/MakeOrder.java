package com.example.crownpizzaapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MakeOrder#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MakeOrder extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MakeOrder() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MakeOrder.
     */
    // TODO: Rename and change types and number of parameters
    public static MakeOrder newInstance(String param1, String param2) {
        MakeOrder fragment = new MakeOrder();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //Create and return view
        View view =  inflater.inflate(R.layout.fragment_make_order, container, false);

        //Create Contact Us Button
        Button callUsButton = view.findViewById(R.id.callUsbutton);
        callUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:519323777"));
                startActivity(i);
            }
        });

        //Create  Message Button
        Button messageUsButton = view.findViewById(R.id.textUsButton);
        messageUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SENDTO,
                        Uri.parse("smsto:519323777"));
                i.putExtra("sms_body",
                        "Hungry? tell us what you want.");
                        startActivity(i);
            }
        });

        //Create Location / Shops Button
        Button locationButton = view.findViewById(R.id.shopsButton);
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location = Uri.parse("geo:42.4949720777289, -82.96808432027362?&q=Pizza ");

                Intent intent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(intent);
            }
        });



        return view;
    }
}