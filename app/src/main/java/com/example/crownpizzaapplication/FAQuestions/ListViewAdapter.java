package com.example.crownpizzaapplication.FAQuestions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.crownpizzaapplication.R;

import java.util.ArrayList;

/**
 * The type List view adapter.
 */
public class ListViewAdapter extends ArrayAdapter<FAQClass> {

    /**
     * Instantiates a new List view adapter.
     *
     * @param context the context
     * @param items   the items
     */
    public ListViewAdapter(@NonNull Context context,
                           ArrayList<FAQClass> items) {
        super(context, 0, items);
    }

    /**
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if(convertView == null){
            convertView =
                    LayoutInflater.from(getContext())
                            .inflate(R.layout.custom_listview_item,
                                    parent, false);
            TextView name = convertView.findViewById(R.id.question);
            name.setText(getItem(position).getQuestions());
            TextView answer = convertView.findViewById(R.id.answer);
            answer.setText(getItem(position).getAnswer());
        }

        return convertView;
    }
}
