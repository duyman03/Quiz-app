package com.phamduymanh.quiz_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phamduymanh.quiz_app.databinding.FragmentLevelBinding;


public class LevelFragment extends Fragment {
    FragmentLevelBinding binding;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLevelBinding.inflate(inflater,container,false);
        //truyen object tu home fragment sang level fragment
        Bundle args = getArguments(); // NHẬN
        Category item = (Category) args.getSerializable("object_item");
        binding.catName.setText(item.getCategoryName()); // HIỆN THỊ TÊN CHỦ ĐỀ ĐÃ CHỌN


        return binding.getRoot();

    }


}