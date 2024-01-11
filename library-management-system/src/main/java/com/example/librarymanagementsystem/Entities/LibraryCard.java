package com.example.librarymanagementsystem.Entities;

import com.example.librarymanagementsystem.Enums.CardStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "library_card")
public class LibraryCard {
    @Id
    private Integer cardId;
    // This is the annotation for mysql to understand custom data type and to store it as a string format inside
    // the DB
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
    private int noOfBooksIssued;



}
