package com.example.listycity

// Default values let Firestore construct a City with its no-arg
// constructor when deserializing a document.
data class City(
    val name: String = "",
    val province: String = ""
)