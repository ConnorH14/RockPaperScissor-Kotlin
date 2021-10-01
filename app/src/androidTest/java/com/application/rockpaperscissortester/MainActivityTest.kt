package com.application.rockpaperscissortester

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import junit.runner.Version.main

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @get: Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    // checks activity launch and in view
    @Test
    fun test_isActivityInView() {
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    // next 3 tests check if all UI elements are visible and match correct text
    @Test
    fun test_title_visible() {
        onView(withId(R.id.text_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.text_title))
            .check(matches(withText(R.string.app_title)))
    }

    @Test
    fun test_buttons_visible() {
        onView(withId(R.id.rock_button))
            .check(matches(isDisplayed()))
        onView(withId(R.id.paper_button))
            .check(matches(isDisplayed()))
        onView(withId(R.id.scissor_button))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_results_visible() {
        onView(withId(R.id.computer_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.computer_title))
            .check(matches(withText(R.string.computer_title)))

        onView(withId(R.id.computer_choice))
            .check(matches(isDisplayed()))
        onView(withId(R.id.computer_choice))
            .check(matches(withText(R.string.computer_choice)))

        onView(withId(R.id.result_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.result_title))
            .check(matches(withText(R.string.result_title)))

        onView(withId(R.id.result_of_game))
            .check(matches(isDisplayed()))
        onView(withId(R.id.result_of_game))
            .check(matches(withText(R.string.result_of_game)))
    }

    // test clicking rock button
    @Test
    fun test_rock_button_clicked() {
        onView(withId(R.id.rock_button)).perform(click())
    }

    // test clicking paper button
    @Test
    fun test_paper_button_clicked() {
        onView(withId(R.id.paper_button)).perform(click())
    }

    // test clicking scissor button
    @Test
    fun test_scissor_button_clicked() {
        onView(withId(R.id.scissor_button)).perform(click())
    }
}