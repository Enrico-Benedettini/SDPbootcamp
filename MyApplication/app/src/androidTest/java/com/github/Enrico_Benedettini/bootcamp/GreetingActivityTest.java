package com.github.Enrico_Benedettini.bootcamp;

import static androidx.test.espresso.matcher.ViewMatchers.assertThat;

import static org.junit.Assert.assertEquals;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void testTextView(){
        Intent myIntent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        try(ActivityScenario scenario = ActivityScenario.launch(myIntent)) {
            scenario.onActivity(activity -> {
                assertEquals(activity.getIntent().getExtras(),null);
            });
        }

    }
}
