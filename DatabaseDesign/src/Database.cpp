#include "Database.h"

Database::Database()
{
    //ctor
}

Database::~Database()
{
    //dtor
}

Database::Database(string Name) {
    this->Name = Name;
}

void Database::showTableName() {
    for(auto k:table) {
        cout<<k.first<<" ";
        // vector<Column> v1 = k.second.getColumnList();
        // cout<<v1.size()<<" ";
        // for(int i=0;i<v1.size();i++) {
        //     cout<<v1[i].getColumnName()<<" ";
        // }
    }
    cout<<endl;
}

void Database::deleteTable(string Name) {
    table.erase(Name);
}

void Database::createTable(string Name,vector<pair<string,string>> column) {
    if(table.find(Name)==table.end()) {
        vector<Column*> columns;
        for(auto k:column) {
            Column *col = new Column(k.first,k.second);
            columns.push_back(col);
        }
        Table *t1 = new Table(Name,columns);
        table.emplace(Name,t1);
    }
    else {
        cout<<"Table already exists";
    }
}

map<string,Table*> Database::getTableList() {
    return this->table;
}
