package com.chamodshehanka.madrumorpaper.database;

import android.provider.BaseColumns;

public class EmployeeInfo implements BaseColumns {

    private EmployeeInfo(){}

    public static final String TABLE_NAME = "EmployeeInfo";
    public static final String COLUMN_1 = "empName";
    public static final String COLUMN_2 = "empTelephone";
    public static final String COLUMN_3 = "empGender";
    public static final String COLUMN_4 = "empType";
}
