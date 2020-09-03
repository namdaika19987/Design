package com.example.design;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class RegistrationPhone extends AppCompatActivity {

    SliderView sliderView;
    private SliderAdapterExample adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_phone);

        sliderView = findViewById(R.id.imageSlider);
        adapter = new SliderAdapterExample(this);
        addData();
        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(sliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                Log.i("GGG", "onIndicatorClicked:" + sliderView.getCurrentPagePosition());
            }
        });
    }

    ArrayList<SliderItem> sliderItems = new ArrayList<SliderItem>();

    public void addData() {
        String tittle_1 = "Kết nối";
        String tittle_2 = "Thông báo";
        String tittle_3 = "Chia sẻ";

        String text_1 = "Giúp kết nối với những người quan trong nhất với bạn";
        String text_2 = "Nhận thông báo theo thời gian khi thành viên gia đình bạn bè khi đến và đi";
        String text_3 = "Chia sẻ địa điểm với các thành viên trong các nhóm của bạn";

        sliderItems.add(new SliderItem(text_1,R.drawable.image1));
        sliderItems.add(new SliderItem(text_2,R.drawable.image2));
        sliderItems.add(new SliderItem(text_3,R.drawable.image3));
        adapter.renewItems(sliderItems);
    }
}