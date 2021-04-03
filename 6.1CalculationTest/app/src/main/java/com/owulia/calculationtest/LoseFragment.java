package com.owulia.calculationtest;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.owulia.calculationtest.databinding.FragmentLoseBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoseFragment extends Fragment {


    public LoseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        MyViewModel myViewModel = new ViewModelProvider(requireActivity(),
                new SavedStateViewModelFactory(requireActivity().getApplication(), requireActivity()))
                .get(MyViewModel.class);

        FragmentLoseBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_lose, container, false);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(requireActivity());

        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController controller = Navigation.findNavController(view);
                controller.navigate(R.id.action_loseFragment_to_titleFragment);
            }
        });

        return binding.getRoot();
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_lose, container, false);
    }

}
