#ifndef DATABASE_H
#define DATABASE_H
#include"Table.h"
#include"Column.h"
#include<bits/stdc++.h>
using namespace std;

class Database
{
    public:
        Database();
        virtual ~Database();
        Database(string Name);
        map<string,Table*> getTableList();
        void createTable(string Name,vector<pair<string,string>> column);
        void deleteTable(string Name);
        void showTableName();

    protected:

    private:
        string Name;
        map<string,Table*> table;
};

#endif // DATABASE_H
