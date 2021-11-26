package com.example.crownpizzaapplication.ListView;

//Construct your FAQ Adapter


import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;

/**
 * First Step: is to extend the FAQ Data Class to refer to its properties and methods.
 * - Implement Methods on the Class
 * - Generate constructor matching super
 */
public class FAQAdapter extends AdapterView<FAQData> {
    public FAQAdapter(Context context) {
        super(context);
    }

    @Override
    public FAQData getAdapter() {
        return null;
    }

    @Override
    public void setAdapter(FAQData faqData) {

    }

    @Override
    public View getSelectedView() {
        return null;
    }

    @Override
    public void setSelection(int i) {

    }
}
