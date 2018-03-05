package com.example.irisreitsma.friendsr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // list for friends
    ArrayList<Friend> friends = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create friends and add them to list
        Friend friend1  = new Friend("Cheese", "Always look at the bright side of life.", R.drawable.cat1);
        Friend friend2  = new Friend("Kylo Ren", "Never skip chestday.", R.drawable.cat2);
        Friend friend3  = new Friend("Usain Bolt", "RUN!", R.drawable.cat3);
        Friend friend4  = new Friend("Aldebaran", "You're so, fcking, precious, when you, smile.", R.drawable.cat4);
        Friend friend5  = new Friend("Pterosaur", "He attac", R.drawable.cat5);
        Friend friend6  = new Friend("Pepperoni", "Pineapple does not go on pizza.", R.drawable.cat6);
        Friend friend7  = new Friend("Jacco", "A minute without food is a minute not lived.", R.drawable.cat7);
        Friend friend8  = new Friend("Pillow", "I'm a fluffy cloud", R.drawable.cat8);
        Friend friend9  = new Friend("Burrito", "He protec", R.drawable.cat9);
        Friend friend10 = new Friend("Bowlhaircat", "You can't see me.", R.drawable.cat12);
        friends.addAll(Arrays.asList(friend1, friend2, friend3, friend4, friend5, friend6, friend7, friend8, friend9, friend10));

        // instantiate adapter and listener and link them to gridview
        GridView gv = (GridView) findViewById(R.id.Gridview);
        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new GridItemClickListener());
    }

    private class GridItemClickListener implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Friend clickedFriend = (Friend) adapterView.getItemAtPosition(i);

            // pass information to next activity
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("clicked_friend", clickedFriend);
            startActivity(intent);
        }
    }
}
