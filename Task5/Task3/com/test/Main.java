/*
 3. Create a package com.media. 

Define a base class Media with: 

A method displayInfo() that prints "Generic media info". 

Create a subclass Book that overrides displayInfo() to print "Book information". 

Create another subclass CD that overrides displayInfo() to print "CD information". 

Create another subclass DVD that overrides displayInfo() to print "DVD information". 

In a package com.test, create a main class that creates an array of Media and stores instances of Book, CD, and DVD. 

Use a loop to call the displayInfo() method on each media in the array. 

 */

package com.test;

import com.media.*;

public class Main {
    public static void main(String[] args) {
        Media[] mediaArray = {new Book(), new CD(), new DVD()};

        for (Media media : mediaArray) {
            media.displayInfo();
        }
    }
}
