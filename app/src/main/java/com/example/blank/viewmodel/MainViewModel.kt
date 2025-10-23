package com.example.blank.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.datastore.dataStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blank.data.repository.UserpreferenceRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MainViewModel (private  val datstore : UserpreferenceRepository) : ViewModel(){
    val _firstname = MutableStateFlow("")
    val firstname : StateFlow<String> = _firstname

    init{
        viewModelScope.launch {
            datstore.firstNameFlow.collectLatest { _firstname.value = it }

        }
    }

    fun saveUsername(newName : String){
        viewModelScope.launch { datstore.saveFirstName(newName) }
    }

}

