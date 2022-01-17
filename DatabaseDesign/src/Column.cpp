#include "Column.h"

Column::Column(string name,string datatype)
{
    this->name = name;
    this->datatype = datatype;
}

Column::Column() {
    //ctor
}
Column::~Column()
{
    //dtor
}


string Column::getColumnName() {
    return this->name;
}

string Column::getColumnDataType() {
    return this->datatype;
}

void Column::setColumnName() {
    this->name = name;
}

void Column::setColumnDataType() {
    this->datatype = datatype;
}
