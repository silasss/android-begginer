package com.whatsapp.silas.whatsappshowmesseger;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteException;

/**
 * Created by silas on 16/03/16.
 */
public class TblConta extends SQLiteOpenHelper {
    private static final String BANCO         = "finance.db";
    private static final String TABELA        = "conta";
    private static final String ID_CONTA      = "id_conta";
    private static final String NM_CONTA      = "nm_conta";
    private static final String DS_CONTA      = "ds_conta";
    private static final String SALDO_CONTA   = "saldo_conta";
    private static final String DT_CRIA_CONTA = "dt_cria_conta";
    private static final String DT_ALT_CONTA  = "dt_alt_conta";
    private static final String STATUS_CONTA  = "status_conta";

    private static final int VERSAO = 1;

    public TblConta(Context context) {
        super(context, BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABELA + "("
                + ID_CONTA + " integer primary key autoincrement,"
                + NM_CONTA + " text not null,"
                + DS_CONTA + " text,"
                + SALDO_CONTA + " real,"
                + STATUS_CONTA + " boolean,"
                + DT_CRIA_CONTA + " datetime,"
                + DT_ALT_CONTA + " datetime"
                +")";

        db.execSQL(sql);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Only Alter table
    }

}
