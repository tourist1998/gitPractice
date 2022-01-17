#ifndef COLUMN_H
#define COLUMN_H
#include<bits/stdc++.h>
using namespace std;

class Column
{
    public:
        Column(string name,string datatype);
        string getColumnName();
        string getColumnDataType();
        void setColumnName();
        void setColumnDataType();
        Column();
        virtual ~Column();

    protected:

    private:
        string name,datatype;
};

#endif // COLUMN_H
