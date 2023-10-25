package com.thd.contactsapp.data.localdatasource;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.thd.contactsapp.data.model.Contact;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ContactDao_Impl implements ContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Contact> __insertionAdapterOfContact;

  private final EntityDeletionOrUpdateAdapter<Contact> __deletionAdapterOfContact;

  private final EntityDeletionOrUpdateAdapter<Contact> __updateAdapterOfContact;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllContact;

  public ContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfContact = new EntityInsertionAdapter<Contact>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `contact_table` (`id`,`nom_table`,`telephone`,`email`,`image`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Contact value) {
        stmt.bindLong(1, value.getId());
        if (value.getNomComplet() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNomComplet());
        }
        if (value.getTelephone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTelephone());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
      }
    };
    this.__deletionAdapterOfContact = new EntityDeletionOrUpdateAdapter<Contact>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `contact_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Contact value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfContact = new EntityDeletionOrUpdateAdapter<Contact>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `contact_table` SET `id` = ?,`nom_table` = ?,`telephone` = ?,`email` = ?,`image` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Contact value) {
        stmt.bindLong(1, value.getId());
        if (value.getNomComplet() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNomComplet());
        }
        if (value.getTelephone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTelephone());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        stmt.bindLong(6, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllContact = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM contact_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertContact(final Contact contact, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfContact.insert(contact);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteContact(final Contact contact, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfContact.handle(contact);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateContact(final Contact contact, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfContact.handle(contact);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteAllContact(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllContact.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllContact.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<Contact>> getAllContacts() {
    final String _sql = "SELECT * FROM contact_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"contact_table"}, false, new Callable<List<Contact>>() {
      @Override
      public List<Contact> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNomComplet = CursorUtil.getColumnIndexOrThrow(_cursor, "nom_table");
          final int _cursorIndexOfTelephone = CursorUtil.getColumnIndexOrThrow(_cursor, "telephone");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<Contact> _result = new ArrayList<Contact>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Contact _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNomComplet;
            if (_cursor.isNull(_cursorIndexOfNomComplet)) {
              _tmpNomComplet = null;
            } else {
              _tmpNomComplet = _cursor.getString(_cursorIndexOfNomComplet);
            }
            final String _tmpTelephone;
            if (_cursor.isNull(_cursorIndexOfTelephone)) {
              _tmpTelephone = null;
            } else {
              _tmpTelephone = _cursor.getString(_cursorIndexOfTelephone);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new Contact(_tmpId,_tmpNomComplet,_tmpTelephone,_tmpEmail,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getDaoSearch(final String query,
      final Continuation<? super List<Contact>> $completion) {
    final String _sql = "SELECT * FROM contact_table WHERE nom_table LIKE '%' || ? || '%' OR telephone LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Contact>>() {
      @Override
      public List<Contact> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNomComplet = CursorUtil.getColumnIndexOrThrow(_cursor, "nom_table");
          final int _cursorIndexOfTelephone = CursorUtil.getColumnIndexOrThrow(_cursor, "telephone");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<Contact> _result = new ArrayList<Contact>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Contact _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNomComplet;
            if (_cursor.isNull(_cursorIndexOfNomComplet)) {
              _tmpNomComplet = null;
            } else {
              _tmpNomComplet = _cursor.getString(_cursorIndexOfNomComplet);
            }
            final String _tmpTelephone;
            if (_cursor.isNull(_cursorIndexOfTelephone)) {
              _tmpTelephone = null;
            } else {
              _tmpTelephone = _cursor.getString(_cursorIndexOfTelephone);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            _item = new Contact(_tmpId,_tmpNomComplet,_tmpTelephone,_tmpEmail,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
