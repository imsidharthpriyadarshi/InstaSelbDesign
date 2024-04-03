package com.example.instasleb.fragments;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.instasleb.R;
import com.example.instasleb.databinding.FragmentHomeBinding;


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
        homeBinding.bigDialogBox.noBtn.setOnClickListener(view1 -> Toast.makeText(requireActivity(), "Oh, You are not eligible to use our services", Toast.LENGTH_SHORT).show());
        homeBinding.bigDialogBox.yesBtn.setOnClickListener(view12 -> Toast.makeText(requireActivity(), "Oh, You are eligible to use our services", Toast.LENGTH_SHORT).show());
    }
}