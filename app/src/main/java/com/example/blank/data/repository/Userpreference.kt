package com.example.blank.data.repository

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "user_prefs")

class UserpreferenceRepository(private val context: Context){
    companion object {
        private val FIRST_NAME_KEY = stringPreferencesKey(name = "firstname")

    }
    suspend fun saveFirstName(username : String){
        context.dataStore.edit { prefs -> prefs[FIRST_NAME_KEY] = username }
    }

    val firstNameFlow = context.dataStore.data.map { prefs -> prefs[FIRST_NAME_KEY]?: "" }

}