package ManageImpl;

import Model.Contact;
import Model.SearchField;
import Model.SearchRequest;
import Model.SearchResponse;

import java.util.ArrayList;
import java.util.List;

public class ContactManage implements Manage.ContactManage {

    List<Contact> directory = new ArrayList<Contact>();

    @Override
    public boolean add(Contact contact) {
        System.out.println(contact.getFirstName());
        if(directory.contains(contact)) {
            return false;
        }
        directory.add(contact);
        return true;
    }

    @Override
    public boolean update(Contact contact) {
        if(directory.contains(contact)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getRequiredString(SearchRequest searchRequest,Contact contact) {
        String tomatch = searchRequest.getSearchField().toString();
        if(tomatch.equals("FIRST_NAME"))  {
            return contact.getFirstName();
        }
        else if(tomatch.equals("LAST_NAME")) {
            return contact.getLastName();
        }
        else return contact.getPhoneNumber();
    }


    @Override
    public SearchResponse search(SearchRequest searchRequest) {
        List<Contact> contactFound = new ArrayList<>();
        System.out.println(directory.get(0).getFirstName());
        for(int dir=0;dir<directory.size();dir++) {
            Contact contact = directory.get(dir);
            String match = getRequiredString(searchRequest,contact);
            System.out.println(match);
            if(searchRequest.getSearchType().equals("COMPLETE")) {
                if(match.equals(searchRequest.getInput())) {
                    contactFound.add(contact);
                }
            }
            else {
                for(int i=0;i<match.length();i++) {
                    if(match.substring(0,i).equals(searchRequest.getInput())) {
                        contactFound.add(contact);
                        break;
                    }
                }
            }
        }
        return new SearchResponse(contactFound.size(),contactFound);
    }
}
