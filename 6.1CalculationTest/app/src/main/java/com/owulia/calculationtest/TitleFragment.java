package com.owulia.calculationtest;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.savedstate.SavedStateRegistryOwner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.owulia.calculationtest.databinding.FragmentTitleBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class TitleFragment extends Fragment {


    public TitleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        MyViewModel myViewModel = new ViewModelProvider(requireActivity(),
                new SavedStateViewModelFactory(requireActivity().getApplication(), requireActivity()))
                .get(MyViewModel.class);

//        final MyViewModel myViewModel = new ViewModelProvider(requireActivity(), new ViewModelProvider.NewInstanceFactory())
//                .get(MyViewModel.class);

        FragmentTitleBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(requireActivity());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController controller = Navigation.findNavController(view);
                controller.navigate(R.id.action_titleFragment_to_questionFragment);
            }
        });

        return binding.getRoot();
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_title, container, false);
    }

}
