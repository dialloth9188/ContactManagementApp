package com.thd.contactsapp.data.localdatasource;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/thd/contactsapp/data/localdatasource/ContactDatabase;", "Landroidx/room/RoomDatabase;", "()V", "doa", "Lcom/thd/contactsapp/data/localdatasource/ContactDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.thd.contactsapp.data.model.Contact.class}, version = 2)
public abstract class ContactDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.Nullable
    private static com.thd.contactsapp.data.localdatasource.ContactDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.thd.contactsapp.data.localdatasource.ContactDatabase.Companion Companion = null;
    
    public ContactDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.thd.contactsapp.data.localdatasource.ContactDao doa();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/thd/contactsapp/data/localdatasource/ContactDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/thd/contactsapp/data/localdatasource/ContactDatabase;", "getINSTANCE", "()Lcom/thd/contactsapp/data/localdatasource/ContactDatabase;", "setINSTANCE", "(Lcom/thd/contactsapp/data/localdatasource/ContactDatabase;)V", "getDatabaseInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.thd.contactsapp.data.localdatasource.ContactDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.Nullable
        com.thd.contactsapp.data.localdatasource.ContactDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.thd.contactsapp.data.localdatasource.ContactDatabase getDatabaseInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}