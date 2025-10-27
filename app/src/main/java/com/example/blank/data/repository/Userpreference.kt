package com.example.blank.data.repository

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

// Declare a single DataStore instance for storing user data
val Context.dataStore by preferencesDataStore(name = "user_data")

class UserpreferenceRepository(private val context: Context){
// create a private key that defines the name and type of the preference
    companion object {
        private val FIRST_NAME_KEY = stringPreferencesKey(name = "firstname")
    }

// Edit the preferences and assign the new value to the key.
    suspend fun saveFirstName(username : String){
        context.dataStore.edit { prefs -> prefs[FIRST_NAME_KEY] = username }
    }
//  Reads the current value and automatically updates when the value changes in DataStore
    val firstNameFlow = context.dataStore.data.map { prefs -> prefs[FIRST_NAME_KEY]?: " " }
}