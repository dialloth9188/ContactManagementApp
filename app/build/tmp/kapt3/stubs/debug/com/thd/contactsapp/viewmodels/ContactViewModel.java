package com.thd.contactsapp.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u0013J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/thd/contactsapp/viewmodels/ContactViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "repository", "Lcom/thd/contactsapp/data/repository/ContactRepository;", "deleteAllContact", "", "deleteContact", "contact", "Lcom/thd/contactsapp/data/model/Contact;", "generateGmailIntentUri", "Landroid/net/Uri;", "email", "", "getAllSearchedContact", "", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getData", "Landroidx/lifecycle/LiveData;", "insertContact", "updateContact", "app_debug"})
public final class ContactViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.thd.contactsapp.data.repository.ContactRepository repository = null;
    
    public ContactViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.thd.contactsapp.data.model.Contact>> getData() {
        return null;
    }
    
    public final void insertContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact) {
    }
    
    public final void updateContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact) {
    }
    
    public final void deleteContact(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact) {
    }
    
    public final void deleteAllContact() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.net.Uri generateGmailIntentUri(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getAllSearchedContact(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.thd.contactsapp.data.model.Contact>> $completion) {
        return null;
    }
}