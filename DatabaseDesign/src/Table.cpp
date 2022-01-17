#include "Table.h"

Table::Table()
{
    //ctor
}

Table::~Table()
{
    //dtor
}

Table::Table(string Name,vector<Column*> columns) {
    this->Name = Name;
    this->columns = columns;
    totalRow = 0; lastIndex = 0;
}
string Table::getTableName() {
    return this->Name;
}
int Table::getTotalRow() {
    return this->totalRow;
}
vector<Column*> Table::getColumnList() {
    return this->columns;
}

void Table::insertRow(map<string,string> row) {
    Row *r1 = new Row(lastIndex+1,row);
    rowMapping[lastIndex+1] = r1;
    rows.push_back(r1);
    lastIndex++;
    totalRow++;
}

void Table::showTableData() {
    cout<<"***************************************"<<endl;
    for(int i=0;i<columns.size();i++) {
        cout<<columns[i]->getColumnName()<<" ";
    }
    cout<<endl;
    for(auto k:rows) {
        // cout<<k->getIndex()<<" ";
        map<string,string> mp = k->getRowMap();
        for(int i=0;i<columns.size();i++) {
            string name = columns[i]->getColumnName();
            if(mp.find(name)==mp.end()) cout<<"       ";
            else cout<<mp[name]<<" ";
        }
        cout<<endl;
    }
    cout<<"****************************************"<<endl;
}

void Table::selectRow(map<string,string> condition) {
    int cnt=0;
    if(condition.size() == 1 && index.find((*condition.begin()).first) == index.end() ) {
        auto it = indexMapping[(*condition.begin()).first][(*condition.begin()).second].begin();
        while(it!= indexMapping[(*condition.begin()).first][(*condition.begin()).second].end()) {
            Row *t3 = rowMapping[(*it)];
            map<string,string> mp = t3->getRowMap();
            for(auto k:mp) {
                cout<<"("<<k.first<<" "<<k.second<<")";
            }
            cout<<endl;
            cnt++;
        }
    }
    else {
        auto it = rows.begin();
        while(it!=rows.end()) {
            bool flag = true;
            map<string,string> mp = (*it)->getRowMap();
            for(auto k:condition) {
                if(mp[k.first] != k.second ) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                for(auto k1:mp) {
                    cout<<"("<<k1.first<<" "<<k1.second<<")";
                }
                cnt++;
            }
            else {
                ++it;
            }
        }
    }
    cout<<cnt<<" no of element selected"<<endl;
}
void Table::deleteRow(map<string,string> condition) {
    int cnt = 0;
    // if(condition.size() == 1 && index.find((*condition.begin()).first) == index.end() ) {
    //    auto it = indexMapping[(*condition.begin()).first][(*condition.begin()).second].begin();
    //    while(it!= indexMapping[(*condition.begin()).first][(*condition.begin()).second].end()) {
    //        Row *t3 = rowMapping[(*it)];
    //        rows.erase(t3);
    //        // cout<<*it<<" ";
    //    }
    //    indexMapping[(*condition.begin()).first][(*condition.begin()).second].clear();
    //}
    auto it = rows.begin();
    while(it!=rows.end()) {
        bool flag = true;
        map<string,string> mp = (*it)->getRowMap();
        for(auto k:condition) {
            if(mp[k.first] != k.second ) {
                flag = false;
                break;
            }
        }
        if(flag) {
            rows.erase(it++);
            cnt++;
        }
        else {
            ++it;
        }
    }
    cout<<cnt<<" rows has been deleted"<<endl;
}

void Table::updateRow(map<string,string> condition,map<string,string> value) {
    auto it = rows.begin();
    int cnt = 0;
    while(it!=rows.end()) {
        bool flag = true;
        map<string,string> mp = (*it)->getRowMap();
        for(auto k:condition) {
            if(mp[k.first] != k.second ) {
                flag = false;
                break;
            }
        }
        if(flag) {
            for(auto k:value) {
                mp[k.first] = k.second;
            }
            (*it)->setRowMap(mp);
            cnt++;
        }
        it++;
    }
    cout<<cnt<<" rows has been updated"<<endl;
}

void Table::addIndexMapping(string columnName) {
    auto it = rows.begin();
    while(it!=rows.end()) {
        map<string,string> mp = (*it)->getRowMap();
        indexMapping[columnName][mp[columnName]].insert((*it)->getIndex());
        ++it;
    }
}
void Table::createIndex(string indexName,string columnName) {
    if(index.find(columnName) == index.end()) {
        index[columnName] = indexName;
        addIndexMapping(columnName);
    }
    else {
        cout<<"Indexing already exist on this column"<<endl;
    }
}
