package com.example.rup.feedyourpet;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * A simple {@link Fragment} subclass.
 */
public class CreatePetType extends android.support.v4.app.Fragment {


    Button nextbutton;
    ViewPager viewPager;
    ListView listView;

    @Override
    public void onStart() {
        super.onStart();

        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(getView().getWindowToken(), 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_create_pet_type, container, false);




        listView=v.findViewById(R.id.pet_type_list);
        nextbutton=v.findViewById(R.id.createpetnext2_button);
        viewPager=getActivity().findViewById(R.id.viewPager);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0, true);
            }
        });
        Animal[] arrayAnimal=new Animal[]{
                new Animal("Cat","a sweet cat",R.drawable.cat),
                new Animal("Dog","barking lorem ipsum",R.drawable.dog),
                new Animal("Fish","easy to care",R.drawable.fish)
        };


        List<Animal> list=new ArrayList<Animal>(Arrays.asList(arrayAnimal));
        AnimalArrayAdapter adapter=new AnimalArrayAdapter(getActivity(),list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        return v;
    }

    public static CreatePetType newInstance() {
        return new CreatePetType();
    }

}
