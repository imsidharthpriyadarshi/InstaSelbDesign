package com.example.instasleb.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.instasleb.R;
import com.example.instasleb.databinding.FragmentHomeBinding;
import com.google.android.material.snackbar.Snackbar;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding homeBinding;

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        homeBinding=FragmentHomeBinding.inflate(inflater,container,false);

        return homeBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        clickOperations(view);

    }

    private void clickOperations(View view) {
        homeBinding.bigDialogBox.noBtn.setOnClickListener(view1 -> showSnackBar("No Btn Clicked",view));
        homeBinding.bigDialogBox.yesBtn.setOnClickListener(view12 -> showSnackBar("Yes Btn Clicked",view));

    }

    private void showSnackBar(String msg, View view){
        Snackbar customSnackbar = Snackbar.make(view, "", Snackbar.LENGTH_LONG);

        TextView snackBarText = customSnackbar.getView().findViewById(com.google.android.material.R.id.snackbar_text);
        snackBarText.setTextSize(1);

        @SuppressLint("RestrictedApi") Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) customSnackbar.getView();
        View customView = LayoutInflater.from(requireActivity()).inflate(R.layout.custom_snackbar, null);

        TextView textView = customView.findViewById(R.id.text_message);
        textView.setText(msg);

        snackbarLayout.addView(customView, 0);
        customSnackbar.show();
    }
}