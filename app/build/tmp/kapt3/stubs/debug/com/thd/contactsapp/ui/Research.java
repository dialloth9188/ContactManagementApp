package com.thd.contactsapp.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0015J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/thd/contactsapp/ui/Research;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/thd/contactsapp/adapters/SearchAdapter;", "rvSearch", "Landroidx/recyclerview/widget/RecyclerView;", "svSearch", "Landroid/widget/EditText;", "viewModel", "Lcom/thd/contactsapp/viewmodels/ContactViewModel;", "getViewModel", "()Lcom/thd/contactsapp/viewmodels/ContactViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "performSearch", "query", "", "app_debug"})
public final class Research extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText svSearch;
    private androidx.recyclerview.widget.RecyclerView rvSearch;
    private com.thd.contactsapp.adapters.SearchAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public Research() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.thd.contactsapp.viewmodels.ContactViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void performSearch(java.lang.String query) {
    }
}