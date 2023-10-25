package com.thd.contactsapp.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/thd/contactsapp/data/repository/ContactRepository;", "", "()V", "dao", "Lcom/thd/contactsapp/data/localdatasource/ContactDao;", "deleteAllContact", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContact", "contact", "Lcom/thd/contactsapp/data/model/Contact;", "(Lcom/thd/contactsapp/data/model/Contact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getContacts", "Landroidx/lifecycle/LiveData;", "", "getSearchContact", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertContact", "updateContact", "app_debug"})
public final class ContactRepository {
    @org.jetbrains.annotations.NotNull
    private final com.thd.contactsapp.data.localdatasource.ContactDao dao = null;
    
    public ContactRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.thd.contactsapp.data.model.Contact>> getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteAllContact(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSearchContact(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.thd.contactsapp.data.model.Contact>> $completion) {
        return null;
    }
}