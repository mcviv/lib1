package com.example.library_management_app.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

import com.example.library_management_app.models.Book
import com.example.library_management_app.navigation.ROUTE_BOOK_LIST
import java.util.UUID

class BookViewModel(var navController: NavController, var context: Context){

    fun addBook(filePath: Uri, title: String, author: String) {
        var id = System.currentTimeMillis().toString()
//        var storageReference = FirebaseStorage.getInstance().getReference().child("passport/$id")

//        storageReference.putFile(filePath).addOnCompleteListener{
//            if (it.isSuccessful){
//                storageReference.downloadUrl.addOnSuccessListener{
//                    var imageUrl = it.toString()
//                    var houseData =Book(imageUrl,title,author,id)
//                    var dbRef = FirebaseDatabase.getInstance().getReference().child("Book/$id")
//                    dbRef.setValue(houseData)
//                    Toast.makeText(context,"Client added successfully", Toast.LENGTH_LONG).show()
//                }
//
//            }else{
//                Toast.makeText(context,"${it.exception!!.message}",Toast.LENGTH_LONG).show()
//            }
        }

    }
    fun BookList(client: MutableState<Book>, clients: SnapshotStateList<Book>): SnapshotStateList<Book>{
//        var ref = FirebaseDatabase.getInstance().getReference().child("Book")


//        ref.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {

//                clients.clear()
//                for (snap in snapshot.children){
//                    val value = snap.getValue(Book::class.java)
//                    client.value = value!!
//                    clients.add(value)
//                }
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
//            }
//        })
        return clients
    }
    fun UpdateBook(context: Context,navController: NavController,filePath: Uri,title: String,author: String,id: String){
//        val databaseReference = FirebaseDatabase.getInstance().getReference("Book/$id")

//        if (filePath != Uri.EMPTY) {
//            val storageReference = FirebaseStorage.getInstance().reference
//
//
//
//                .addOnSuccessListener {
//                    imageRef.downloadUrl.addOnSuccessListener { uri ->
//                        val updatedClient = Book(title,author)
//
//                        databaseReference.setValue(updatedClient)
//                            .addOnCompleteListener { task ->
//                                if (task.isSuccessful) {
//                                    Toast.makeText(context, "Update successful", Toast.LENGTH_SHORT).show()
//                                    navController.navigate(ROUTE_BOOK_LIST)
//                                } else {
//                                    Toast.makeText(context, "Update failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
//                                }
//                            }
//                    }
//                }
//
//        } else {
//            // Keep the current image URL if no new image is selected
//            val updatedClient = Book(author,title)
//            databaseReference.setValue(updatedClient)
//                .addOnCompleteListener { task ->
//                    if (task.isSuccessful) {
//                        Toast.makeText(context, "Update successful", Toast.LENGTH_SHORT).show()
//                        navController.navigate(ROUTE_BOOK_LIST)
//                    } else {
//                        Toast.makeText(context, "Update failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
//                    }
//                }
//        }
    }

    fun DeleteBook(context: Context, id: String, navController: NavController) {
//        // Initialize a ProgressDialog (if desired, or use another indicator)
//        val progressDialog = ProgressDialog(context).apply {
//            setMessage("Deleting Book...")
//            setCancelable(false)
//            show()
//        }
//
//        // Reference to Firebase Realtime Database for the specific client
//        val delRef = FirebaseDatabase.getInstance().getReference("Book/$id")
//
//        // Perform the delete operation
//        delRef.removeValue().addOnCompleteListener { task ->
//            // Dismiss the progress dialog
//            progressDialog.dismiss()
//
//            if (task.isSuccessful) {
//                // If deletion was successful, show success message
//                Toast.makeText(context, "Book deleted successfully", Toast.LENGTH_SHORT).show()
//
//                // Navigate to a different screen after deletion
//                navController.navigate(ROUTE_BOOK_LIST)
//            } else {
//                // If deletion failed, show error message
//                Toast.makeText(context, task.exception?.message ?: "Deletion failed", Toast.LENGTH_SHORT).show()
//            }
//        }
    }

    fun BorrowedBook(title: String, author: String, borrower: String, returnDate: String) {
//        val _borrowedBooks = mutableStateListOf<Book.BorrowedBook>()
//        val borrowedBooks: List<Book.BorrowedBook> get() = _borrowedBooks
//
//        _borrowedBooks.add(Book.BorrowedBook(title, author, borrower, returnDate))
//    }

}










