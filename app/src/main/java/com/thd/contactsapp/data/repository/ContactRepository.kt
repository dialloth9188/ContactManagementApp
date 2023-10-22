package com.thd.contactsapp.data.repository

import androidx.lifecycle.LiveData
import com.thd.contactsapp.ContactApp
import com.thd.contactsapp.data.localdatasource.ContactDatabase
import com.thd.contactsapp.data.model.Contact

class ContactRepository {
    private val dao= ContactDatabase.getDatabaseInstance(ContactApp.getAppContext()).doa()

    fun getContacts():LiveData<List<Contact>>{
        return dao.getAllContacts()
    }

    suspend fun insertContact(contact:Contact){
        dao.insertContact(contact)
    }

    suspend fun  deleteContact(contact:Contact){
        dao.deleteContact(contact)
    }

    suspend fun  deleteAllContact(){
        dao.deleteAllContact()
    }

    suspend fun  updateContact(contact:Contact){
        dao.updateContact(contact)
    }

    suspend fun getSearchContact(query: String): List<Contact> {
        return dao.getDaoSearch(query)
    }



}