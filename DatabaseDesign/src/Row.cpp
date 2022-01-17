#include "Row.h"

Row::Row()
{
    //ctor
}

Row::~Row()
{
    //dtor
}
Row::Row(int index,map<string,string> rowMap) {
    this->index = index;
    this->rowMap = rowMap;
}
int Row::getIndex() {
    return this->index;
}

map<string,string> Row::getRowMap() {
    return this->rowMap;
}
void Row::setRowMap(map<string,string> updated) {
    this->rowMap = updated;
}

