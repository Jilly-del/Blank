package com.example.blank.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.blank.data.respository.UsePreferenceRepository
import kotlinx.coroutines.launch


class MainViewModel (application: Application) : AndroidViewModel(application){
    private val repository = UsePreferenceRepository(application.applicationContext)

val firstName = repository.storedfirstName

    fun SavefirstName (firstname : String){
     viewModelScope.launch {
         repository.storeFirstName(firstname)
     }
    }

    fun clearfirstName(){
        viewModelScope.launch {
            repository.clearFirstName()
        }
    }

}