package com.example.crownpizzaapplication.FoodItems;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.crownpizzaapplication.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuList extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Instantiates a new Menu list.
     */
    public MenuList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menuList.
     */
// TODO: Rename and change types and number of parameters
    public static MenuList newInstance(String param1, String param2) {
        MenuList fragment = new MenuList();
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
        View view = inflater.inflate(R.layout.fragment_menu_list, container, false);
        ArrayList<FoodItem> pizzaList = new ArrayList<>();
        pizzaList.add(new FoodItem(R.drawable.pizza1, "Neapolitan Pizza", "S | M | L", 12.99));
        pizzaList.add(new FoodItem(R.drawable.pizza2, "Chicago Pizza", " S | L | ", 11.99));
        pizzaList.add(new FoodItem(R.drawable.pizza3, "New York-Style Pizza", "S | M | L", 5.99));
        pizzaList.add(new FoodItem(R.drawable.pizza4, "Sicilian Pizza", " S | L", 30.99));
        pizzaList.add(new FoodItem(R.drawable.pizza5, "Greek Pizza", "S | M | L", 4.99));
        pizzaList.add(new FoodItem(R.drawable.pizza6, "California Pizza", " S | M | L", 11.99));
        pizzaList.add(new FoodItem(R.drawable.pizza7, "Pizza", "S | M | L", 5.99));
        pizzaList.add(new FoodItem(R.drawable.pizza8, "Detroit Pizza", " S | M ", 30.99));
        pizzaList.add(new FoodItem(R.drawable.pizza9, "St. Louis Pizza", "S | M | L", 13.99));

        MenuAdapter adapter = new MenuAdapter(pizzaList);
        RecyclerView recyclerView = view.findViewById(R.id.menuRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }
}