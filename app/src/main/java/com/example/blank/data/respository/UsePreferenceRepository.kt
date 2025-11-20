package com.example.blank.data.respository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map



private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "user_prefs")

class UsePreferenceRepository(private val context: Context){
    companion object {
        private  val FIRST_NAME_KEY = stringPreferencesKey("firstname")
    }

    val storedfirstName: Flow<String?> = context.dataStore.data.map { prefs ->
        prefs[FIRST_NAME_KEY]

    }

    suspend fun storeFirstName(firstname:String){
        context.dataStore.edit { prefs ->
            prefs[FIRST_NAME_KEY] = firstname
        }
    }

    suspend fun clearFirstName(){
        context.dataStore.edit { prefs ->
            prefs.remove(FIRST_NAME_KEY)
        }
    }



}
















