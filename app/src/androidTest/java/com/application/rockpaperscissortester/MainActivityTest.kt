package com.application.rockpaperscissortester

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import junit.runner.Version.main

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
    // checks activity launch and in view
    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    // next 3 tests check if all UI elements are visible
    @Test
    fun test_title_visible() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.text_title))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_buttons_visible() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.rock_button))
            .check(matches(isDisplayed()))
        onView(withId(R.id.paper_button))
            .check(matches(isDisplayed()))
        onView(withId(R.id.scissor_button))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_results_visible() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.computer_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.computer_choice))
            .check(matches(isDisplayed()))
        onView(withId(R.id.result_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.result_of_game))
            .check(matches(isDisplayed()))

    }
}