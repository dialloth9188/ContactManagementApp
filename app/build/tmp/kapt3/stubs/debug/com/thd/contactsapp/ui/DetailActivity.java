package com.thd.contactsapp.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0012\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&H\u0015J\u0010\u0010\'\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020(H\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/thd/contactsapp/ui/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "email", "Landroid/widget/TextView;", "getEmail", "()Landroid/widget/TextView;", "setEmail", "(Landroid/widget/TextView;)V", "image", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImage", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setImage", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "isRecordSaved", "", "nom", "getNom", "setNom", "tel", "getTel", "setTel", "viewModel", "Lcom/thd/contactsapp/viewmodels/ContactViewModel;", "getViewModel", "()Lcom/thd/contactsapp/viewmodels/ContactViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openGmailApp", "", "openMessagingApp", "phoneNumber", "openPhoneApp", "showConfirmationDialog", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    public android.widget.TextView nom;
    public android.widget.TextView tel;
    public android.widget.TextView email;
    public de.hdodenhof.circleimageview.CircleImageView image;
    private final boolean isRecordSaved = false;
    
    public DetailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.thd.contactsapp.viewmodels.ContactViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getNom() {
        return null;
    }
    
    public final void setNom(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTel() {
        return null;
    }
    
    public final void setTel(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final de.hdodenhof.circleimageview.CircleImageView getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull
    de.hdodenhof.circleimageview.CircleImageView p0) {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"MissingInflatedId"})
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void openMessagingApp(java.lang.String phoneNumber) {
    }
    
    private final void openPhoneApp(java.lang.String phoneNumber) {
    }
    
    private final void openGmailApp(java.lang.String email) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void showConfirmationDialog() {
    }
}