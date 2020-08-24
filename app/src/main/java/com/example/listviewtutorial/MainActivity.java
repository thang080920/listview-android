package com.example.listviewtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContacts, this);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ContactModel contactModel = listContacts.get(i);
                Toast.makeText(MainActivity.this, contactModel.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initData() {
        ContactModel contact = new ContactModel("Nguyen Van A", "98378491", R.drawable.ic_u1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van B", "98378491", R.drawable.ic_u2);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van C", "98378491", R.drawable.ic_u3);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van D", "98378491", R.drawable.ic_u2);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van E", "98378491", R.drawable.ic_u4);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van F", "98378491", R.drawable.ic_u5);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van H", "98378491", R.drawable.ic_u2);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van I", "98378491", R.drawable.ic_u1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van U", "98378491", R.drawable.ic_u3);
        listContacts.add(contact);
    }
}