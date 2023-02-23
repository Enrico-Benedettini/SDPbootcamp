package com.github.Enrico_Benedettini.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void setIntent(){
        Intents.init();
    }

    @After
    public void releaseIntent(){
        Intents.release();
    }

    @Test
    public void testEditText(){
        onView(withId(R.id.mainName)).perform(typeText("name"), closeSoftKeyboard());
        onView(withId(R.id.mainGoButton)).perform(click());
        intended(toPackage("com.github.Enrico_Benedettini.bootcamp"));
    }
}
