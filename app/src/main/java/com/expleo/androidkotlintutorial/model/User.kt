package com.expleo.androidkotlintutorial.model

class User(var userId: Int, var id : Int, var title : String, var completed : Boolean) {


    init {
        this.userId = userId
        this.id = id
        this.title = title
        this.completed = completed
    }
}
