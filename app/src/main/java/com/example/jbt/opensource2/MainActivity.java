package com.example.jbt.opensource2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
//DONT FORGET ADD THIS TO MODULE INSIDE DEPENDENCIES : compile 'com.github.satyan:sugar:1.5'
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         Book book1 = new Book("Harry potter", "Rolling", 500);




         //check if specific record already exists in database
   /*    if( Book.find(Book.class," TITLE = 'Harry potter' ").isEmpty()){// if row with title HarryPotter  returns true on isEmpty method then there no such row in database
         Log.e("true","true");
       }else{
           Log.e("false ","false");
       }  */



/*

        //ADD book to database
       book.save();

        //DELETE all books
        List<Book> books = Book.listAll(Book.class);
        Book.deleteAll(Book.class);

        //SELECT from db by id
         book = Book.findById(Book.class, 1);

        //DELETE book by its id
        book = Book.findById(Book.class, 1);
        book.delete();

        //UPDATE by id
         book = Book.findById(Book.class, 1);
         book.title = "updated title here"; // modify the values
         book.author = "Philip.k.Dick";
         book.save();

         */
    }
}

