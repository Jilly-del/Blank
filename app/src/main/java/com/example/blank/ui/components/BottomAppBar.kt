import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blank.model.Screens
import com.example.blank.ui.screens.Favourite
import com.example.blank.ui.screens.Home
import com.example.blank.ui.screens.Profile
import com.example.blank.ui.screens.Settings

@Composable
fun MyBottomAppBar(modifier: Modifier = Modifier) {
    var navController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Filled.Home)
    }
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Gray
            ) {
                IconButton(
                    onClick = {
                        selected.value = Icons.Filled.Home
                        navController.navigate(Screens.Home.screens){popUpTo(0)}

                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        Icons.Default.Home,
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp),
                        tint = if (selected.value == Icons.Default.Home) Color.White else Color.Red

                    )

                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Filled.Favorite
                        navController.navigate(Screens.Favourite.screens){popUpTo(0)}

                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        Icons.Default.Favorite,
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp),
                        tint = if (selected.value == Icons.Default.Favorite) Color.White else Color.Red
                    )

                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Filled.Settings
                        navController.navigate(Screens.Settings.screens){popUpTo(0)}

                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        Icons.Default.Home,
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp),
                        tint = if (selected.value == Icons.Default.Settings) Color.White else Color.Red
                    )

                }

                IconButton(
                    onClick = {
                        selected.value = Icons.Filled.Person
                        navController.navigate(Screens.Profile.screens){popUpTo(0)}

                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = null,
                        modifier = Modifier
                            .size(26.dp),
                        tint = if (selected.value == Icons.Default.Person) Color.White else Color.Red

                    )

                }

            }

        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.Home.screens,
            modifier = Modifier.padding(paddingValues)
        ){
            composable(Screens.Home.screens) { Home() }
            composable(Screens.Home.screens) { Favourite() }
            composable(Screens.Home.screens) { Profile() }
            composable(Screens.Home.screens) { Settings() }
        }
    }
    
}