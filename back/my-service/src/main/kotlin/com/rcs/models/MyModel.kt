package com.rcs.models

import jakarta.persistence.*

@Entity
@Table(name = "my_models")
data class MyModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val text: String = ""
)