package com.thd.contactsapp.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0015J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J-\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006#"}, d2 = {"Lcom/thd/contactsapp/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/thd/contactsapp/adapters/OnContactClickListner;", "()V", "PERMISSION_REQUEST_CODE", "", "isRecordSaved", "", "viewModel", "Lcom/thd/contactsapp/viewmodels/ContactViewModel;", "getViewModel", "()Lcom/thd/contactsapp/viewmodels/ContactViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "contact", "Lcom/thd/contactsapp/data/model/Contact;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestStoragePermission", "showConfirmationDialog", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.thd.contactsapp.adapters.OnContactClickListner {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private final int PERMISSION_REQUEST_CODE = 123;
    private final boolean isRecordSaved = false;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.thd.contactsapp.viewmodels.ContactViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"MissingInflatedId", "SuspiciousIndentation"})
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void requestStoragePermission() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.data.model.Contact contact) {
    }
    
    private final void showConfirmationDialog() {
    }
}