#ifndef TABLE_H
#define TABLE_H
#include"Column.h"
#include"Row.h"
#include<bits/stdc++.h>
using namespace std;

class Table
{
    public:
        Table();
        virtual ~Table();
        void showTableData();
        void insertRow(map<string,string> row);
        vector<Column*> getColumnList();
        int getTotalRow();
        string getTableName();
        void deleteRow();
        Table(string Name,vector<Column*> columns);
        void deleteRow(map<string,string> condition);
        void updateRow(map<string,string> condition,map<string,string> value);
        void createIndex(string indexName,string columnName);
        void addIndexMapping(string);
        void selectRow(map<string,string>);
    protected:

    private:
        string Name;
        vector<Column*> columns;
        list<Row*> rows;
        map<int,Row*> rowMapping;
        int totalRow;
        int lastIndex;
        map<string,string> index;   //  column_name & index_name
        map<string,map<string,set<int>>> indexMapping;   // index_name    value and list of id
};

#endif // TABLE_H
