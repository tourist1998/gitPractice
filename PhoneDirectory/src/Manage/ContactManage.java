package Manage;

import Model.Contact;
import Model.SearchRequest;
import Model.SearchResponse;

public interface ContactManage {

    boolean add(Contact contact);

    boolean update(Contact contact);

    SearchResponse search(SearchRequest searchRequest);
}
