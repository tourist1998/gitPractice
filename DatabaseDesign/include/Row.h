#ifndef ROW_H
#define ROW_H
#include<bits/stdc++.h>
using namespace std;


class Row
{
    public:
        Row();
        virtual ~Row();
        Row(int index,map<string,string> rowMap);
        int getIndex();
        map<string,string> getRowMap();
        void setRowMap(map<string,string>);
    protected:

    private:
        int index;
        map<string,string> rowMap;
};

#endif // ROW_H
