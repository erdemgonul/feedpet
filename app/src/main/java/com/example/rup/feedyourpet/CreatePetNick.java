package com.example.rup.feedyourpet;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreatePetNick extends android.support.v4.app.Fragment {

    Button nextbutton;
    ViewPager viewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_create_pet_nick, container, false);


        nextbutton=v.findViewById(R.id.createpetnext1_button);
        viewPager=getActivity().findViewById(R.id.viewPager);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);

                viewPager.setCurrentItem(1, true);
            }
        });
        return v;
    }

    public static CreatePetNick newInstance() {
        return new CreatePetNick();
    }

}
