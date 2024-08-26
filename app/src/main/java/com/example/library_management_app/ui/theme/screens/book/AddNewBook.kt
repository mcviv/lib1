package com.example.library_management_app.ui.theme.screens.book

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.library_management_app.data.BookViewModel
import com.example.library_management_app.navigation.ROUTE_BOOK_LIST
import kotlin.coroutines.jvm.internal.CompletedContinuation.context

//import kotlinx.coroutines.flow.internal.NoOpContinuation.context

//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

@Composable
fun AddBook(navController: NavController) {
    var title by remember { mutableStateOf("") }
    var author by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Add a Book", style = MaterialTheme.typography.bodyMedium)

        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { androidx.compose.material3.Text("Title") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = author,
            onValueChange = { author = it },
            label = { androidx.compose.material3.Text("Author") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {
            val clientRepository = BookViewModel(navController, context )


            BookViewModel.addBook(title = title, author = author)
            navController.navigate(ROUTE_BOOK_LIST)


        }) {
            androidx.compose.material3.Text("Add Book")
        }



}


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AddBookPreview() {
    AddBook(rememberNavController())
}
