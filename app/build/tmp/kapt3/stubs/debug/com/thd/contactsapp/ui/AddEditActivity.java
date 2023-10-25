package com.thd.contactsapp.ui;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\u0012\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020$H\u0002J\b\u0010,\u001a\u00020$H\u0002J\n\u0010-\u001a\u0004\u0018\u00010.H\u0002J\n\u0010/\u001a\u0004\u0018\u00010.H\u0002J\n\u00100\u001a\u0004\u0018\u00010.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u00061"}, d2 = {"Lcom/thd/contactsapp/ui/AddEditActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/thd/contactsapp/databinding/ActivityAddEditBinding;", "email", "Lcom/google/android/material/textfield/TextInputLayout;", "getEmail", "()Lcom/google/android/material/textfield/TextInputLayout;", "setEmail", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "images", "Lde/hdodenhof/circleimageview/CircleImageView;", "getImages", "()Lde/hdodenhof/circleimageview/CircleImageView;", "setImages", "(Lde/hdodenhof/circleimageview/CircleImageView;)V", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/PickVisualMediaRequest;", "kotlin.jvm.PlatformType", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "nom", "getNom", "setNom", "tel", "getTel", "setTel", "url", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "setUrl", "(Landroid/net/Uri;)V", "emaiFocusListener", "", "enregistrerContact", "nomFocusListener", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveContact", "telephoneFocusListener", "updateContact", "validEmail", "", "validatenom", "validtelephone", "app_debug"})
public final class AddEditActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.thd.contactsapp.databinding.ActivityAddEditBinding binding;
    public com.google.android.material.textfield.TextInputLayout nom;
    public com.google.android.material.textfield.TextInputLayout tel;
    public com.google.android.material.textfield.TextInputLayout email;
    public de.hdodenhof.circleimageview.CircleImageView images;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri url;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.PickVisualMediaRequest> launcher = null;
    
    public AddEditActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.textfield.TextInputLayout getNom() {
        return null;
    }
    
    public final void setNom(@org.jetbrains.annotations.NotNull
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.textfield.TextInputLayout getTel() {
        return null;
    }
    
    public final void setTel(@org.jetbrains.annotations.NotNull
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.textfield.TextInputLayout getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull
    com.google.android.material.textfield.TextInputLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final de.hdodenhof.circleimageview.CircleImageView getImages() {
        return null;
    }
    
    public final void setImages(@org.jetbrains.annotations.NotNull
    de.hdodenhof.circleimageview.CircleImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getUrl() {
        return null;
    }
    
    public final void setUrl(@org.jetbrains.annotations.Nullable
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.PickVisualMediaRequest> getLauncher() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void enregistrerContact() {
    }
    
    private final void saveContact() {
    }
    
    private final void updateContact() {
    }
    
    private final void nomFocusListener() {
    }
    
    private final java.lang.String validatenom() {
        return null;
    }
    
    private final void emaiFocusListener() {
    }
    
    private final java.lang.String validEmail() {
        return null;
    }
    
    private final void telephoneFocusListener() {
    }
    
    private final java.lang.String validtelephone() {
        return null;
    }
}