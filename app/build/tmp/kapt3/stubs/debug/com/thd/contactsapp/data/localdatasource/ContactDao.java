package com.thd.contactsapp.data.localdatasource;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/thd/contactsapp/data/localdatasource/ContactDao;", "", "deleteAllContact", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContact", "contact", "Lcom/thd/contactsapp/data/model/Contact;", "(Lcom/thd/contactsapp/data/model/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllContacts", "Landroidx/lifecycle/LiveData;", "", "getDaoSearch", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertContact", "updateContact", "app_debug"})
@androidx.room.Dao
public abstract interface ContactDao {
    
    @androidx.room.Query(value = "SELECT * FROM contact_table")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.thd.contactsapp.data.model.Contact>> getAllContacts();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM contact_table WHERE nom_table LIKE \'%\' || :query || \'%\' OR telephone LIKE \'%\' || :query || \'%\'")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDaoSearch(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.thd.contactsapp.data.model.Contact>> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM contact_table")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllContact(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}