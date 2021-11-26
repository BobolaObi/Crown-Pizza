package com.example.crownpizzaapplication.ListView;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.renderscript.Element;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.crownpizzaapplication.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FAQ#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FAQ extends Fragment {

    ListView listView;
    TextView answers;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FAQ() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FAQ.
     */
    // TODO: Rename and change types and number of parameters
    public static FAQ newInstance(String param1, String param2) {
        FAQ fragment = new FAQ();
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
        View view = inflater.inflate(R.layout.fragment_f_a_q, container, false);

       //This tells where the FAQList should be displayed
        listView = view.findViewById(R.id.faqFragment);
//        answers = view.findViewById(R.id.dataTypeDescription);
        ArrayList<FAQData> dataTypeArrayList = new ArrayList<>();
        dataTypeArrayList.add(new FAQData("Does your pizza contain peanuts or peanut oil?", " No. Peanut and/or peanut oil is not used in the manufacture of any of our products. However, some of Pizza Pizza’s ingredients are processed in plants of third party suppliers who also process nut products in the same plants.\n "));
        dataTypeArrayList.add(new FAQData("Do you have information on peanuts or nuts?", " The allergen & ingredient lists are available on our website. None of the foods on the menu contain peanuts or nuts and Pizza Pizza always strives to choose menu items that do not contain peanuts or nuts.\n  "));
        dataTypeArrayList.add(new FAQData("Is there egg in your pizzas?", "Our dough, tomato sauce and cheese do not contain any egg product;  however, we do have sauces such as Buffalo Blue Cheese that do contain egg. We recommend that you review our allergen section that discloses all allergens contained in our products. It is available under our “Nutrition” section."));
        dataTypeArrayList.add(new FAQData("", "  "));
        dataTypeArrayList.add(new FAQData("Does your pizza contain peanuts or peanut oil?", " No. Peanut and/or peanut oil is not used in the manufacture of any of our products. However, some of Pizza Pizza’s ingredients are processed in plants of third party suppliers who also process nut products in the same plants.\n "));
        dataTypeArrayList.add(new FAQData("Do you have information on peanuts or nuts?", " The allergen & ingredient lists are available on our website. None of the foods on the menu contain peanuts or nuts and Pizza Pizza always strives to choose menu items that do not contain peanuts or nuts.\n  "));
        dataTypeArrayList.add(new FAQData("Is there egg in your pizzas?", "Our dough, tomato sauce and cheese do not contain any egg product;  however, we do have sauces such as Buffalo Blue Cheese that do contain egg. We recommend that you review our allergen section that discloses all allergens contained in our products. It is available under our “Nutrition” section."));
        dataTypeArrayList.add(new FAQData("", "  "));





        return view;
    }
}