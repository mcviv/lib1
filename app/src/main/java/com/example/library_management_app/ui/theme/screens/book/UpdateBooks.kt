package com.example.library_management_app.ui.theme.screens.book


import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.library_management_app.models.Book

@Composable
fun BookUpdate(navController: NavController, id: String) {
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) {}

    var title by remember { mutableStateOf("") }
    var author by remember { mutableStateOf("") }

    val context = LocalContext.current

//    val currentDataRef = FirebaseDatabase.getInstance().getReference()
//        .child("Book/$id")


//    DisposableEffect(Unit) {
//        val listener = object : ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {
//                val client = snapshot.getValue(Book::class.java)
//                client?.let {
//                    title = it.title
//                    author = it.author
//                }
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
//            }
//        }
//        currentDataRef.addValueEventListener(listener)
//        onDispose { currentDataRef.removeEventListener(listener) }
//    }























    Column(modifier = Modifier.padding(16.dp)) {
        Text("Update", style = MaterialTheme.typography.bodyMedium)

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
//            bookViewModel.addBook(title, author)
            title = ""
            author = ""
        }) {
            androidx.compose.material3.Text("Update Book")
        }

    }
}

private fun ColumnScope.Text(s: String, style: TextStyle) {

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBookUpdate() {
    BookUpdate(rememberNavController())
}
