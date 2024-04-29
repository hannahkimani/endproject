package net.ezra.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.R
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {


 Column (
     modifier = Modifier
         .fillMaxSize()
 ){


     Column {
         Column(

         ) {
             Row(
                 Modifier
                     .fillMaxWidth(),
                 horizontalArrangement = Arrangement.SpaceBetween


             ) {

                 val paddingModifier = Modifier.padding(10.dp)
                 Card(
                     elevation = CardDefaults.cardElevation(10.dp),
                     modifier = paddingModifier
                 )
                 {
                     Text(text = "Hey", modifier = paddingModifier)

                 }

                 Icon(
                     imageVector = Icons.Default.Search,
                     contentDescription = "fab icon",
                     Modifier.padding(14.dp)
                 )

             }


         }






     }

     Column (
         horizontalAlignment = Alignment.CenterHorizontally
     ){

Column {
    Text(text = "Weekly Total")
    Text(text = "Ksh 0.00")



}





         Column (
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(10.dp)



         ){
             Text(text = "Analytics:")
         }

         Column(
             modifier = Modifier
                 .fillMaxSize()
                 .padding(top = 0.dp),
             horizontalAlignment = Alignment.CenterHorizontally


         )

         {
             Image(
                 painter = painterResource(id = R.drawable.img_3),
                 contentDescription = "img_3",


                 )
         }


     }







 }
Column (
    modifier = Modifier
        .padding(top = 190.dp)
        .padding(90.dp)
){
    Text(text = "Add your first expense")
}


Column {
    Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "img_5")
}








}













    @Preview(showBackground = true)
        @Composable
        fun PreviewLight() {
            HomeScreen(rememberNavController())
        }

