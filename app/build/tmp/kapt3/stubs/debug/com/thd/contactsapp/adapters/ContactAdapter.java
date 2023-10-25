package com.thd.contactsapp.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/thd/contactsapp/adapters/ContactAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/thd/contactsapp/data/model/Contact;", "Lcom/thd/contactsapp/adapters/ContactAdapter$ContactViewHolder;", "listner", "Lcom/thd/contactsapp/ui/MainActivity;", "(Lcom/thd/contactsapp/ui/MainActivity;)V", "getListner", "()Lcom/thd/contactsapp/ui/MainActivity;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ContactViewHolder", "app_debug"})
public final class ContactAdapter extends androidx.recyclerview.widget.ListAdapter<com.thd.contactsapp.data.model.Contact, com.thd.contactsapp.adapters.ContactAdapter.ContactViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.thd.contactsapp.ui.MainActivity listner = null;
    
    public ContactAdapter(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.ui.MainActivity listner) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.thd.contactsapp.ui.MainActivity getListner() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.thd.contactsapp.adapters.ContactAdapter.ContactViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.thd.contactsapp.adapters.ContactAdapter.ContactViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/thd/contactsapp/adapters/ContactAdapter$ContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/thd/contactsapp/adapters/ContactAdapter;Landroid/view/View;)V", "image", "Lde/hdodenhof/circleimageview/CircleImageView;", "kotlin.jvm.PlatformType", "getImage", "()Lde/hdodenhof/circleimageview/CircleImageView;", "nomComplet", "Landroid/widget/TextView;", "getNomComplet", "()Landroid/widget/TextView;", "bind", "", "contact", "Lcom/thd/contactsapp/data/model/Contact;", "app_debug"})
    public final class ContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView nomComplet = null;
        private final de.hdodenhof.circleimageview.CircleImageView image = null;
        
        public ContactViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.TextView getNomComplet() {
            return null;
        }
        
        public final de.hdodenhof.circleimageview.CircleImageView getImage() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.thd.contactsapp.data.model.Contact contact) {
        }
    }
}