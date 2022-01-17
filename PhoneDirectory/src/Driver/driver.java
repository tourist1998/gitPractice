package Driver;

import Manage.ContactManage;
import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Scan contact details
        ContactManage contactManage = new ManageImpl.ContactManage();
        int type = 1;
        while(type != 0) {
            type = sc.nextInt();

            if(type==1) {
                // add Contact
                Contact contact = new Contact(UUID.randomUUID().toString(), sc.next(), sc.next(), sc.next());
                contactManage.add(contact);
            }
            else if(type==2) {
                Contact contact = new Contact();

                contact.setFirstName(sc.next());
                contact.setLastName(sc.next());
                contact.setPhoneNumber(sc.next());

                contactManage.update(contact);
            }
            else if(type==3) {
                // search Contact
                SearchRequest searchRequest = new SearchRequest(SearchField.valueOf(sc.next()), SearchType.valueOf(sc.next()),sc.next());
                SearchResponse searchResponse = contactManage.search(searchRequest);
                List<Contact> list = searchResponse.getResults();
                for(int i=0;i<searchResponse.getTotalCount();i++) {
                    System.out.println(list.get(i).getFirstName()+" " +list.get(i).getLastName()+" "+list.get(i).getPhoneNumber());
                }
            }
        }
    }
}
