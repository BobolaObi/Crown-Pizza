package com.example.crownpizzaapplication.CouponPackage;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.crownpizzaapplication.R;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FreePizza#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FreePizza extends AppCompatDialogFragment {

    /**
     * The Coupon num.
     */
    TextView couponNum;
    /**
     * The Coupon buttn.
     */
    Button couponButtn;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Instantiates a new Free pizza.
     */
    public FreePizza() {
        // Required empty public constructor
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment freePizza.
     */
// TODO: Rename and change types and number of parameters
    public static FreePizza newInstance(String param1, String param2) {
        FreePizza fragment = new FreePizza();
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
        View view = inflater.inflate(R.layout.fragment_free_pizza, container, false);
        couponNum = view.findViewById(R.id.randomCode);


        couponButtn = view.findViewById(R.id.tryAgainButton);
        couponButtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Random random = new Random();


                //Test lines
//                int couponValue = random.nextInt(3);
//                String[] extra = {"BNB"};


                // Final Lines
                int couponValue = random.nextInt(954735) + 443467;
                String[] extra = {"BNB", "ETH", "BTC", "CDS"};

                int randomExtra = random.nextInt(extra.length);

                String cou = extra[randomExtra];
                couponNum.setText(Integer.toString(couponValue) + "-" + cou);

                //Test statement
//                if (cou == "BNB" && couponValue == 2){
//                    openDialog();
//                }

                if (cou == "BNB" && couponValue == 754873){
                    openDialog();
                }
            }

        });
        return view;
    }
    private void openDialog() {
        CouponDialog couponDialog = new CouponDialog();
        couponDialog.show(getChildFragmentManager(), "couponDialog");
    }



}

 
