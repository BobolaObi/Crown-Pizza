package com.example.crownpizzaapplication.FAQuestions;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
    ListView question;
    TextView answer;
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
        question = view.findViewById(R.id.questionList);
        answer = view.findViewById(R.id.answerList);

        ArrayList<FAQClass> arrayList = new ArrayList<>();
      arrayList.add(new FAQClass("Does your pizza contain peanuts or peanut oil?", "No. Nut as well as nut oil isn't utilized in the assembling of any of our items. Be that as it may, some of Pizza's fixings are handled in plants of outsider providers who likewise process nut items in similar plants."));
        arrayList.add(new FAQClass("Do you have information on peanuts or nuts?", "The allergen and fixing records are accessible on our site. None of the food varieties on the menu contain peanuts or nuts and Pizza consistently endeavors to pick menu things that don't contain peanuts or nuts. "));
        arrayList.add(new FAQClass("Is there egg in your pizzas?", "Our dough, tomato sauce and cheese do not contain any egg product;  however, we do have sauces such as Buffalo Blue Cheese that do contain egg. We recommend that you review our allergen section that discloses all allergens contained in our products. It is available under our “Nutrition” section."));
        arrayList.add(new FAQClass("Do you use gluten?", "We have three kinds of Pepperoni: our \"Unique\", Halal and our \"New York Pepperoni\", none of which contains wheat gluten as a fixing."));
        arrayList.add(new FAQClass("Is sugar used in your dough? ", "No, we don't utilize any sugar refined using creature bone singe.. "));
        arrayList.add(new FAQClass("Where can I find the closest shop ", "You can find us in the make order section of the app. We have madeit esy for you to reach us. CLick  on the shop button"));
        arrayList.add(new FAQClass("Can I pick up or place an order ", "Yes you can! You can find us in the make order section of the application"));


 
        question.setAdapter(new ListViewAdapter(getContext(),

                arrayList));
        question.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("LOOKHERE", "" + position);
                answer.setText(
                        ((FAQClass) question.getItemAtPosition(position))
                                .getAnswer());
            }
        });

        return view;
    }
}