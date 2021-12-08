package com.example.crownpizzaapplication.CouponPackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentManager;

/**
 * The type Coupon dialog.
 */
//
public class CouponDialog extends AppCompatDialogFragment {
//    public class CouponDialog extends FreePizza{
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Congratulations")
                .setMessage("You just got 5 Dollars off your next Pizza!!")
                .setPositiveButton("YAY", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

     return builder.create();


    }
}
