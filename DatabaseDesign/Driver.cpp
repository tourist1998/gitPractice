#include<bits/stdc++.h>
using namespace std;
#include"Database.h"
int main() {
    ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0);

    // 1. Use Database
    // 2. Create Database
    Database *d1 = new Database();
    // Add table to database
    string className = "satya";

    vector<pair<string,string>> v1 = { {"Name","string"} , {"Roll","Int"} , {"School","String"} };
    d1->createTable(className,v1);
    d1->showTableName();
    map<string,string> m1 {{"Name","first"},{"Roll","4"}};
    d1->getTableList()["satya"]->insertRow(m1);
    m1["Name"] = "Shivam";
    d1->getTableList()["satya"]->insertRow(m1);
    d1->getTableList()["satya"]->showTableData();
    // map<string,string> conditon {{"Name","first"}};
    //d1->getTableList()["satya"]->deleteRow(m1);
    //d1->getTableList()["satya"]->showTableData();
    map<string,string> m2 {{"Name","Three"},{"Roll","6"}};
    d1->getTableList()["satya"]->updateRow(m1,m2);
    d1->getTableList()["satya"]->showTableData();

    return 0;
}
